package com.bazar.spring.service.producto;

import com.bazar.spring.model.Producto;

import java.util.List;

public interface ProductoService {
    List<Producto> listarProductos();

    Producto productoById(Long id) throws Exception;

    Producto crearProducto(Producto productonuevo);

    String eliminarByID(Long id);
}
