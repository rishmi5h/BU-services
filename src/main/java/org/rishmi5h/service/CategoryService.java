package org.rishmi5h.service;

import org.rishmi5h.model.Category;
import org.springframework.validation.annotation.Validated;

import java.util.List;
import java.util.Optional;

@Validated
public interface CategoryService {

     List<Category> getCategories();

     Optional<Category> getCategory(Long categoryId);
}
