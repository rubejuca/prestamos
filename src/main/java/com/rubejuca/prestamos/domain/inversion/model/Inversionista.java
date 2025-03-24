package com.rubejuca.prestamos.domain.inversion.model;

import com.rubejuca.prestamos.domain.shared.model.BaseEntity;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.experimental.SuperBuilder;

@Getter
@SuperBuilder(toBuilder = true)
@Entity
@Table(name = "prestamista")
public class Inversionista extends BaseEntity {

  @Id
  private String id;
  private String documento;
  private String nombre;
  private String telefono;
  private String direccion;

  public InversionistaId prestamistaId() {
    return new InversionistaId(this.id);
  }


}
