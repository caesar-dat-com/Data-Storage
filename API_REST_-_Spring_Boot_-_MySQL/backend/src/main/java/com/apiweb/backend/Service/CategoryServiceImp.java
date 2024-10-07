package com.apiweb.backend.Service;

import com.apiweb.backend.Model.CategoryModel;
import com.apiweb.backend.Repository.ICategoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CategoryServiceImp implements ICategoryService {

    @Autowired
    private ICategoryRepository categoryRepository;

    @Override
    public List<CategoryModel> getAllCategories() {
        return categoryRepository.findAll();
    }

    @Override
    public CategoryModel createCategory(CategoryModel categoryModel) {
        return categoryRepository.save(categoryModel);
    }

    @Override
    public CategoryModel getCategoryById(int id) {
        return categoryRepository.findById(id).orElse(null);
    }
}
