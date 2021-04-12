package com.mahdigh.demo.repository;

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
public interface ProductRepository extends CrudRepository<Product, Long> {
    @Query("from Product p join fetch p.provider where p.category.id = :categoryId")
    List<Product> findAllByCategory_Id(@Param("categoryId") Long categoryId);
}
