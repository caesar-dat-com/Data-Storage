package com.apiweb.backend.Model;

// Importaciones necesarias para trabajar con JPA y Lombok
import com.apiweb.backend.Model.ENUM.Sexo; // Importación del enum Sexo que define los valores posibles
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Enumerated;
import jakarta.persistence.EnumType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

// La anotación @Entity indica que esta clase es una entidad de JPA, es decir, que representa una tabla en la base de datos
@Entity
// La anotación @Table define el nombre de la tabla en la base de datos, en este caso "empleado"
@Table(name = "empleado")
// La anotación @Data de Lombok genera automáticamente getters, setters, toString, hashCode, equals, etc.
@Data
// La anotación @AllArgsConstructor de Lombok genera un constructor con todos los campos de la clase
@AllArgsConstructor
// La anotación @NoArgsConstructor de Lombok genera un constructor sin parámetros
@NoArgsConstructor
public class EmpleadoModel {

    // La anotación @Id indica que este campo es la clave primaria de la tabla
    @Id
    // Campo que representa el identificador del empleado
    private Integer idEmpleado;

    // Campo que representa el nombre del empleado
    private String nombre;

    // Campo que representa los apellidos del empleado
    private String apellidos;

    // La anotación @Column especifica el nombre de la columna en la tabla, en este caso "sexo"
    @Column(name = "sexo")
    // La anotación @Enumerated indica que este campo es un enum y se almacenará como una cadena en la base de datos
    @Enumerated(EnumType.STRING)
    // Campo que representa el sexo del empleado, utilizando el enum Sexo
    private Sexo sexo;

    // Campo que representa la edad del empleado
    private Integer edad;
}
