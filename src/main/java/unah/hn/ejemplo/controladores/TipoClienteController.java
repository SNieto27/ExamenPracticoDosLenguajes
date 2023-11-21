package unah.hn.ejemplo.controladores;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import unah.hn.ejemplo.modelos.TipoCliente;
import unah.hn.ejemplo.servicios.impl.TipoClienteServiceImpl;

public class TipoClienteController {
    
    @Autowired
    private TipoClienteServiceImpl tipoClienteServiceImpl;

    @PostMapping("/crear")
    public TipoCliente crearTipoCliente(@RequestBody TipoCliente nuevoTipoCliente) {      
        return this.tipoClienteServiceImpl.crearTipoCliente(nuevoTipoCliente);
    }

}
