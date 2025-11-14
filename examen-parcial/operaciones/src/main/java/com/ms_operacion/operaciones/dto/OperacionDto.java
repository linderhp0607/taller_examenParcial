package com.ms_operacion.operaciones.dto;

import lombok.Builder;
import lombok.Data;

import java.math.BigDecimal;

@Data
@Builder
public class OperacionDto {

    private Long idOperacion;
    private Long idCliente;
    private String tipoOperacion;
    private BigDecimal total;
}
