package com.benjaminpoloni.openpostaluy.controller;


import com.benjaminpoloni.openpostaluy.model.Departamento;
import com.benjaminpoloni.openpostaluy.repository.DepartamentoRepository;
import com.benjaminpoloni.openpostaluy.service.DepartamentoService;
import jakarta.persistence.EntityNotFoundException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/codigos-postales")
public class PostalController {
    private final DepartamentoService departamentoService;

    public PostalController(DepartamentoService departamentoService) {
        this.departamentoService = departamentoService;
    }

    @GetMapping("/departamento")
    public ResponseEntity<?> departamentoPorNombre(@RequestParam String nombre) {
        try {
            Departamento departamento = departamentoService.findByName(nombre);
            return ResponseEntity.ok(departamento);
        }catch (EntityNotFoundException e){
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body(e.getMessage());
        }
    }


}
