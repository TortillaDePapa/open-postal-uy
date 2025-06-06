package com.benjaminpoloni.openpostaluy.dto;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class CodigoPostalDto {
    private Long id;
    private String codigoPostal;
    private String ciudad;
}