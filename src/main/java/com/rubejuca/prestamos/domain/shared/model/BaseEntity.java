package com.rubejuca.prestamos.domain.shared.model;

import lombok.experimental.SuperBuilder;

import java.time.LocalDateTime;

@SuperBuilder
public abstract class BaseEntity {

  private LocalDateTime createdAt;
  private String createdBy;
  private LocalDateTime updatedAt;
  private String updatedBy;

}
