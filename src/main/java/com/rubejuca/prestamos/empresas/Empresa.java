package com.rubejuca.prestamos.empresas;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Builder;
import lombok.Getter;

import java.time.OffsetDateTime;
import java.time.ZoneId;
import java.util.UUID;

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
    private OffsetDateTime createdAt;
    private String createdBy;
    private OffsetDateTime updatedAt;
    private String updatedBy;

    private Empresa(String id, String nit, String nombre) {
        this.id = id;
        this.nit = nit;
        this.nombre = nombre;
        this.createdAt = OffsetDateTime.now(ZoneId.of("UTC"));
        this.updatedAt = OffsetDateTime.now(ZoneId.of("UTC"));
    }

    public static Empresa of(String nit, String nombre) {
        // TODO Validar que nit y empresa no sean null ni vacio
        return new Empresa(UUID.randomUUID().toString(), nit, nombre);
    }

}
