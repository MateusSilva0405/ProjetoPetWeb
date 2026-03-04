package br.com.petweb.petweb.service;

import java.util.List;

import org.springframework.stereotype.Service;

import br.com.petweb.petweb.entity.Cliente;
import br.com.petweb.petweb.repository.ClienteRepository;

@Service
public class ClienteService {
    
    // Injeção de dependência do repositório de clientes
    private ClienteRepository clienteRepository;

    // Método para salvar um cliente
    public Cliente save(Cliente cliente) {
        return clienteRepository.save(cliente);
    }

    // Método para listar todos os clientes
    public List<Cliente> findAll() {
        return clienteRepository.findAll();
    }
}
