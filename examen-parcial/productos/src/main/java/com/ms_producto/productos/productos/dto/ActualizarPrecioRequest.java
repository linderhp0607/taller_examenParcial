package com.ms_producto.productos.productos.dto;

import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotNull;
import lombok.Data;

import java.math.BigDecimal;

@Data
public class ActualizarPrecioRequest {

    @NotNull(message = "El idProducto es obligatorio")
    private Long idProducto;

    @NotNull(message = "El nuevo precio es obligatorio")
    @Min(value = 0, message = "El precio debe ser mayor o igual a 0")
    private BigDecimal nuevoPrecio;
}
