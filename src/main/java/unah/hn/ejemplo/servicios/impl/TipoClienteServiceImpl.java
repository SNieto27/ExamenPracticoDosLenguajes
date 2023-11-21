package unah.hn.ejemplo.servicios.impl;

import org.springframework.beans.factory.annotation.Autowired;

import unah.hn.ejemplo.modelos.TipoCliente;
import unah.hn.ejemplo.repositorios.TipoClienteRepository;
import unah.hn.ejemplo.servicios.TipoClienteService;

public class TipoClienteServiceImpl implements TipoClienteService {

    @Autowired
    private TipoClienteRepository tipoClienteRepository;

    @Override
    public TipoCliente crearTipoCliente(TipoCliente tipoCliente) {
        return tipoClienteRepository.save(tipoCliente);
    }
    
}
