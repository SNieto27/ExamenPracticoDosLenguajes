package unah.hn.ejemplo.servicios.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import unah.hn.ejemplo.modelos.Vehiculo;
import unah.hn.ejemplo.repositorios.VehiculoRepository;
import unah.hn.ejemplo.servicios.VehiculoService;

public class VehiculoServiceImpl implements VehiculoService {

    @Autowired
    private VehiculoRepository vehiculoRepository;

    @Override
    public Vehiculo crearVehiculo(Vehiculo vehiculo) {
        return vehiculoRepository.save(vehiculo);
    }

    @Override
    public List<Vehiculo> obtenerTodos() {
        return this.vehiculoRepository.findAll();
    }

    @Override
    public String eliminarVehiculo(int id) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'eliminarVehiculo'");
    }


    @Override
    public String actualizarVehiculo(int dni, Vehiculo vehiculo) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'actualizarVehiculo'");
    }
    
}
