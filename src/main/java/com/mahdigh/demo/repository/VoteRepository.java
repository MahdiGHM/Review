package com.mahdigh.demo.repository;

import com.mahdigh.demo.enums.State;
import com.mahdigh.demo.model.Comment;
import com.mahdigh.demo.model.Vote;
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
public interface VoteRepository extends CrudRepository<Vote, Long> {

    @Query(value = "select avg(v.number) from vote v where v.product_id = :productId", nativeQuery = true)
    Float getAverageVotesOfProduct(@Param("productId") Long productId);

    @Query(value = "select * from vote c join fetch writer w on (c.writer_id = w.normal_user_id) where c.product_id = :productId and c.state = :state order by c.comment_id desc", nativeQuery = true)
    List<Vote> findAllByProductAndState(@Param("productId") Long productId, @Param("state") State state); //newer votes are upper
}
