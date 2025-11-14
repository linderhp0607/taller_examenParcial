package com.ms_producto.productos.productos.service;

import com.ms_producto.productos.productos.dto.ActualizarPrecioRequest;
import com.ms_producto.productos.productos.dto.ProductoDto;

public interface ProductoService {
    ProductoDto actualizarPrecio(ActualizarPrecioRequest request);
}
