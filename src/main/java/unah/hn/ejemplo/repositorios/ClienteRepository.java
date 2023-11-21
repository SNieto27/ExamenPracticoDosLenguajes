package unah.hn.ejemplo.repositorios;

import org.springframework.data.jpa.repository.JpaRepository;

import unah.hn.ejemplo.modelos.Cliente;

public interface ClienteRepository extends JpaRepository<Cliente, Integer> {
    
}
