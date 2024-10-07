package com.apiweb.backend.Model;

import javax.persistence.*;

@Entity
@Table(name = "Respuesta")
public class ResponseModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int ID_respuesta;

    @ManyToOne
    @JoinColumn(name = "ID_comentario")
    private CommentModel comentario;

    @ManyToOne
    @JoinColumn(name = "ID_usuario")
    private UserModel usuario;

    @Column(columnDefinition = "TEXT", nullable = false)
    private String Texto_de_la_respuesta;

    // Getters and Setters

    public int getID_respuesta() {
        return ID_respuesta;
    }

    public void setID_respuesta(int ID_respuesta) {
        this.ID_respuesta = ID_respuesta;
    }

    public CommentModel getComentario() {
        return comentario;
    }

    public void setComentario(CommentModel comentario) {
        this.comentario = comentario;
    }

    public UserModel getUsuario() {
        return usuario;
    }

    public void setUsuario(UserModel usuario) {
        this.usuario = usuario;
    }

    public String getTexto_de_la_respuesta() {
        return Texto_de_la_respuesta;
    }

    public void setTexto_de_la_respuesta(String texto_de_la_respuesta) {
        this.Texto_de_la_respuesta = texto_de_la_respuesta;
    }
}
