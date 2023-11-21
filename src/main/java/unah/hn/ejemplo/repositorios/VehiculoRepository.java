package unah.hn.ejemplo.repositorios;

import org.springframework.data.jpa.repository.JpaRepository;

import unah.hn.ejemplo.modelos.Vehiculo;

public interface VehiculoRepository extends JpaRepository<Vehiculo, Integer>{
    
}
