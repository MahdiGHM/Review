package com.mahdigh.demo.service.impl;

import com.mahdigh.demo.model.NormalUser;
import com.mahdigh.demo.repository.NormalUserRepository;
import com.mahdigh.demo.service.NormalUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

/**
 * @author Mahdi Ghazimoradi
 * @since 4/10/2021
 */

@Service
public class NormalUserServiceImpl implements NormalUserService {

    @Autowired
    private NormalUserRepository normalUserRepository;

    @Override
    public Optional<NormalUser> findByUsername(String username) {
        return normalUserRepository.findByUsername(username);
    }
}
