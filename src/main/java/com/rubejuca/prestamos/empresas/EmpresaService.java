package com.rubejuca.prestamos.empresas;

import com.rubejuca.prestamos.infrastructure.persistence.EmpresasRepository;
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
