package com.rubejuca.prestamos.domain.cliente.model;

import com.rubejuca.prestamos.domain.shared.model.BaseId;

import java.util.UUID;

public record ClienteId(String value) implements BaseId {

  static ClienteId generate() {
    return new ClienteId(UUID.randomUUID().toString());
  }

}
