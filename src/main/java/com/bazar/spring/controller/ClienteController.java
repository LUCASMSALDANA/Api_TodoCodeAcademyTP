package com.bazar.spring.controller;

import com.bazar.spring.model.Cliente;
import com.bazar.spring.service.cliente.ClienteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("clientes")
public class ClienteController {
    @Autowired
    ClienteService clienteService;
    //localhost:8080/clientes
    @GetMapping("")
    public List<Cliente> listadeClientes(){
        return clienteService.listarClientes();
    }


}
