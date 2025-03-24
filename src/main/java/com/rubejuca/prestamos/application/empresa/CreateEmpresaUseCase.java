package com.rubejuca.prestamos.application.empresa;

import com.rubejuca.prestamos.domain.empresa.EmpresaService;
import com.rubejuca.prestamos.domain.empresa.model.Empresa;
import com.rubejuca.prestamos.domain.empresa.model.EmpresaId;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Slf4j
@Service
public class CreateEmpresaUseCase {

  private final EmpresaService empresaService;

  public CreateEmpresaUseCase(EmpresaService empresaService) {
    this.empresaService = empresaService;
  }

  public record Request(String nit, String nombre) {}

  public record Response(EmpresaId empresaId, String nit, String nombre) {}

  public Response execute(Request request) {
    log.info("Crear empresa {}", request);

    Empresa empresa = empresaService.create(request.nit, request.nombre);
    return new Response(empresa.empresaId(), empresa.getNit(), empresa.getNombre());
  }

}
