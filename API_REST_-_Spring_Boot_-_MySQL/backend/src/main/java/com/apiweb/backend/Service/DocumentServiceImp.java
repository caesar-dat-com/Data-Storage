package com.apiweb.backend.Service;

import com.apiweb.backend.Model.DocumentModel;
import com.apiweb.backend.Repository.IDocumentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DocumentServiceImp implements IDocumentService {

    @Autowired
    private IDocumentRepository documentRepository;

    @Override
    public List<DocumentModel> getAllDocuments() {
        return documentRepository.findAll();
    }

    @Override
    public DocumentModel createDocument(DocumentModel documentModel) {
        return documentRepository.save(documentModel);
    }

    @Override
    public DocumentModel getDocumentById(int id) {
        return documentRepository.findById(id).orElse(null);
    }
}
