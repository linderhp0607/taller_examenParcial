package com.ms_producto.productos.productos.dto;
import lombok.Builder;
import lombok.Data;

import java.math.BigDecimal;

@Data
@Builder
public class ProductoDto {

    private Long idProducto;
    private String nombre;
    private BigDecimal precio;
}
