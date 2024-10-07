package com.apiweb.backend.Controller;

import com.apiweb.backend.Model.DocumentModel;
import com.apiweb.backend.Service.IDocumentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/documentos")
public class DocumentController {

    @Autowired
    private IDocumentService documentService;

    @GetMapping
    public List<DocumentModel> getAllDocuments() {
        return documentService.getAllDocuments();
    }

    @PostMapping
    public ResponseEntity<DocumentModel> createDocument(@RequestBody DocumentModel documentModel) {
        DocumentModel newDocument = documentService.createDocument(documentModel);
        return ResponseEntity.ok(newDocument);
    }

    @GetMapping("/{id}")
    public ResponseEntity<DocumentModel> getDocumentById(@PathVariable int id) {
        DocumentModel document = documentService.getDocumentById(id);
        if (document != null) {
            return ResponseEntity.ok(document);
        } else {
            return ResponseEntity.notFound().build();
        }
    }
}
