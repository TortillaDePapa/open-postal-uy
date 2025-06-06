package com.benjaminpoloni.openpostaluy.service;


import com.benjaminpoloni.openpostaluy.model.Ciudad;
import com.benjaminpoloni.openpostaluy.repository.CiudadRepository;
import jakarta.persistence.EntityNotFoundException;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class CiudadService {

    private final CiudadRepository ciudadRepository;

    public List<Ciudad> findAll() {
        return ciudadRepository.findAll();
    }

    public Ciudad findById(Long id) {
        return ciudadRepository.findById(id).orElseThrow(() -> new EntityNotFoundException("No existe ninguna ciudad con el id: " + id));
    }

    public Ciudad findByNombre(String name) {
        return ciudadRepository.findByNombreIgnoreCase(name).orElseThrow(()-> new EntityNotFoundException("No existe ninguna ciudad con nombre: "+name));
    }

}
