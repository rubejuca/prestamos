package com.rubejuca.prestamos.empresas.infrastructure;

import com.rubejuca.prestamos.empresas.domain.Empresa;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmpresasRepository extends JpaRepository<Empresa, String> {

}
