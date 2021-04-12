package com.mahdigh.demo.service;

import com.mahdigh.demo.dto.CommentsAndVotesDTO;
import com.mahdigh.demo.dto.ProductDTO;
import com.mahdigh.demo.dto.SaveCommentAndVoteOfProductRequestDTO;
import com.mahdigh.demo.dto.SaveCommentAndVoteOfProductResponseDTO;
import com.mahdigh.demo.model.Product;

import java.util.List;

/**
 * @author Mahdi Ghazimoradi
 * @since 4/10/2021
 */

public interface ProductService {
    List<ProductDTO> findAllProductsByCategoryId(Long categoryId);

    List<CommentsAndVotesDTO> getCommentsAndVotesOfProduct(Long productId);

    SaveCommentAndVoteOfProductResponseDTO saveCommentAndVoteOfProduct(SaveCommentAndVoteOfProductRequestDTO saveCommentAndVoteOfProductRequestDTO);
}
