package com.mahdigh.demo.service.impl;

import com.mahdigh.demo.repository.ProductManagerRepository;
import com.mahdigh.demo.service.ProductManagerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author Mahdi Ghazimoradi
 * @since 4/10/2021
 */

@Service
public class ProductManagerServiceImpl implements ProductManagerService {

    @Autowired
    private ProductManagerRepository productManagerRepository;

}
