package unah.hn.ejemplo.servicios;

import java.util.List;

import unah.hn.ejemplo.modelos.Cliente;

public interface ClienteService {
    
    public Cliente crearCliente(Cliente cliente);

    public String eliminarCliente(int id);

    public List<Cliente> obtenerTodos();

    public String actualizarCliente(int dni, Cliente cliente );

}
