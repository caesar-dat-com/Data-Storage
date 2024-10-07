package com.apiweb.backend.Model;

import javax.persistence.*;

@Entity
@Table(name = "Categoria")
public class CategoryModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int ID_categoria;

    @Column(nullable = false, length = 100)
    private String Nombre_de_categoria;

    // Getters and Setters

    public int getID_categoria() {
        return ID_categoria;
    }

    public void setID_categoria(int ID_categoria) {
        this.ID_categoria = ID_categoria;
    }

    public String getNombre_de_categoria() {
        return Nombre_de_categoria;
    }

    public void setNombre_de_categoria(String nombre_de_categoria) {
        this.Nombre_de_categoria = nombre_de_categoria;
    }
}
