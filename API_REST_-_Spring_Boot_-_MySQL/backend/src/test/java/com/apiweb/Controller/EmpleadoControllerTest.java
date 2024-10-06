import static org.mockito.Mockito.*;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import com.apiweb.backend.Controller.EmpleadoController;
import com.apiweb.backend.Model.EmpleadoModel;
import com.apiweb.backend.Service.IEmpleadoService;
import org.mockito.MockitoAnnotations;

public class EmpleadoControllerTest {

    // Inyección de dependencias simuladas
    @Mock
    private IEmpleadoService empleadoServiceMock;

    // Controlador que probaremos
    @InjectMocks
    private EmpleadoController empleadoController;

    public EmpleadoControllerTest() {
        // Inicializamos los mocks antes de ejecutar las pruebas
        MockitoAnnotations.openMocks(this);
        System.out.println("Mocks inicializados correctamente");
    }

    @Test
    public void testCrearEmpleado() {
        // Creamos el modelo de empleado
        EmpleadoModel empleado = new EmpleadoModel();
        empleado.setNombre("Juan");
        empleado.setApellidos("Perez");
        
        // Simulamos la respuesta del servicio
        when(empleadoServiceMock.guardarEmpleado(empleado)).thenReturn("Empleado creado correctamente");
        System.out.println("Servicio mock configurado para guardar empleado");

        // Llamamos al método del controlador
        ResponseEntity<String> response = empleadoController.crearEmpleado(empleado);
        
        // Verificamos que el controlador devuelve una respuesta con estado OK
        assertNotNull(response, "La respuesta no debería ser nula");
        assertEquals(HttpStatus.OK, response.getStatusCode(), "El estado HTTP debería ser OK");
        System.out.println("Controlador funcionó correctamente");

        // Verificamos el cuerpo de la respuesta
        assertEquals("Empleado creado correctamente", response.getBody(), "La respuesta del servicio es incorrecta");
        System.out.println("La respuesta del servicio fue: " + response.getBody());

        // Verificamos que el servicio se ejecutó correctamente
        verify(empleadoServiceMock, times(1)).guardarEmpleado(empleado);
        System.out.println("El servicio fue llamado correctamente");
    }

    @Test
    public void testCrearEmpleado_ErrorEnServicio() {
        // Creamos el modelo de empleado
        EmpleadoModel empleado = new EmpleadoModel();
        empleado.setNombre("Juan");
        empleado.setApellidos("Perez");
        
        // Simulamos que el servicio falla y lanza una excepción
        when(empleadoServiceMock.guardarEmpleado(empleado)).thenThrow(new RuntimeException("Error en el servicio"));
        System.out.println("Servicio mock configurado para lanzar excepción");

        // Llamamos al método del controlador y capturamos la excepción
        Exception exception = assertThrows(RuntimeException.class, () -> {
            empleadoController.crearEmpleado(empleado);
        });

        // Verificamos que la excepción fue lanzada
        assertEquals("Error en el servicio", exception.getMessage(), "El mensaje de error no coincide");
        System.out.println("Excepción capturada correctamente: " + exception.getMessage());
    }

    @Test
    public void testCrearEmpleado_ValidacionDeDatos() {
        // Creamos el modelo de empleado con datos incorrectos (nombre vacío)
        EmpleadoModel empleado = new EmpleadoModel();
        empleado.setNombre("");
        empleado.setApellidos("Perez");

        // Comprobamos si el controlador maneja la validación de datos
        ResponseEntity<String> response = empleadoController.crearEmpleado(empleado);

        // Verificamos que se devuelve un error de validación
        assertNotNull(response, "La respuesta no debería ser nula");
        assertEquals(HttpStatus.BAD_REQUEST, response.getStatusCode(), "Debería devolver un error de BAD_REQUEST para datos inválidos");
        System.out.println("Controlador manejó datos inválidos correctamente");

        // Verificamos que el servicio no fue llamado
        verify(empleadoServiceMock, times(0)).guardarEmpleado(empleado);
        System.out.println("El servicio no fue llamado debido a la validación de datos inválidos");
    }
}
