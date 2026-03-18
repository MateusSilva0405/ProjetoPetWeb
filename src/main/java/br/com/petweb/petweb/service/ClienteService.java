package br.com.petweb.petweb.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.petweb.petweb.entity.Cliente;
import br.com.petweb.petweb.repository.ClienteRepository;

@Service
public class ClienteService {

    @Autowired
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

    // Método para excluir um cliente por ID
    public void deleteById(Integer id) {
        clienteRepository.deleteById(id);
    }

    // Método para encontrar um cliente por ID
    public Cliente findById(Integer id) {
        return clienteRepository.findById(id).orElse(null);
    }
}
