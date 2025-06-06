package com.benjaminpoloni.openpostaluy.repository;

import com.benjaminpoloni.openpostaluy.model.Departamento;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface DepartamentoRepository extends JpaRepository<Departamento, Long> {

    Optional<Departamento> findByNombreIgnoreCase(String nombre);
}
