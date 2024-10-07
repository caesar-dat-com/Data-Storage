package com.apiweb.backend.Service;

import com.apiweb.backend.Model.CategoryModel;

import java.util.List;

public interface ICategoryService {
    List<CategoryModel> getAllCategories();
    CategoryModel createCategory(CategoryModel categoryModel);
    CategoryModel getCategoryById(int id);
}
