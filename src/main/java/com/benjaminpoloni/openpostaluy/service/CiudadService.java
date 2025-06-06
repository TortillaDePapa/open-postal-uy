package com.benjaminpoloni.openpostaluy.service;


import com.benjaminpoloni.openpostaluy.model.Ciudad;
import com.benjaminpoloni.openpostaluy.repository.CiudadRepository;
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

}
