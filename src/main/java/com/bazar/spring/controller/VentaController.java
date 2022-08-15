package com.bazar.spring.controller;

import com.bazar.spring.service.venta.VentaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("ventas")
public class VentaController {
    @Autowired
    VentaService ventaService;
}
