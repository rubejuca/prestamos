package com.rubejuca.prestamos.domain.prestamo.model;

import com.rubejuca.prestamos.domain.cliente.model.ClienteId;
import com.rubejuca.prestamos.domain.empresa.model.EmpresaId;
import com.rubejuca.prestamos.domain.inversion.model.InversionistaId;
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
@Table(name = "prestamo")
public class Prestamo extends BaseEntity {

  @Id
  private String id;
  private NumeroLibranza numeroLibranza;
  private LocalDate fecha;
  private EmpresaId empresaId;
  private ClienteId clienteId;
  private BigDecimal capital;
  private Float porcentaje;
  private Integer cuotas;
  private BigDecimal cuota;
  private BigDecimal totalIntereses;
  private TipoCuota tipoCuota;
  private Status estado;

  public enum Status {

    CREADA,
    PROGRESO,
    TERMINADA

  }
}
