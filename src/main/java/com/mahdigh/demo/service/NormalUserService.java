package com.mahdigh.demo.service;

import com.mahdigh.demo.model.NormalUser;

import java.util.Optional;

/**
 * @author Mahdi Ghazimoradi
 * @since 4/10/2021
 */

public interface NormalUserService {
    Optional<NormalUser> findByUsername(String username);
}
