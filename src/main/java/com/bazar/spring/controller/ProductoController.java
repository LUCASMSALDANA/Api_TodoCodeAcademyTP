package com.bazar.spring.controller;

import com.bazar.spring.model.Cliente;
import com.bazar.spring.model.Producto;
import com.bazar.spring.service.producto.ProductoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("productos")
public class ProductoController {
    @Autowired
    ProductoService productoService;

    @GetMapping("")
    public List<Producto> listadeProductos(){
        return productoService.listarProductos();
    }

    @GetMapping("/{id}")
    public Producto productoByID(@PathVariable Long id) throws Exception {
        return productoService.productoById(id);
    }

    @PostMapping("/crear")
    public Producto crearProducto(@RequestBody Producto productonuevo){
        return productoService.crearProducto(productonuevo);
    }

    @DeleteMapping("/{id}")
    public String borrarProducto(@PathVariable Long id){
        return productoService.eliminarByID(id);
    }
}
