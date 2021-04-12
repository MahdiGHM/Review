package com.mahdigh.demo.service.impl;

import com.mahdigh.demo.repository.ProviderRepository;
import com.mahdigh.demo.service.ProviderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author Mahdi Ghazimoradi
 * @since 4/10/2021
 */

@Service
public class ProviderServiceImpl implements ProviderService {

    @Autowired
    private ProviderRepository providerRepository;

}
