package unah.hn.ejemplo.servicios.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import unah.hn.ejemplo.modelos.Cliente;
import unah.hn.ejemplo.repositorios.ClienteRepository;
import unah.hn.ejemplo.servicios.ClienteService;

public class ClienteServiceImpl implements ClienteService{

    @Autowired
    private ClienteRepository clienteRepository;

    @Override
    public Cliente crearCliente(Cliente cliente) {
        return clienteRepository.save(cliente);
    }

    @Override
    public List<Cliente> obtenerTodos() {
        return this.clienteRepository.findAll();
    }

    @Override
    public String eliminarCliente(int id) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'eliminarCliente'");
    }


    @Override
    public String actualizarCliente(int dni, Cliente cliente) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'actualizarCliente'");
    }
    
}
