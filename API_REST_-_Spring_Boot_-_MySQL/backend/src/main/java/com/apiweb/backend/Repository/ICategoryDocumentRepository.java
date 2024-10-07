package com.apiweb.backend.Repository;

import com.apiweb.backend.Model.CategoryDocumentModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ICategoryDocumentRepository extends JpaRepository<CategoryDocumentModel, CategoryDocumentId> {
}
