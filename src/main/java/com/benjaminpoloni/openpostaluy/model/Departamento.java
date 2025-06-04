package com.benjaminpoloni.openpostaluy.model;


import jakarta.persistence.*;

import java.util.List;

@Entity
@Table(name="departamneto")
public class Departamento {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nombre;


    @OneToMany(mappedBy = "departamento", cascade = CascadeType.ALL)
    private List<Ciudad> ciudades;
}
