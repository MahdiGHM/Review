package com.mahdigh.demo.service.impl;

import com.mahdigh.demo.enums.State;
import com.mahdigh.demo.model.Vote;
import com.mahdigh.demo.repository.VoteRepository;
import com.mahdigh.demo.service.VoteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author Mahdi Ghazimoradi
 * @since 4/10/2021
 */

@Service
public class VoteServiceImpl implements VoteService {

    @Autowired
    private VoteRepository voteRepository;

    @Override
    public Float getAverageVotesOfProduct(Long productId) {
        return voteRepository.getAverageVotesOfProduct(productId);
    }

    @Override
    public List<Vote> findAllByProductAndStateOrderByIdDesc(Long productId) {
        return voteRepository.findAllByProductAndState(productId, State.APPROVED);
    }

    @Override
    public void save(Vote vote) {
        voteRepository.save(vote);
    }
}
