package com.apiweb.backend.Model;

import javax.persistence.*;

@Entity
@Table(name = "Autor")
public class AuthorModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idAutor;

    @Column(nullable = false, length = 50)
    private String nombre;

    @Column(nullable = false, length = 50)
    private String apellido;

    @ManyToOne
    @JoinColumn(name = "ID_documento")
    private DocumentModel documento;

    // Getters and Setters

    public Long getIdAutor() {
        return idAutor;
    }

    public void setIdAutor(Long idAutor) {
        this.idAutor = idAutor;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public DocumentModel getDocumento() {
        return documento;
    }

    public void setDocumento(DocumentModel documento) {
        this.documento = documento;
    }
}
