package com.mahdigh.demo.service.impl;

import com.mahdigh.demo.enums.State;
import com.mahdigh.demo.model.Comment;
import com.mahdigh.demo.model.Product;
import com.mahdigh.demo.repository.CommentRepository;
import com.mahdigh.demo.service.CommentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author Mahdi Ghazimoradi
 * @since 4/10/2021
 */

@Service
public class CommentServiceImpl implements CommentService {

    @Autowired
    private CommentRepository commentRepository;

    @Override
    public List<Comment> get3CommentsOfProduct(Product product) {
        return commentRepository.findTop3CommentsOfProduct(product.getId(), State.APPROVED);
    }

    @Override
    public List<Comment> findAllByProductAndStateOrderByIdDesc(Long productId) {
        return commentRepository.findAllByProductAndState(productId, State.APPROVED);
    }

    @Override
    public void save(Comment comment) {
        commentRepository.save(comment);
    }

}
