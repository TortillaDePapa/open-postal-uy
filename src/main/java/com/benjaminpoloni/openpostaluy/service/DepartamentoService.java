package com.benjaminpoloni.openpostaluy.service;


import com.benjaminpoloni.openpostaluy.model.Departamento;
import com.benjaminpoloni.openpostaluy.repository.DepartamentoRepository;
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
}
