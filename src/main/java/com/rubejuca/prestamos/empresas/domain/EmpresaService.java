package com.rubejuca.prestamos.empresas.domain;

import com.rubejuca.prestamos.empresas.infrastructure.EmpresasRepository;
import org.springframework.stereotype.Service;

@Service
public class EmpresaService {

    private final EmpresasRepository empresasRepository;

    public EmpresaService(EmpresasRepository empresasRepository) {
        this.empresasRepository = empresasRepository;
    }

    public Empresa create(String nit, String nombre) {
        Empresa empresa = Empresa.of(nit, nombre);
        return empresasRepository.save(empresa);
    }

}
