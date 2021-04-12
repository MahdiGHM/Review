package com.mahdigh.demo.service;

import com.mahdigh.demo.model.Vote;

import java.util.List;

/**
 * @author Mahdi Ghazimoradi
 * @since 4/10/2021
 */

public interface VoteService {
    Float getAverageVotesOfProduct(Long productId);

    List<Vote> findAllByProductAndStateOrderByIdDesc(Long productId);

    void save(Vote vote);
}
