package unah.hn.ejemplo.repositorios;

import org.springframework.data.jpa.repository.JpaRepository;

import unah.hn.ejemplo.modelos.Reserva;

public interface ReservaRepository extends JpaRepository<Reserva, Integer>{
    
}
