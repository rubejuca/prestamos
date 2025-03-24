package com.rubejuca.prestamos.domain.empresa.model;

import com.rubejuca.prestamos.domain.shared.model.BaseEntity;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.*;
import lombok.experimental.SuperBuilder;

import java.time.LocalDateTime;

@Getter
@SuperBuilder(toBuilder = true)
@Entity
@Table(name = "inversionista")
public class Empresa extends BaseEntity {

    @Id
    private String id;
    private String nit;
    private String nombre;

    public EmpresaId empresaId() {
        return new EmpresaId(id);
    }

    public static Empresa of(String nit, String nombre) {
        return Empresa.builder()
                .id(EmpresaId.generate().value())
                .nit(nit)
                .nombre(nombre)
                .createdAt(LocalDateTime.now())
                .build();
    }

    public Empresa update(String nit, String nombre) {
        return toBuilder()
            .nit(nit)
            .nombre(nombre)
            .updatedAt(LocalDateTime.now())
            .build();
    }
}
