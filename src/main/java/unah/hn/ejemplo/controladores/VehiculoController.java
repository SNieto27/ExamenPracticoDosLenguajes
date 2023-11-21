package unah.hn.ejemplo.controladores;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import unah.hn.ejemplo.modelos.Vehiculo;
import unah.hn.ejemplo.servicios.impl.VehiculoServiceImpl;

@RestController
@RequestMapping("/api/vehiculos")
public class VehiculoController {
    
    @Autowired
    private VehiculoServiceImpl vehiculoServiceImpl;

    @PostMapping("/crear")
    public Vehiculo crearVehiculo(@RequestBody Vehiculo nuevoVehiculo){
        return this.vehiculoServiceImpl.crearVehiculo(nuevoVehiculo);
    }

    @GetMapping("/todos")
    public List<Vehiculo> obtenerTodos(){
        return this.vehiculoServiceImpl.obtenerTodos();
    }

}
