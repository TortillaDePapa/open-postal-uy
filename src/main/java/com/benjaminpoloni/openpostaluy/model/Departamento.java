package com.benjaminpoloni.openpostaluy.model;


import jakarta.persistence.*;
import lombok.Data;

import java.util.List;

@Entity
@Table(name="departamneto")
public class Departamento {


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public List<Ciudad> getCiudades() {
        return ciudades;
    }

    public void setCiudades(List<Ciudad> ciudades) {
        this.ciudades = ciudades;
    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nombre;


    @OneToMany(mappedBy = "departamento", cascade = CascadeType.ALL)
    private List<Ciudad> ciudades;
}
