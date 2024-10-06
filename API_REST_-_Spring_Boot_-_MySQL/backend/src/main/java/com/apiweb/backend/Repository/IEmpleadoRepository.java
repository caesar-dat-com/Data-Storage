package com.apiweb.backend.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.apiweb.backend.Model.EmpleadoModel;

// Este repositorio hereda de JpaRepository y permite realizar operaciones CRUD sobre la entidad EmpleadoModel
public interface IEmpleadoRepository extends JpaRepository<EmpleadoModel, Integer> {

    // Aquí puedes agregar métodos de consulta personalizados, si es necesario
    // Ejemplo: Encontrar empleados por nombre
    // List<EmpleadoModel> findByNombre(String nombre);

}
