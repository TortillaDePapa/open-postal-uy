package com.benjaminpoloni.openpostaluy.mapper;

import com.benjaminpoloni.openpostaluy.dto.DepartamentoDto;
import com.benjaminpoloni.openpostaluy.model.Departamento;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface DepartamentoMapper {

    Departamento toEntity(DepartamentoDto departamentoDto);


    DepartamentoDto toDto(Departamento departamento);
}
