package com.rubejuca.prestamos.domain.inversion.model;

import com.rubejuca.prestamos.domain.shared.model.BaseId;

import java.util.UUID;

public record InversionId(String value) implements BaseId {

  static InversionId generate() {
    return new InversionId(UUID.randomUUID().toString());
  }

}
