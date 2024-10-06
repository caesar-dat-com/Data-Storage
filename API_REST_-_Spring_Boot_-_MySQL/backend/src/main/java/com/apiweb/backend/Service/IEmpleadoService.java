package com.apiweb.backend.Service;

import com.apiweb.backend.Model.EmpleadoModel;

// Definimos la interfaz del servicio donde declaramos los métodos de la lógica de negocio relacionados con empleados
public interface IEmpleadoService {
    
    // Declaramos el método para guardar un empleado en la base de datos
    String guardarEmpleado(EmpleadoModel empleado);
    
    // Otros métodos de la lógica de negocio podrían ser agregados aquí
}
