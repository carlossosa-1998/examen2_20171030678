package unah.examen2.lenguajes1700.creditos.servicios;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

import unah.examen2.lenguajes1700.creditos.modelos.Cliente;
import unah.examen2.lenguajes1700.creditos.repositorios.ClienteRepositorio;

@Service
public class ClienteServicio {

    @Autowired
    private ClienteRepositorio clienteRepositorio;

    public Cliente crearCliente(@RequestBody Cliente nvoCliente){
        return this.clienteRepositorio.save(nvoCliente);
    }

    public boolean buscarPorDni(String dni){
        return this.clienteRepositorio.existById(dni);
    }
}
