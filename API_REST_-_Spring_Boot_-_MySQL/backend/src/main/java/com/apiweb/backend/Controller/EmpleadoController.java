package com.apiweb.backend.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.apiweb.backend.Model.EmpleadoModel;
import com.apiweb.backend.Service.IEmpleadoService;

@RestController  // Marca esta clase como un controlador REST en Spring
@RequestMapping("/apiweb/v1/empleados")  // Define la ruta base para los endpoints de este controlador
public class EmpleadoController {

    @Autowired  // Inyección de dependencias para acceder al servicio de empleados
    IEmpleadoService empleadoService;

    // Definimos el método que maneja la solicitud POST para crear un nuevo empleado
    @PostMapping("/insertar")
    public ResponseEntity<String> crearEmpleado(@RequestBody EmpleadoModel empleado) {
        // Llama al servicio para guardar el empleado y retorna una respuesta HTTP con el mensaje
        return new ResponseEntity<>(empleadoService.guardarEmpleado(empleado), HttpStatus.OK);
    }
}
