package com.apiweb.backend.Model;

import javax.persistence.*;

@Entity
@Table(name = "Autor")
public class AuthorModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int ID_autor;

    @Column(nullable = false, length = 50)
    private String Nombre;

    @Column(nullable = false, length = 50)
    private String Apellido;

    @ManyToOne
    @JoinColumn(name = "ID_documento")
    private DocumentModel documento;

    // Getters and Setters

    public int getID_autor() {
        return ID_autor;
    }

    public void setID_autor(int ID_autor) {
        this.ID_autor = ID_autor;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String nombre) {
        this.Nombre = nombre;
    }

    public String getApellido() {
        return Apellido;
    }

    public void setApellido(String apellido) {
        this.Apellido = apellido;
    }

    public DocumentModel getDocumento() {
        return documento;
    }

    public void setDocumento(DocumentModel documento) {
        this.documento = documento;
    }
}
