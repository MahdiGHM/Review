package com.mahdigh.demo.service.impl;

import com.mahdigh.demo.dto.CategoryDTO;
import com.mahdigh.demo.model.Category;
import com.mahdigh.demo.repository.CategoryRepository;
import com.mahdigh.demo.service.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Mahdi Ghazimoradi
 * @since 4/10/2021
 */

@Service
public class CategoryServiceImpl implements CategoryService {

    @Autowired
    private CategoryRepository categoryRepository;

    @Override
    public List<CategoryDTO> getCategories() {
        List<CategoryDTO> categoryDTOS = new ArrayList<>();
        Iterable<Category> categories = categoryRepository.findAll();
        categories.forEach(category -> categoryDTOS.add(new CategoryDTO(category.getName(), category.getId(), category.getPicture())));
        return categoryDTOS;
    }

}
