package com.benjaminpoloni.openpostaluy.repository;

import com.benjaminpoloni.openpostaluy.model.Ciudad;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CiudadRepository extends JpaRepository<Ciudad, Long> {
}
