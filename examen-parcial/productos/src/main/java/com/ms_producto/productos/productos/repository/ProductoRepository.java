package com.ms_producto.productos.productos.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ms_producto.productos.productos.entity.Producto;

@Repository
public interface ProductoRepository extends JpaRepository<Producto, Long> {
    // Por ahora usamos los métodos por defecto (findById, save, etc.)
}
