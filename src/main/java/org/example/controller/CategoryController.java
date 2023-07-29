package org.example.controller;

import org.antlr.v4.runtime.misc.NotNull;
import org.example.model.Category;
import org.example.model.Product;
import org.example.service.CategoryService;
import org.example.service.ProductService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/categories")
public class CategoryController {

    private CategoryService categoryService;

    public CategoryController(CategoryService categoryService){
        this.categoryService = categoryService;
    }

    @GetMapping("/")
    public Iterable<Category> getCategories() {
        return categoryService.getCategories();
    }

    @GetMapping("/{categoryId}")
    public Category getCategory(@PathVariable String categoryId) {
        return categoryService.getCategory(categoryId);
    }

}
