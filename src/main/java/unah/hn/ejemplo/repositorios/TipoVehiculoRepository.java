package unah.hn.ejemplo.repositorios;

import org.springframework.data.jpa.repository.JpaRepository;

import unah.hn.ejemplo.modelos.TipoVehiculo;

public interface TipoVehiculoRepository extends JpaRepository<TipoVehiculo, Integer>{
    
}
