package com.mahdigh.demo.service.impl;

import com.mahdigh.demo.dto.*;
import com.mahdigh.demo.model.Comment;
import com.mahdigh.demo.model.NormalUser;
import com.mahdigh.demo.model.Product;
import com.mahdigh.demo.model.Vote;
import com.mahdigh.demo.repository.ProductRepository;
import com.mahdigh.demo.service.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

/**
 * @author Mahdi Ghazimoradi
 * @since 4/10/2021
 */

@Service
public class ProductServiceImpl implements ProductService {

    @Autowired
    private ProductRepository productRepository;

    @Autowired
    private ReviewService reviewService;

    @Autowired
    private CommentService commentService;

    @Autowired
    private VoteService voteService;

    @Autowired
    private NormalUserService normalUserService;

    @Autowired
    private NormalUserPurchaseHistoryService normalUserPurchaseHistoryService;

    @Override
    public List<ProductDTO> findAllProductsByCategoryId(Long categoryId) {
        List<Product> products = productRepository.findAllByCategory_Id(categoryId);
        return reviewService.getProductWithReviews(products);
    }

    @Override
    public List<CommentsAndVotesDTO> getCommentsAndVotesOfProduct(Long productId) {
        List<Comment> comments = commentService.findAllByProductAndStateOrderByIdDesc(productId);
        List<Vote> votes = voteService.findAllByProductAndStateOrderByIdDesc(productId);
        List<CommentsAndVotesDTO> commentsAndVotesDTOS = new ArrayList<>();
        // union of comment and vote of specific user and map to DTO
        comments.forEach(comment -> {
            CommentsAndVotesDTO commentsAndVotesDTO = new CommentsAndVotesDTO();
            commentsAndVotesDTO.setComment(comment.getContent());
            commentsAndVotesDTO.setWriterUsername(comment.getWriter().getUsername());
            Optional<Vote> optionalVote = votes.stream().filter(vote -> vote.getWriter().getUsername().equals(comment.getWriter().getUsername())).findFirst();
            if (optionalVote.isPresent()) {
                commentsAndVotesDTO.setVoteNumber(optionalVote.get().getNumber());
                votes.remove(optionalVote.get());
            }
            commentsAndVotesDTOS.add(commentsAndVotesDTO);
        });
        votes.forEach(vote -> {
            CommentsAndVotesDTO commentsAndVotesDTO = new CommentsAndVotesDTO();
            commentsAndVotesDTO.setWriterUsername(vote.getWriter().getUsername());
            commentsAndVotesDTO.setWriterUsername(vote.getWriter().getUsername());
            commentsAndVotesDTOS.add(commentsAndVotesDTO);
        });
        return commentsAndVotesDTOS;
    }

    @Override
    @Transactional
    public SaveCommentAndVoteOfProductResponseDTO saveCommentAndVoteOfProduct(SaveCommentAndVoteOfProductRequestDTO saveCommentAndVoteOfProductRequestDTO) {
        SaveCommentAndVoteOfProductResponseDTO saveCommentAndVoteOfProductResponseDTO = new SaveCommentAndVoteOfProductResponseDTO();
        Optional<NormalUser> optionalNormalUser = normalUserService.findByUsername(saveCommentAndVoteOfProductRequestDTO.getUsername());
        Optional<Product> optionalProduct = productRepository.findById(saveCommentAndVoteOfProductRequestDTO.getProductId());
        Boolean flag1 = false;
        Boolean flag2 = false;
        if (optionalProduct.isPresent() && optionalNormalUser.isPresent()) {
            Product product = optionalProduct.get();
            NormalUser normalUser = optionalNormalUser.get();
            Boolean bought = normalUserPurchaseHistoryService.existsByBuyerAndProduct(normalUser, product);
            if (product.getEnabled()) {
                if (saveCommentAndVoteOfProductRequestDTO.getComment() != null && product.getEnabledComment() && (product.getEnabledPublicComment() || bought)) {
                    Comment comment = new Comment();
                    comment.setContent(saveCommentAndVoteOfProductRequestDTO.getComment());
                    comment.setWriter(normalUser);
                    comment.setProduct(product);
                    commentService.save(comment);
                    flag1 = true;
                } else if (saveCommentAndVoteOfProductRequestDTO.getComment() == null) {
                    flag1 = true;
                }
                if (saveCommentAndVoteOfProductRequestDTO.getVote() != null && product.getEnabledVote() && (product.getEnabledPublicVote() || bought)) {
                    Vote vote = new Vote();
                    vote.setNumber(saveCommentAndVoteOfProductRequestDTO.getVote());
                    vote.setWriter(normalUser);
                    vote.setProduct(product);
                    voteService.save(vote);
                    flag2 = true;
                } else if (saveCommentAndVoteOfProductRequestDTO.getVote() == null) {
                    flag2 = true;
                }
            }
        }
        saveCommentAndVoteOfProductResponseDTO.setResponseMessage(flag1 && flag2 ? "OK" : "Not OK");
        return saveCommentAndVoteOfProductResponseDTO;
    }
}
