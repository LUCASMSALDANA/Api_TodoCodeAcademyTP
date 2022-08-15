package com.bazar.spring.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name ="CLIENTE")
public class Cliente {
    @Id
    @Column(name = "IDCLIENTE")
    private Long idcliente;

    @Column(name ="NOMBRE")
    private String nombre;

    @Column(name ="APELLIDO")
    private String apellido;

    @Column(name = "DNI")
    private String dni;

    public Cliente() {
    }

    public Cliente(Long idcliente, String nombre, String apellido, String dni) {
        this.idcliente = idcliente;
        this.nombre = nombre;
        this.apellido = apellido;
        this.dni = dni;
    }

    public Long getIdcliente() {
        return idcliente;
    }

    public void setIdcliente(Long idcliente) {
        this.idcliente = idcliente;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }
}
