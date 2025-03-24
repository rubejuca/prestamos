package com.rubejuca.prestamos.domain.empresa;

import com.rubejuca.prestamos.domain.empresa.model.Empresa;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmpresaRepository extends JpaRepository<Empresa, String> {

}
