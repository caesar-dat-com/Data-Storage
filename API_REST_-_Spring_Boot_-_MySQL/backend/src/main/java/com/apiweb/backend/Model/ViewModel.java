package com.apiweb.backend.Model;

import javax.persistence.*;
import java.sql.Timestamp;

@Entity
@Table(name = "Visualizacion")
public class ViewModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int ID_visualizacion;

    @ManyToOne
    @JoinColumn(name = "ID_documento")
    private DocumentModel documento;

    @ManyToOne
    @JoinColumn(name = "ID_usuario")
    private UserModel usuario;

    @Column(nullable = false)
    private Timestamp Fecha_de_visualizacion;

    // Getters and Setters

    public int getID_visualizacion() {
        return ID_visualizacion;
    }

    public void setID_visualizacion(int ID_visualizacion) {
        this.ID_visualizacion = ID_visualizacion;
    }

    public DocumentModel getDocumento() {
        return documento;
    }

    public void setDocumento(DocumentModel documento) {
        this.documento = documento;
    }

    public UserModel getUsuario() {
        return usuario;
    }

    public void setUsuario(UserModel usuario) {
        this.usuario = usuario;
    }

    public Timestamp getFecha_de_visualizacion() {
        return Fecha_de_visualizacion;
    }

    public void setFecha_de_visualizacion(Timestamp fecha_de_visualizacion) {
        this.Fecha_de_visualizacion = fecha_de_visualizacion;
    }
}
