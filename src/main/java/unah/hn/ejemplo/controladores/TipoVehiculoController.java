package unah.hn.ejemplo.controladores;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import unah.hn.ejemplo.modelos.TipoVehiculo;
import unah.hn.ejemplo.servicios.impl.TipoVehiculoServiceImpl;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;


@RestController
@RequestMapping("/api/tipovehiculos")
public class TipoVehiculoController {
    
    @Autowired
    private TipoVehiculoServiceImpl tipoVehiculoServiceImpl;

    @PostMapping("/crear")
    public TipoVehiculo crearTipoVehiculo(@RequestBody TipoVehiculo nuevoTipoVehiculo) {      
        return this.tipoVehiculoServiceImpl.crearTipoVehiculo(nuevoTipoVehiculo);
    }

}
