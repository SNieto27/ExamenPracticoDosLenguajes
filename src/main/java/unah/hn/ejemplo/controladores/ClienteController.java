package unah.hn.ejemplo.controladores;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import unah.hn.ejemplo.modelos.Cliente;
import unah.hn.ejemplo.servicios.impl.ClienteServiceImpl;

@RestController
@RequestMapping("/api/clientes")
public class ClienteController {
    
    @Autowired
    private ClienteServiceImpl clienteServiceImpl;

    @PostMapping("/crear")
    public Cliente crearCliente(@RequestBody Cliente nuevoCliente){
        return this.clienteServiceImpl.crearCliente(nuevoCliente);
    }

    @GetMapping("/todos")
    public List<Cliente> obtenerTodos(){
        return this.clienteServiceImpl.obtenerTodos();
    }

}
