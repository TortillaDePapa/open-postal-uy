package com.benjaminpoloni.openpostaluy.model;


import jakarta.persistence.*;

@Entity
@Table(name = "codigopostal")
public class CodigoPostal {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String codigoPostal;

    @ManyToOne
    @JoinColumn(name = "ciudad_id")
    private Ciudad ciudad;

}
