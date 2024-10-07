package com.apiweb.backend.Model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "Usuarios")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class UsuarioModel {

    @Id
    private Integer idUsuario;

    @Column(nullable = false)
    private String nombre;

    @Column(nullable = false)
    private String apellido;

    @Column(name = "correo_electronico", unique = true, nullable = false)
    private String correoElectronico;

    @Column(name = "nombre_de_usuario", unique = true, nullable = false)
    private String nombreDeUsuario;

    @Column(nullable = false)
    private String contraseña;

    @Column(name = "ciudad_de_origen")
    private String ciudadDeOrigen;

    @Column(name = "departamento_de_origen")
    private String departamentoDeOrigen;

    @Column(name = "pregunta_secreta")
    private String preguntaSecreta;

    @Column(name = "respuesta_secreta")
    private String respuestaSecreta;
}
