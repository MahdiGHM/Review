package com.mahdigh.demo.service;

import com.mahdigh.demo.dto.ProductDTO;
import com.mahdigh.demo.model.Product;

import java.util.List;

/**
 * @author Mahdi Ghazimoradi
 * @since 4/12/2021
 */

public interface ReviewService {
    List<ProductDTO> getProductWithReviews(List<Product> products);
}
