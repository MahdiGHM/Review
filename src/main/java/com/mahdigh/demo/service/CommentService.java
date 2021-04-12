package com.mahdigh.demo.service;

import com.mahdigh.demo.model.Comment;
import com.mahdigh.demo.model.Product;

import java.util.List;

/**
 * @author Mahdi Ghazimoradi
 * @since 4/10/2021
 */

public interface CommentService {
    List<Comment> get3CommentsOfProduct(Product product);

    List<Comment> findAllByProductAndStateOrderByIdDesc(Long productId);

    void save(Comment comment);
}
