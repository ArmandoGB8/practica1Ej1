package com.p1.demo.service;

import org.springframework.stereotype.Service;
import java.util.HashSet;
import java.util.Set;

@Service
public class CerraduraService {

    public Set<String> calcularCerraduraEstrella(int n) {
        Set<String> conjunto = new HashSet<>();
        conjunto.add("");  // λ, cadena vacía
        generarConjuntos(n, "", conjunto);
        return conjunto;
    }

    public Set<String> calcularCerraduraPositiva(int n) {
        Set<String> conjunto = new HashSet<>();
        generarConjuntos(n, "", conjunto);
        return conjunto;
    }

    private void generarConjuntos(int n, String cadenaActual, Set<String> conjunto) {
        if (cadenaActual.length() < n) {
            conjunto.add(cadenaActual);
            generarConjuntos(n, cadenaActual + "0", conjunto);
            generarConjuntos(n, cadenaActual + "1", conjunto);
        }
    }
}

