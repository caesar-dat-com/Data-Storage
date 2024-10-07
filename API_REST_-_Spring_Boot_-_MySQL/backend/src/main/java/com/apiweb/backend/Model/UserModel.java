package com.apiweb.backend.Model;

import jakarta.persistence.*;

@Entity
@Table(name = "Usuarios")
public class UsuarioModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID_usuario")
    private Long id;

    @Column(name = "Nombre", nullable = false, length = 50)
    private String nombre;

    @Column(name = "Apellido", nullable = false, length = 50)
    private String apellido;

    @Column(name = "Correo_electronico", nullable = false, unique = true, length = 100)
    private String correoElectronico;

    @Column(name = "Nombre_de_usuario", nullable = false, unique = true, length = 50)
    private String nombreDeUsuario;

    @Column(name = "Contraseña", nullable = false, length = 100)
    private String contraseña;

    @Column(name = "Ciudad_de_origen", length = 50)
    private String ciudadDeOrigen;

    @Column(name = "Departamento_de_origen", length = 50)
    private String departamentoDeOrigen;

    @Column(name = "Pregunta_secreta", length = 255)
    private String preguntaSecreta;

    @Column(name = "Respuesta_secreta", length = 255)
    private String respuestaSecreta;

    // Getters y Setters

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
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

    public String getCorreoElectronico() {
        return correoElectronico;
    }

    public void setCorreoElectronico(String correoElectronico) {
        this.correoElectronico = correoElectronico;
    }

    public String getNombreDeUsuario() {
        return nombreDeUsuario;
    }

    public void setNombreDeUsuario(String nombreDeUsuario) {
        this.nombreDeUsuario = nombreDeUsuario;
    }

    public String getContraseña() {
        return contraseña;
    }

    public void setContraseña(String contraseña) {
        this.contraseña = contraseña;
    }

    public String getCiudadDeOrigen() {
        return ciudadDeOrigen;
    }

    public void setCiudadDeOrigen(String ciudadDeOrigen) {
        this.ciudadDeOrigen = ciudadDeOrigen;
    }

    public String getDepartamentoDeOrigen() {
        return departamentoDeOrigen;
    }

    public void setDepartamentoDeOrigen(String departamentoDeOrigen) {
        this.departamentoDeOrigen = departamentoDeOrigen;
    }

    public String getPreguntaSecreta() {
        return preguntaSecreta;
    }

    public void setPreguntaSecreta(String preguntaSecreta) {
        this.preguntaSecreta = preguntaSecreta;
    }

    public String getRespuestaSecreta() {
        return respuestaSecreta;
    }

    public void setRespuestaSecreta(String respuestaSecreta) {
        this.respuestaSecreta = respuestaSecreta;
    }
}
