package com.mahdigh.demo.repository;

import com.mahdigh.demo.model.NormalUser;
import com.mahdigh.demo.model.NormalUserPurchaseHistory;
import com.mahdigh.demo.model.Product;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.Optional;

/**
 * @author Mahdi Ghazimoradi
 * @since 4/12/2021
 */

@Repository
public interface NormalUserPurchaseHistoryRepository extends CrudRepository<NormalUserPurchaseHistory, Long> {
    Boolean existsByBuyerAndProduct(@Param("buyer") NormalUser buyer, @Param("product") Product product);
}
