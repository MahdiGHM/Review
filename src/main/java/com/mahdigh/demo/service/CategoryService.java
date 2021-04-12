package com.mahdigh.demo.service;

import com.mahdigh.demo.dto.CategoryDTO;

import java.util.List;

/**
 * @author Mahdi Ghazimoradi
 * @since 4/10/2021
 */

public interface CategoryService {
    List<CategoryDTO> getCategories();
}
