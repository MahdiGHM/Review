package com.mahdigh.demo.repository;

import com.mahdigh.demo.enums.State;
import com.mahdigh.demo.model.Comment;
import com.mahdigh.demo.model.Product;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @author Mahdi Ghazimoradi
 * @since 4/10/2021
 */

@Repository
public interface CommentRepository extends CrudRepository<Comment, Long> {

    @Query(value = "select * from comment c join fetch writer w on (c.writer_id = w.normal_user_id) where c.product_id = :productId and c.state = :state order by c.comment_id desc limit 3", nativeQuery = true)
    List<Comment> findTop3CommentsOfProduct(@Param("productId") Long productId, @Param("state") State state); //newer comments are upper


    @Query(value = "select * from comment c join fetch writer w on (c.writer_id = w.normal_user_id) where c.product_id = :productId and c.state = :state order by c.comment_id desc", nativeQuery = true)
    List<Comment> findAllByProductAndState(@Param("productId") Long productId, @Param("state") State state); //newer comments are upper

}
