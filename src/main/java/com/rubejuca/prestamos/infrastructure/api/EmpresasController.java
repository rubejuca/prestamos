package com.rubejuca.prestamos.infrastructure.api;

import com.rubejuca.prestamos.empresas.Empresa;
import com.rubejuca.prestamos.empresas.EmpresaService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EmpresasController {

    private final EmpresaService empresaService;

    public EmpresasController(EmpresaService empresaService) {
        this.empresaService = empresaService;
    }

    @PostMapping("/api/empresas")
    public CreateEmpresaResponse create(@RequestBody CreateEmpresaRequest request) {
        Empresa empresa = empresaService.create(request.nit(), request.nombre());
        return new CreateEmpresaResponse(empresa.getId(), empresa.getNit(), empresa.getNombre());
    }
}
