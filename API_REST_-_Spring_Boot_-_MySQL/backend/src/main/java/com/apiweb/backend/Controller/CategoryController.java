package com.apiweb.backend.Controller;

import com.apiweb.backend.Model.CategoryModel;
import com.apiweb.backend.Service.ICategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/categorias")
public class CategoryController {

    @Autowired
    private ICategoryService categoryService;

    @GetMapping
    public List<CategoryModel> getAllCategories() {
        return categoryService.getAllCategories();
    }

    @PostMapping
    public ResponseEntity<CategoryModel> createCategory(@RequestBody CategoryModel categoryModel) {
        CategoryModel newCategory = categoryService.createCategory(categoryModel);
        return ResponseEntity.ok(newCategory);
    }

    @GetMapping("/{id}")
    public ResponseEntity<CategoryModel> getCategoryById(@PathVariable int id) {
        CategoryModel category = categoryService.getCategoryById(id);
        if (category != null) {
            return ResponseEntity.ok(category);
        } else {
            return ResponseEntity.notFound().build();
        }
    }
}
