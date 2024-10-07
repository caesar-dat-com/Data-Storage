package com.apiweb.backend.Model;

import javax.persistence.*;
import java.sql.Timestamp;

@Entity
@Table(name = "Valoracion")
public class RatingModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int ID_valoracion;

    @ManyToOne
    @JoinColumn(name = "ID_usuario")
    private UserModel usuario;

    @ManyToOne
    @JoinColumn(name = "ID_documento")
    private DocumentModel documento;

    @Column(nullable = false)
    private int Valor;

    @Column(nullable = false)
    private Timestamp Fecha_de_valoracion;

    // Getters and Setters

    public int getID_valoracion() {
        return ID_valoracion;
    }

    public void setID_valoracion(int ID_valoracion) {
        this.ID_valoracion = ID_valoracion;
    }

    public UserModel getUsuario() {
        return usuario;
    }

    public void setUsuario(UserModel usuario) {
        this.usuario = usuario;
    }

    public DocumentModel getDocumento() {
        return documento;
    }

    public void setDocumento(DocumentModel documento) {
        this.documento = documento;
    }

    public int getValor() {
        return Valor;
    }

    public void setValor(int valor) {
        this.Valor = valor;
    }

    public Timestamp getFecha_de_valoracion() {
        return Fecha_de_valoracion;
    }

    public void setFecha_de_valoracion(Timestamp fecha_de_valoracion) {
        this.Fecha_de_valoracion = fecha_de_valoracion;
    }
}
