package unah.hn.ejemplo.repositorios;

import org.springframework.data.jpa.repository.JpaRepository;

import unah.hn.ejemplo.modelos.TipoCliente;

public interface TipoClienteRepository extends JpaRepository<TipoCliente, Integer>{
    
}
