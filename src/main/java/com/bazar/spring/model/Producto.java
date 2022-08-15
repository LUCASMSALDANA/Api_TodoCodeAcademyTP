package com.bazar.spring.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "PRODUCTO")
public class Producto {
    @Id
    @Column(name="IDPRODUCTO")
    private Long idproducto;

    @Column(name ="NOMBRE")
    private String nombre;

    @Column(name = "MARCA")
    private String marca;

    @Column(name ="COSTO")
    private Double costo;

    @Column(name = "CANTIDAD")
    private Double cantidad;

    public Producto() {
    }

    public Producto(Long idproducto, String nombre, String marca, Double costo, Double cantidad) {
        this.idproducto = idproducto;
        this.nombre = nombre;
        this.marca = marca;
        this.costo = costo;
        this.cantidad = cantidad;
    }

    public Long getIdproducto() {
        return idproducto;
    }

    public void setIdproducto(Long idproducto) {
        this.idproducto = idproducto;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public Double getCosto() {
        return costo;
    }

    public void setCosto(Double costo) {
        this.costo = costo;
    }

    public Double getCantidad() {
        return cantidad;
    }

    public void setCantidad(Double cantidad) {
        this.cantidad = cantidad;
    }
}
