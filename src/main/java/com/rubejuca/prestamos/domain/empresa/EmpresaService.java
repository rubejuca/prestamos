package com.rubejuca.prestamos.domain.empresa;

import com.rubejuca.prestamos.domain.empresa.model.Empresa;
import com.rubejuca.prestamos.domain.empresa.model.EmpresaId;
import com.rubejuca.prestamos.domain.shared.errors.EntityNotFoundError;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.List;

@Slf4j
@Service
public class EmpresaService {

    private final EmpresaRepository empresaRepository;

    public EmpresaService(EmpresaRepository empresaRepository) {
        this.empresaRepository = empresaRepository;
    }

    public Empresa create(String nit, String name) {
        log.debug("create: {} {}", nit, name);

        Empresa empresa = Empresa.of(nit, name);
        return empresaRepository.save(empresa);
    }

    public Empresa read(EmpresaId id) {
        return empresaRepository.findById(id.value())
            .orElseThrow(() -> EntityNotFoundError.of("Empresa", id));
    }

    public List<Empresa> readAll() {
        return empresaRepository.findAll();
    }

    public Empresa update(EmpresaId id, String nit, String name) {
        log.debug("update: {} {} {}", id, nit, name);

        return empresaRepository.findById(id.value())
            .map(empresa -> empresa.update(nit, name))
            .orElseThrow(() -> EntityNotFoundError.of("Empresa", id));
    }

    public void delete(EmpresaId id) {
        log.debug("delete: {}", id);

        empresaRepository.deleteById(id.value());
    }
}
