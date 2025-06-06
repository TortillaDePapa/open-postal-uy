package com.benjaminpoloni.openpostaluy.mapper;

import com.benjaminpoloni.openpostaluy.dto.DepartamentoDto;
import com.benjaminpoloni.openpostaluy.model.Departamento;
import org.mapstruct.Mapper;


public class DepartamentoMapper {

    public static DepartamentoDto toDto(Departamento departamento) {
        if (departamento == null) {
            return null;
        }

        DepartamentoDto departamentoDto = new DepartamentoDto();
        departamentoDto.setId(departamento.getId());
        departamentoDto.setNombre(departamento.getNombre());

        if (departamento.getCiudades() != null) {
            departamentoDto.setCiuad(departamento.getCiudades());
        }
        return departamentoDto;
    }


    public static Departamento toEntity(DepartamentoDto departamentoDto) {
        if (departamentoDto == null) {
            return null;
        }

        Departamento departamento = new Departamento();
        departamento.setId(departamentoDto.getId());
        departamento.setNombre(departamentoDto.getNombre());

        return departamento;
    }

}
