package com.apiweb.backend.Model;

import javax.persistence.*;
import java.sql.Timestamp;

@Entity
@Table(name = "Descargas")
public class DownloadModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int ID_descarga;

    @ManyToOne
    @JoinColumn(name = "ID_documento")
    private DocumentModel documento;

    @ManyToOne
    @JoinColumn(name = "ID_usuario")
    private UserModel usuario;

    @Column(nullable = false)
    private Timestamp Fecha_de_descarga;

    // Getters and Setters

    public int getID_descarga() {
        return ID_descarga;
    }

    public void setID_descarga(int ID_descarga) {
        this.ID_descarga = ID_descarga;
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

    public Timestamp getFecha_de_descarga() {
        return Fecha_de_descarga;
    }

    public void setFecha_de_descarga(Timestamp fecha_de_descarga) {
        this.Fecha_de_descarga = fecha_de_descarga;
    }
}
