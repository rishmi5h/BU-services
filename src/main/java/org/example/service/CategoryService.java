package org.example.service;

import org.example.model.Category;
import org.springframework.validation.annotation.Validated;

@Validated
public interface CategoryService {

     Iterable<Category> getCategories();

     Category getCategory(String categoryId);
}
