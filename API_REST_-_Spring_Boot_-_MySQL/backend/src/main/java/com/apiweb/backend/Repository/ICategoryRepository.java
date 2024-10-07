package com.apiweb.backend.Repository;

import com.apiweb.backend.Model.CategoryModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ICategoryRepository extends JpaRepository<CategoryModel, Integer> {
}
