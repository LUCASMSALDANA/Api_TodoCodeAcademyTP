package com.bazar.spring.service.cliente;

import com.bazar.spring.model.Cliente;
import com.bazar.spring.repository.ClienteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ClienteServiceImpl implements ClienteService{

    @Autowired
    ClienteRepository clienteRepository;

    @Override
    public List<Cliente> listarClientes() {
        return clienteRepository.findAll();
    }
}
