package com.p1.demo.controller;

import com.example.cerradura.service.CerraduraService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Set;

@RestController
@RequestMapping("/api/cerradura")
public class CerraduraController {

    @Autowired
    private CerraduraService cerraduraService;

    @PutMapping("/estrella/{input}")
    public Set<String> obtenerCerraduraEstrella(@PathVariable int input) {
        return cerraduraService.calcularCerraduraEstrella(input);
    }

    @PutMapping("/positiva/{input}")
    public Set<String> obtenerCerraduraPositiva(@PathVariable int input) {
        return cerraduraService.calcularCerraduraPositiva(input);
    }
}

