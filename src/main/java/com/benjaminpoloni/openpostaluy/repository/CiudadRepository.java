package com.benjaminpoloni.openpostaluy.repository;

import com.benjaminpoloni.openpostaluy.model.Ciudad;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface CiudadRepository extends JpaRepository<Ciudad, Long> {

    Optional<Ciudad> findByNombreIgnoreCase(String nombre);
}
