package com.benjaminpoloni.openpostaluy.model;


import jakarta.persistence.*;

import java.util.List;

@Entity
@Table(name = "ciudad")
public class Ciudad {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nombre;

    @ManyToOne
    @JoinColumn(name = "departamento_id")
    private Departamento departamento;

    @OneToMany(mappedBy = "ciudad", cascade = CascadeType.ALL)
    private List<CodigoPostal> codigosPostales;
}
