package com.rubejuca.prestamos.domain.cliente.model;

import com.rubejuca.prestamos.domain.shared.model.BaseEntity;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.experimental.SuperBuilder;

@Getter
@SuperBuilder(toBuilder = true)
@Entity
@Table(name = "cliente")
public class Cliente extends BaseEntity {

  @Id
  private String id;
  private String documento;
  private String nombre;
  private String telefono;
  private String direccion;

  public ClienteId clienteId() {
    return new ClienteId(this.id);
  }


}
