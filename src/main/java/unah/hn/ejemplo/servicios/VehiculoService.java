package unah.hn.ejemplo.servicios;

import java.util.List;

import unah.hn.ejemplo.modelos.Vehiculo;

public interface VehiculoService {
    
    public Vehiculo crearVehiculo(Vehiculo vehiculo);

    public String eliminarVehiculo(int id);

    public List<Vehiculo> obtenerTodos();

    public String actualizarVehiculo(int dni, Vehiculo vehiculo);

}
