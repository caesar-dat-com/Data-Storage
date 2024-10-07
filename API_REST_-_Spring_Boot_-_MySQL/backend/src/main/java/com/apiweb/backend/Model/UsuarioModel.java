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
    private Integer IDUsuario;

    @Column(nullable = false)
    private String Nombre;

    @Column(nullable = false)
    private String Apellido;

    @Column(name = "Correo_electronico", unique = true, nullable = false)
    private String CorreoElectronico;

    @Column(name = "Nombre_de_usuario", unique = true, nullable = false)
    private String NombreDeUsuario;

    @Column(nullable = false)
    private String Contraseña;

    @Column(name = "Ciudad_de_origen")
    private String CiudadDeOrigen;

    @Column(name = "Departamento_de_origen")
    private String DepartamentoDeOrigen;

    @Column(name = "Pregunta_secreta")
    private String PreguntaSecreta;

    @Column(name = "Respuesta_secreta")
    private String RespuestaSecreta;
}
