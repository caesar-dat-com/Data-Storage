package com.apiweb.backend.Model;

import javax.persistence.*;
import java.sql.Timestamp;

@Entity
@Table(name = "Comentario")
public class CommentModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int ID_comentario;

    @ManyToOne
    @JoinColumn(name = "ID_usuario")
    private UserModel usuario;

    @ManyToOne
    @JoinColumn(name = "ID_documento")
    private DocumentModel documento;

    @Column(columnDefinition = "TEXT", nullable = false)
    private String Texto_del_comentario;

    @Column(nullable = false)
    private Timestamp Fecha_de_publicacion;

    @ManyToOne
    @JoinColumn(name = "ID_comentario_padre")
    private CommentModel comentarioPadre;

    // Getters and Setters

    public int getID_comentario() {
        return ID_comentario;
    }

    public void setID_comentario(int ID_comentario) {
        this.ID_comentario = ID_comentario;
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

    public String getTexto_del_comentario() {
        return Texto_del_comentario;
    }

    public void setTexto_del_comentario(String texto_del_comentario) {
        this.Texto_del_comentario = texto_del_comentario;
    }

    public Timestamp getFecha_de_publicacion() {
        return Fecha_de_publicacion;
    }

    public void setFecha_de_publicacion(Timestamp fecha_de_publicacion) {
        this.Fecha_de_publicacion = fecha_de_publicacion;
    }

    public CommentModel getComentarioPadre() {
        return comentarioPadre;
    }

    public void setComentarioPadre(CommentModel comentarioPadre) {
        this.comentarioPadre = comentarioPadre;
    }
}
