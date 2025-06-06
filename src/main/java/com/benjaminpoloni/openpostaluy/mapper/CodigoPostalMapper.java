package com.benjaminpoloni.openpostaluy.mapper;

import com.benjaminpoloni.openpostaluy.dto.CodigoPostalDto;
import com.benjaminpoloni.openpostaluy.model.CodigoPostal;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;


public class CodigoPostalMapper {


    public static CodigoPostalDto toDto(CodigoPostal codigoPostal) {
        if (codigoPostal == null) {
            return null;
        }

        CodigoPostalDto codigoPostalDto = new CodigoPostalDto();
        codigoPostalDto.setId(codigoPostal.getId());
        if (codigoPostal.getCiudad()!=null) {
           codigoPostalDto.setCiudad(codigoPostal.getCiudad().getNombre());
        }
        return codigoPostalDto;
    }

    public static CodigoPostal toEntity(CodigoPostalDto codigoPostalDto) {
        if (codigoPostalDto == null) {
            return null;
        }

        CodigoPostal codigoPostal = new CodigoPostal();
        codigoPostal.setId(codigoPostalDto.getId());
        codigoPostal.setCodigoPostal(codigoPostalDto.getCodigoPostal());


        return codigoPostal;
    }

}