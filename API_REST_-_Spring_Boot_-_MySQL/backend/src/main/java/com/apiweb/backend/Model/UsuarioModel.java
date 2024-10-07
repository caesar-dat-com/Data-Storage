package com.apiweb.backend.Model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
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
    @GeneratedValue(strategy = GenerationType.IDENTITY) // Genera el ID automáticamente
    private Integer ID_usuario;

    @Column(nullable = false)
    private String Nombre;

    @Column(nullable = false)
    private String Apellido;

    @Column(name = "Correo_electronico", unique = true, nullable = false)
    private String Correo_electronico;

    @Column(name = "Nombre_de_usuario", unique = true, nullable = false)
    private String Nombre_de_usuario;

    @Column(nullable = false)
    private String Contraseña;

    @Column(name = "Ciudad_de_origen")
    private String Ciudad_de_origen;

    @Column(name = "Departamento_de_origen")
    private String Departamento_de_origen;

    @Column(name = "Pregunta_secreta")
    private String Pregunta_secreta;

    @Column(name = "Respuesta_secreta")
    private String Respuesta_secreta;
}
