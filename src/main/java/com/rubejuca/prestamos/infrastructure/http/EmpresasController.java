package com.rubejuca.prestamos.infrastructure.http;

import com.rubejuca.prestamos.domain.empresa.model.Empresa;
import com.rubejuca.prestamos.domain.empresa.EmpresaService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EmpresasController {

    private final EmpresaService empresaService;

    public EmpresasController(EmpresaService empresaService) {
        this.empresaService = empresaService;
    }

    public record CreateEmpresaRequest(String nit, String nombre) { }
    public record CreateEmpresaResponse(String id, String nit, String nombre) { }

    @PostMapping("/api/empresas")
    public CreateEmpresaResponse create(@RequestBody CreateEmpresaRequest request) {
        Empresa empresa = empresaService.create(request.nit(), request.nombre());
        return new CreateEmpresaResponse(empresa.getId(), empresa.getNit(), empresa.getNombre());
    }

}
