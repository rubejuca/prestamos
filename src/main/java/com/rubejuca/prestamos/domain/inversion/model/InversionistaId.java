package com.rubejuca.prestamos.domain.inversion.model;

import com.rubejuca.prestamos.domain.shared.model.BaseId;

import java.util.UUID;

public record InversionistaId(String value) implements BaseId {

  static InversionistaId generate() {
    return new InversionistaId(UUID.randomUUID().toString());
  }

}
