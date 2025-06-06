package com.benjaminpoloni.openpostaluy.mapper;

import com.benjaminpoloni.openpostaluy.dto.CiudadDto;
import com.benjaminpoloni.openpostaluy.model.Ciudad;


public class CiudadMapper {

    public static CiudadDto toDto(Ciudad ciudad){
        if(ciudad == null)
        {
            return null;
        }

        CiudadDto ciudadDto = new CiudadDto();
        ciudadDto.setId(ciudad.getId());
        ciudadDto.setNombre(ciudad.getNombre());

        if (ciudad.getDepartamento()!=null){
            ciudadDto.setDepartamento(ciudad.getDepartamento().getNombre());
        }
        return ciudadDto;
    }


    public static Ciudad toEntity(CiudadDto ciudadDto){
        if (ciudadDto == null){
            return null;
        }

        Ciudad ciudad = new Ciudad();
        ciudad.setId(ciudadDto.getId());
        ciudad.setNombre(ciudadDto.getNombre());

        return ciudad;
    }
}
