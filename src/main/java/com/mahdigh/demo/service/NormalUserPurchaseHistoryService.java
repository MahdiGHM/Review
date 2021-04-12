package com.mahdigh.demo.service;

import com.mahdigh.demo.model.NormalUser;
import com.mahdigh.demo.model.Product;

/**
 * @author Mahdi Ghazimoradi
 * @since 4/12/2021
 */

public interface NormalUserPurchaseHistoryService {
    Boolean existsByBuyerAndProduct(NormalUser normalUser, Product product);
}
