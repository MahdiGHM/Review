package com.mahdigh.demo.controller;

import com.mahdigh.demo.dto.SaveCommentAndVoteOfProductRequestDTO;
import com.mahdigh.demo.service.ProductService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

/**
 * @author Mahdi Ghazimoradi
 * @since 4/10/2021
 */

@Controller
@RequestMapping("/product")
public class ProductController {

    private static final Logger logger = LoggerFactory.getLogger(ProductController.class);

    @Autowired
    private ProductService productService;

    @GetMapping("/get-products-by-category")
    public ResponseEntity<?> getProductsByCategory(@RequestParam Long categoryId) {
        try {
            return ResponseEntity.ok(productService.findAllProductsByCategoryId(categoryId));
        } catch (Exception e) {
            logger.error("getProductsByCategory: ",e);
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).build();
        }
    }

    @GetMapping("/get-comments-and-votes-of-product")
    public ResponseEntity<?> getCommentsAndVotesOfProduct(@RequestParam Long productId) {
        try {
            return ResponseEntity.ok(productService.getCommentsAndVotesOfProduct(productId));
        } catch (Exception e) {
            logger.error("getCommentsAndVotesOfProduct: ",e);
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).build();
        }
    }

    @PostMapping("/save-comment-and-vote-of-product")
    public ResponseEntity<?> saveCommentAndVoteOfProduct(@RequestBody SaveCommentAndVoteOfProductRequestDTO saveCommentAndVoteOfProductRequestDTO) {
        try {
            return ResponseEntity.ok(productService.saveCommentAndVoteOfProduct(saveCommentAndVoteOfProductRequestDTO));
        } catch (Exception e) {
            logger.error("saveCommentAndVoteOfProduct: ",e);
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).build();
        }
    }

}
