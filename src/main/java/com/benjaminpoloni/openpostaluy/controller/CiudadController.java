package com.benjaminpoloni.openpostaluy.controller;


import com.benjaminpoloni.openpostaluy.model.Ciudad;
import com.benjaminpoloni.openpostaluy.service.CiudadService;
import jakarta.persistence.EntityNotFoundException;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
@RestController
@RequestMapping("/api/codigos-postales")
public class CiudadController {



    private final CiudadService ciudadService;

    public CiudadController(CiudadService ciudadService) {
        this.ciudadService = ciudadService;
    }

    @GetMapping("/ciudad-id")
    public ResponseEntity<?> ciudadId(@RequestParam Long id) {
        try{
            Ciudad ciudad = ciudadService.findById(id);
            return ResponseEntity.status(HttpStatus.OK).body(ciudad);
        }catch (EntityNotFoundException e){
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body(e.getMessage());
        }
    }

    @GetMapping("/ciudad-nombre")
    public ResponseEntity<?> ciudadNombre(@RequestParam String nombre) {
        try{
            Ciudad ciudad = ciudadService.findByNombre(nombre);
            return ResponseEntity.status(HttpStatus.OK).body(ciudad);
        }catch (EntityNotFoundException e){
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body(e.getMessage());
        }
    }

    @GetMapping("/ciudades")
    public ResponseEntity<?> ciudades(){
        try {
            List<Ciudad> ciudades = ciudadService.findAll();
            return ResponseEntity.status(HttpStatus.OK).body(ciudades);
        }catch (EntityNotFoundException e){
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body(e.getMessage());
        }
    }

}
