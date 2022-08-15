package com.bazar.spring.service.producto;

import com.bazar.spring.model.Producto;
import com.bazar.spring.repository.ProductoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductoServiceImpl implements ProductoService{
    @Autowired
    ProductoRepository productoRepository;
    @Override
    public List<Producto> listarProductos() {
        return productoRepository.findAll();
    }

    @Override
    public Producto productoById(Long id) throws Exception {
        return productoRepository.findById(id).orElse(null);
    }

    @Override
    public Producto crearProducto(Producto productonuevo) {
        Long idnuevo= calcularID();
        productonuevo.setIdproducto(idnuevo);
        return productoRepository.save(productonuevo);
    }

    @Override
    public String eliminarByID(Long id) {
        productoRepository.deleteById(id);
        return "Cliente Eliminado";
    }

    private Long calcularID() {
        List<Producto> listaProductos = productoRepository.findAll();
        Long tamanioLista= Long.valueOf(listaProductos.size());
        Long idnuevo=tamanioLista+1;
        return idnuevo;
    }


}
