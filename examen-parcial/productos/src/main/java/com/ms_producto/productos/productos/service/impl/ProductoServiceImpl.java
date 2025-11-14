package com.ms_producto.productos.productos.service.impl;

import org.springframework.stereotype.Service;

import com.ms_producto.productos.productos.dto.ActualizarPrecioRequest;
import com.ms_producto.productos.productos.dto.ProductoDto;
import com.ms_producto.productos.productos.entity.Producto;
import com.ms_producto.productos.productos.exception.BusinessException;
import com.ms_producto.productos.productos.mapper.ProductoMapper;
import com.ms_producto.productos.productos.repository.ProductoRepository;
import com.ms_producto.productos.productos.service.ProductoService;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@Service
@RequiredArgsConstructor
public class ProductoServiceImpl implements ProductoService {

    private final ProductoRepository productoRepository;

    @Override
    public ProductoDto actualizarPrecio(ActualizarPrecioRequest request) {
log.info("Solicitud de actualización de precio. idProducto={}, nuevoPrecio={}",
                request.getIdProducto(), request.getNuevoPrecio());

        Producto producto = productoRepository.findById(request.getIdProducto())
                .orElseThrow(() -> {
                    log.warn("Producto no encontrado. idProducto={}", request.getIdProducto());
                    return new BusinessException("Producto no encontrado");
                });

        producto.setPrecio(request.getNuevoPrecio());
        productoRepository.save(producto);

        log.info("Precio actualizado correctamente. idProducto={}, precioActual={}",
                producto.getIdProducto(), producto.getPrecio());

        return ProductoMapper.toDto(producto);
    }
}

