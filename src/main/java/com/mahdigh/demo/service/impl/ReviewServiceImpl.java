package com.mahdigh.demo.service.impl;

import com.mahdigh.demo.dto.CommentDTO;
import com.mahdigh.demo.dto.ProductDTO;
import com.mahdigh.demo.model.Product;
import com.mahdigh.demo.service.CommentService;
import com.mahdigh.demo.service.ReviewService;
import com.mahdigh.demo.service.VoteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

/**
 * @author Mahdi Ghazimoradi
 * @since 4/12/2021
 */

@Service
public class ReviewServiceImpl implements ReviewService {

    @Autowired
    private CommentService commentService;

    @Autowired
    private VoteService voteService;

    @Override
    public List<ProductDTO> getProductWithReviews(List<Product> products) {
        List<ProductDTO> productDTOS = new ArrayList<>();
        products.forEach(product -> {
            List<CommentDTO> commentDTOS = commentService.get3CommentsOfProduct(product).stream().map(comment -> new CommentDTO(comment.getContent(), comment.getWriter().getUsername())).collect(Collectors.toList());
            Float averageOfVotes = voteService.getAverageVotesOfProduct(product.getId());
            ProductDTO productDTO = new ProductDTO();
            productDTO.setAverageOfVotes(averageOfVotes);
            productDTO.setComments(commentDTOS);
            productDTO.setEnabledComment(product.getEnabledComment());
            productDTO.setEnabledPublicComment(product.getEnabledPublicComment());
            productDTO.setEnabledPublicVote(product.getEnabledPublicVote());
            productDTO.setEnabledVote(product.getEnabledVote());
            productDTO.setProductCode(product.getCode());
            productDTO.setProductDetails(product.getDetails());
            productDTO.setProductName(product.getName());
            productDTO.setProductPicture(product.getPicture());
            productDTO.setProviderCode(product.getProvider().getCode());
            productDTO.setProviderLogo(product.getProvider().getLogo());
            productDTO.setProviderName(product.getProvider().getName());
            productDTOS.add(productDTO);
        });
        return productDTOS;
    }

}
