package com.apiweb.backend.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.apiweb.backend.Model.EmpleadoModel;
import com.apiweb.backend.Repository.IEmpleadoRepository;

@Service  // Anotación que marca esta clase como un servicio de Spring
public class EmpleadoServiceImp implements IEmpleadoService {

    @Autowired  // Inyección de dependencias para acceder al repositorio de empleados
    IEmpleadoRepository empleadoRepository;

    @Override
    public String guardarEmpleado(EmpleadoModel empleado) {
        // Guardamos el empleado usando el repositorio y el método save()
        empleadoRepository.save(empleado);
        
        // Retornamos un mensaje de éxito, indicando que el empleado ha sido creado
        return "El empleado " + empleado.getNombre() + " " + empleado.getApellidos() + ", fue creado con éxito.";
    }
}
