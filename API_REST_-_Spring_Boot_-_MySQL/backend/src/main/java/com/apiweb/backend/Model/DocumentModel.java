package com.apiweb.backend.Model;

import javax.persistence.*;
import java.sql.Timestamp;

@Entity
@Table(name = "Documentos")
public class DocumentModel {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int ID_documento;

    @Column(nullable = false, length = 250)
    private String Nombre_del_documento;

    @Column(columnDefinition = "TEXT")
    private String Descripcion;

    @Column(nullable = false)
    private Timestamp Fecha_de_publicacion;

    @Column(columnDefinition = "TEXT", nullable = false)
    private String URL;

    @Column(nullable = false)
    private boolean Visibilidad;

    // Getters and Setters

    public int getID_documento() {
        return ID_documento;
    }

    public void setID_documento(int ID_documento) {
        this.ID_documento = ID_documento;
    }

    public String getNombre_del_documento() {
        return Nombre_del_documento;
    }

    public void setNombre_del_documento(String nombre_del_documento) {
        this.Nombre_del_documento = nombre_del_documento;
    }

    public String getDescripcion() {
        return Descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.Descripcion = descripcion;
    }

    public Timestamp getFecha_de_publicacion() {
        return Fecha_de_publicacion;
    }

    public void setFecha_de_publicacion(Timestamp fecha_de_publicacion) {
        this.Fecha_de_publicacion = fecha_de_publicacion;
    }

    public String getURL() {
        return URL;
    }

    public void setURL(String URL) {
        this.URL = URL;
    }

    public boolean isVisibilidad() {
        return Visibilidad;
    }

    public void setVisibilidad(boolean visibilidad) {
        this.Visibilidad = visibilidad;
    }
}
