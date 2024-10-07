package com.apiweb.backend.Service;

import com.apiweb.backend.Model.DocumentModel;

import java.util.List;

public interface IDocumentService {
    List<DocumentModel> getAllDocuments();
    DocumentModel createDocument(DocumentModel documentModel);
    DocumentModel getDocumentById(int id);
}