package com.apiweb.backend.Model;

import javax.persistence.*;

@Entity
@Table(name = "Publica")
@IdClass(PublicaId.class)
public class PublicaModel {

    @Id
    @ManyToOne
    @JoinColumn(name = "ID_autor")
    private AuthorModel autor;

    @Id
    @ManyToOne
    @JoinColumn(name = "ID_documento")
    private DocumentModel documento;

    // Getters and Setters

    public AuthorModel getAutor() {
        return autor;
    }

    public void setAutor(AuthorModel autor) {
        this.autor = autor;
    }

    public DocumentModel getDocumento() {
        return documento;
    }

    public void setDocumento(DocumentModel documento) {
        this.documento = documento;
    }
}
