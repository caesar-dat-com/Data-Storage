package com.apiweb.backend.Repository;

import com.apiweb.backend.Model.DocumentModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IDocumentRepository extends JpaRepository<DocumentModel, Integer> {
}
