package com.benjaminpoloni.openpostaluy.service;

import com.benjaminpoloni.openpostaluy.model.CodigoPostal;
import com.benjaminpoloni.openpostaluy.repository.CodigoPostalRepository;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class CodigoPostalService {

    private final CodigoPostalRepository codigoPostalRepository;


    public List<CodigoPostal> findAll() {
        return codigoPostalRepository.findAll();
    }

}
