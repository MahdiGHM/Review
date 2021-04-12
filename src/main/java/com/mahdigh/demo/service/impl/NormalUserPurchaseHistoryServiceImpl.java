package com.mahdigh.demo.service.impl;

import com.mahdigh.demo.model.NormalUser;
import com.mahdigh.demo.model.Product;
import com.mahdigh.demo.repository.NormalUserPurchaseHistoryRepository;
import com.mahdigh.demo.service.NormalUserPurchaseHistoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author Mahdi Ghazimoradi
 * @since 4/12/2021
 */

@Service
public class NormalUserPurchaseHistoryServiceImpl implements NormalUserPurchaseHistoryService {

    @Autowired
    private NormalUserPurchaseHistoryRepository normalUserPurchaseHistoryRepository;

    @Override
    public Boolean existsByBuyerAndProduct(NormalUser normalUser, Product product) {
        return normalUserPurchaseHistoryRepository.existsByBuyerAndProduct(normalUser, product);
    }
}
