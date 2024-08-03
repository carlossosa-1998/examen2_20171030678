package unah.examen2.lenguajes1700.creditos.controladores;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import unah.examen2.lenguajes1700.creditos.servicios.ClienteServicio;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;


@RestController
@RequestMapping("/api/cliente")
public class ClienteController {

    @Autowired
    private ClienteServicio clienteServicio;

    @PostMapping("/crear")
    public Cliente crearCliente(@RequestBody Cliente nvoCliente) {
        if(!this.clienteServicio.buscarPorDni(dni)){
            return this.clienteServicio.crearCliente(nvoCliente);
        }
        return null;
    }
    
}
