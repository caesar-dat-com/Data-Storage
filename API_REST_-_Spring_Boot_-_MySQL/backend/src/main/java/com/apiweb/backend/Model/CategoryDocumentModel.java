package com.apiweb.backend.Model;

import javax.persistence.*;

@Entity
@Table(name = "Categoria_Documento")
@IdClass(CategoryDocumentId.class)
public class CategoryDocumentModel {

    @Id
    @ManyToOne
    @JoinColumn(name = "ID_categoria")
    private CategoryModel categoria;

    @Id
    @ManyToOne
    @JoinColumn(name = "ID_documento")
    private DocumentModel documento;

    // Getters and Setters

    public CategoryModel getCategoria() {
        return categoria;
    }

    public void setCategoria(CategoryModel categoria) {
        this.categoria = categoria;
    }

    public DocumentModel getDocumento() {
        return documento;
    }

    public void setDocumento(DocumentModel documento) {
        this.documento = documento;
    }
}
