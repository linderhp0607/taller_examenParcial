package com.ms_operacion.operaciones.dto;

import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.Data;

import java.math.BigDecimal;

@Data
public class RegistrarOperacionRequest {

    @NotNull(message = "El idCliente es obligatorio")
    private Long idCliente;

    @NotBlank(message = "El tipoOperacion es obligatorio")
    private String tipoOperacion;

    @NotNull(message = "El total es obligatorio")
    @Min(value = 0, message = "El total debe ser mayor o igual a 0")
    private BigDecimal total;
}
