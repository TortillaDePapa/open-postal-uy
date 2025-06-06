package com.benjaminpoloni.openpostaluy.controller;


import com.benjaminpoloni.openpostaluy.model.Departamento;
import com.benjaminpoloni.openpostaluy.service.DepartamentoService;
import jakarta.persistence.EntityNotFoundException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/codigos-postales")
public class DepartamentoController {
    private final DepartamentoService departamentoService;

    public DepartamentoController(DepartamentoService departamentoService) {
        this.departamentoService = departamentoService;
    }

    @GetMapping("/departamento-nombre")
    public ResponseEntity<?> departamentoPorNombre(@RequestParam String nombre) {
        try {
            Departamento departamento = departamentoService.findByName(nombre);
            return ResponseEntity.ok(departamento);
        }catch (EntityNotFoundException e){
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body(e.getMessage());
        }
    }

    @GetMapping("/departamento-id")
    public ResponseEntity<?> departamentoPorId(@RequestParam Long id) {
        try {
            Departamento departamento = departamentoService.findById(id);
            return ResponseEntity.ok(departamento);
        }catch (EntityNotFoundException e){
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body(e.getMessage());
        }
    }

    @GetMapping("/departamentos")
    public ResponseEntity<?> departamentos() {
        try {
            List<Departamento> departamentos = departamentoService.findAll();
            return ResponseEntity.ok(departamentos);
        }catch (EntityNotFoundException e){
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body(e.getMessage());
        }
    }

}
