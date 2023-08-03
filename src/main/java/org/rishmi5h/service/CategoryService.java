package org.rishmi5h.service;

import org.rishmi5h.model.Category;
import org.springframework.validation.annotation.Validated;

@Validated
public interface CategoryService {

     Iterable<Category> getCategories();

     Category getCategory(String categoryId);
}
