package com.mahdigh.demo.controller;

import com.mahdigh.demo.service.CategoryService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author Mahdi Ghazimoradi
 * @since 4/12/2021
 */

@Controller
@RequestMapping("/category")
public class CategoryController {

    private static final Logger logger = LoggerFactory.getLogger(CategoryController.class);

    @Autowired
    private CategoryService categoryService;

    @GetMapping("/get-categories")
    public ResponseEntity<?> getCategories() {
        try {
            return ResponseEntity.ok(categoryService.getCategories());
        } catch (Exception e) {
            logger.error("getCategories:",e);
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).build();
        }
    }

}
