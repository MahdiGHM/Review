package com.mahdigh.demo.repository;

import com.mahdigh.demo.model.NormalUser;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.Optional;

/**
 * @author Mahdi Ghazimoradi
 * @since 4/10/2021
 */

@Repository
public interface NormalUserRepository extends CrudRepository<NormalUser, Long> {
    Optional<NormalUser> findByUsername(@Param("username") String username);
}
