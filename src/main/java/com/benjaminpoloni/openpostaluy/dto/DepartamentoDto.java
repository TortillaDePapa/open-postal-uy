package com.benjaminpoloni.openpostaluy.dto;


import com.benjaminpoloni.openpostaluy.model.Ciudad;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class DepartamentoDto {
    private Long id;
    private String nombre;
    private List<Ciudad> ciuad;
}
