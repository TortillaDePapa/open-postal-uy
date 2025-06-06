package com.benjaminpoloni.openpostaluy.model;


import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import jakarta.persistence.*;
import lombok.Data;

import java.util.List;

@Entity
@Table(name = "ciudad")
public class Ciudad {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nombre;

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

    public Departamento getDepartamento() {
        return departamento;
    }

    public void setDepartamento(Departamento departamento) {
        this.departamento = departamento;
    }

    public List<CodigoPostal> getCodigosPostales() {
        return codigosPostales;
    }

    public void setCodigosPostales(List<CodigoPostal> codigosPostales) {
        this.codigosPostales = codigosPostales;
    }

    @ManyToOne
    @JoinColumn(name = "departamento_id")
    @JsonBackReference
    private Departamento departamento;

    @OneToMany(mappedBy = "ciudad", cascade = CascadeType.ALL)
    @JsonManagedReference
    private List<CodigoPostal> codigosPostales;
}
