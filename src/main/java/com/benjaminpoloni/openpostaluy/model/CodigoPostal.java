package com.benjaminpoloni.openpostaluy.model;


import jakarta.persistence.*;
import lombok.Data;

@Entity
@Table(name = "codigopostal")
public class CodigoPostal {
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getCodigoPostal() {
        return codigoPostal;
    }

    public void setCodigoPostal(String codigoPostal) {
        this.codigoPostal = codigoPostal;
    }

    public Ciudad getCiudad() {
        return ciudad;
    }

    public void setCiudad(Ciudad ciudad) {
        this.ciudad = ciudad;
    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String codigoPostal;

    @ManyToOne
    @JoinColumn(name = "ciudad_id")
    private Ciudad ciudad;

}
