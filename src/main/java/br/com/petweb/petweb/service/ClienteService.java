package br.com.petweb.petweb.service;

import java.util.List;

import org.springframework.stereotype.Service;

import br.com.petweb.petweb.entity.Cliente;
import br.com.petweb.petweb.repository.ClienteRepository;

@Service
public class ClienteService {

    private ClienteRepository clienteRepository;

    public ClienteService(ClienteRepository clienteRepository){
        this.clienteRepository = clienteRepository;
    }

    public Cliente save(Cliente cliente){
        return clienteRepository.save(cliente);
    }

    public List<Cliente> findAll(){
        return clienteRepository.findAll();
    }
}
