package com.mahdigh.demo.repository;

import com.mahdigh.demo.model.Provider;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

/**
 * @author Mahdi Ghazimoradi
 * @since 4/10/2021
 */

@Repository
public interface ProviderRepository extends CrudRepository<Provider, Long> {
}
