package com.rubejuca.prestamos.infrastructure.persistence;

import com.rubejuca.prestamos.empresas.Empresa;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmpresasRepository extends JpaRepository<Empresa, String> {


}
