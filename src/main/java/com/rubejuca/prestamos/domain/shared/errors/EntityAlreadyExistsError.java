package com.rubejuca.prestamos.domain.shared.errors;

import com.rubejuca.prestamos.domain.shared.model.BaseId;

public class EntityAlreadyExistsError extends RuntimeException {

  public EntityAlreadyExistsError(String message) {
    super(message);
  }

  public static <T> EntityAlreadyExistsError of(String entity, BaseId id) {
    return new EntityAlreadyExistsError("Ya existe %s %s".formatted(entity, id));
  }


}
