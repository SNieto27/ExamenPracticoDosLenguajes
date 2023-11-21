package unah.hn.ejemplo.servicios.impl;

import org.springframework.beans.factory.annotation.Autowired;

import unah.hn.ejemplo.modelos.TipoVehiculo;
import unah.hn.ejemplo.repositorios.TipoVehiculoRepository;
import unah.hn.ejemplo.servicios.TipoVehiculoService;

public class TipoVehiculoServiceImpl implements TipoVehiculoService{

    @Autowired
    private TipoVehiculoRepository tipoVehiculoRepository;

    @Override
    public TipoVehiculo crearTipoVehiculo(TipoVehiculo tipoVehiculo) {
        return tipoVehiculoRepository.save(tipoVehiculo);
    }
    
}
