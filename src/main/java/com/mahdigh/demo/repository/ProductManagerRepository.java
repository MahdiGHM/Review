package com.mahdigh.demo.repository;

import com.mahdigh.demo.model.ProductManager;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

/**
 * @author Mahdi Ghazimoradi
 * @since 4/10/2021
 */

@Repository
public interface ProductManagerRepository extends CrudRepository<ProductManager, Long> {
}
