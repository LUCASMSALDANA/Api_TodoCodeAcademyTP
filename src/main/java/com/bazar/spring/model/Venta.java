package com.bazar.spring.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.xml.crypto.Data;
import java.sql.Date;
import java.time.LocalDate;
import java.util.List;

@Entity
@Table(name = "VENTA")
public class Venta {

    @Id
    @Column(name ="IDVENTA")
    private Long idventa;

    @Column(name="FECHA")
    private Date fecha;

    @Column(name = "TOTAL")
    private Double tota;

    @Column(name = "IDPRODUCTO")
    private String listaproductos;

    @Column(name = "CANTIADPRODUCTO")
    private String cantidadproducto;

    @Column(name = "IDCLIENTE")
    private long  idcliente;
}
