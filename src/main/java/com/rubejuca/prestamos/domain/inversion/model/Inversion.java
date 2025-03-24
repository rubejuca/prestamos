package com.rubejuca.prestamos.domain.inversion.model;

import com.rubejuca.prestamos.domain.shared.model.BaseEntity;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.experimental.SuperBuilder;

import java.math.BigDecimal;
import java.time.LocalDate;

@Getter
@SuperBuilder(toBuilder = true)
@Entity
@Table(name = "inversion")
public class Inversion extends BaseEntity {

  @Id
  private String id;
  private LocalDate fecha;
  private InversionistaId inversionistaId;
  private BigDecimal valor;
  private Float porcentaje;
  private Integer plazos;
  private Status estado;

  public enum Status {

    CREADA,
    PROGRESO,
    TERMINADA

  }
}
