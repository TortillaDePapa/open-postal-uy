package com.benjaminpoloni.openpostaluy.service;


import com.benjaminpoloni.openpostaluy.model.Departamento;
import com.benjaminpoloni.openpostaluy.repository.DepartamentoRepository;
import jakarta.persistence.EntityNotFoundException;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class DepartamentoService {


    private final DepartamentoRepository departamentoRepository;

    public List<Departamento> findAll() {
        return departamentoRepository.findAll();
    }


    public Departamento findById(Long id) {
        return departamentoRepository.findById(id).orElseThrow(()->new EntityNotFoundException("No existe un departamendo con id:" + id));
    }

    public Departamento findByName(String nombre) {
        return departamentoRepository.findByNombreIgnoreCase(nombre).orElseThrow(()-> new EntityNotFoundException("No existe un departamento con nombre:" + nombre));
    }
}
