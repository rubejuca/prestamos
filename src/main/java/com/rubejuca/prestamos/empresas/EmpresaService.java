package com.rubejuca.prestamos.empresas;

import org.springframework.stereotype.Service;

@Service
public class EmpresaService {

    public Empresa create(String nit, String nombre) {
        return Empresa.of(nit, nombre);
    }

}
