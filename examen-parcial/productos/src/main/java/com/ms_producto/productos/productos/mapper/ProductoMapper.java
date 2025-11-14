package com.ms_producto.productos.productos.mapper;

import com.ms_producto.productos.productos.dto.ProductoDto;
import com.ms_producto.productos.productos.entity.Producto;

public class ProductoMapper {
    public static ProductoDto toDto(Producto producto) {
        if (producto == null) return null;

        return ProductoDto.builder()
                .idProducto(producto.getIdProducto())
                .nombre(producto.getNombre())
                .precio(producto.getPrecio())
                .build();
    }
}
