package com.ms_operacion.operaciones.mapper;

import com.ms_operacion.operaciones.dto.OperacionDto;
import com.ms_operacion.operaciones.entity.Operacion;

public class OperacionMapper {
    public static OperacionDto toDto(Operacion operacion) {
        if (operacion == null) return null;

        return OperacionDto.builder()
                .idOperacion(operacion.getIdOperacion())
                .idCliente(operacion.getIdCliente())
                .tipoOperacion(operacion.getTipoOperacion())
                .total(operacion.getTotal())
                .build();
    }
}
