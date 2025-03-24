package com.rubejuca.prestamos.domain.empresa.model;

import com.rubejuca.prestamos.domain.shared.model.BaseId;

import java.util.UUID;

public record EmpresaId(String value) implements BaseId {

  static EmpresaId generate() {
    return new EmpresaId(UUID.randomUUID().toString());
  }

}
