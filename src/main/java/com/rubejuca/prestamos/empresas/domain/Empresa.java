package com.rubejuca.prestamos.empresas.domain;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;
import java.util.UUID;

@AllArgsConstructor
@NoArgsConstructor
@Builder
@Getter
@Entity
@Table(name = "empresa")
public class Empresa {

    @Id
    private String id;
    private String nit;
    private String nombre;
    // campos de auditoria
    private LocalDateTime createdAt;
    private String createdBy;
    private LocalDateTime updatedAt;
    private String updatedBy;

    public static Empresa of(String nit, String nombre) {
        return Empresa.builder()
                .id(UUID.randomUUID().toString())
                .nit(nit)
                .nombre(nombre)
                .createdAt(LocalDateTime.now())
                .build();
    }

}
