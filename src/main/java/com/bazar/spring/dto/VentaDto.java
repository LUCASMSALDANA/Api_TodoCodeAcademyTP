package com.bazar.spring.dto;

import com.bazar.spring.model.Cliente;
import com.bazar.spring.model.Producto;

import java.time.LocalDate;
import java.util.List;

public class VentaDto {

    private Long idventa;
    private LocalDate fechaVenta;
    private double total;
    private List<Producto> listaProductos;
    private int[] cantidad;
    private Cliente cliente;

    public VentaDto() {
    }

    public Long getIdventa() {
        return idventa;
    }

    public void setIdventa(Long idventa) {
        this.idventa = idventa;
    }

    public LocalDate getFechaVenta() {
        return fechaVenta;
    }

    public void setFechaVenta(LocalDate fechaVenta) {
        this.fechaVenta = fechaVenta;
    }

    public double getTotal() {
        return total;
    }

    public void setTotal(double total) {
        this.total = total;
    }

    public List<Producto> getListaProductos() {
        return listaProductos;
    }

    public void setListaProductos(List<Producto> listaProductos) {
        this.listaProductos = listaProductos;
    }

    public int[] getCantidad() {
        return cantidad;
    }

    public void setCantidad(int[] cantidad) {
        this.cantidad = cantidad;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public VentaDto(Long idventa, LocalDate fechaVenta, double total, List<Producto> listaProductos, int[] cantidad, Cliente cliente) {
        this.idventa = idventa;
        this.fechaVenta = fechaVenta;
        this.total = total;
        this.listaProductos = listaProductos;
        this.cantidad = cantidad;
        this.cliente = cliente;


    }
}
