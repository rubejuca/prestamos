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
@Table(name = "inversion_pago")
public class InversionPago extends BaseEntity {

  @Id
  private String id;
  private LocalDate fecha;
  private InversionId inversionId;
  private BigDecimal capital;
  private BigDecimal intereses;
  private BigDecimal total;
  private FormaPago formaPago;

  public enum FormaPago {
    EFECTIVO,
    TRANSFERENCIA,
    CHEQUE
  }
}
