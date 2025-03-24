package com.rubejuca.prestamos.domain.shared.errors;

import com.rubejuca.prestamos.domain.shared.model.BaseId;

public class EntityNotFoundError extends RuntimeException {

  public EntityNotFoundError(String message) {
    super(message);
  }

  public static <T> EntityNotFoundError of(String entity, BaseId id) {
    return new EntityNotFoundError("No existe %s %s".formatted(entity, id));
  }

}
