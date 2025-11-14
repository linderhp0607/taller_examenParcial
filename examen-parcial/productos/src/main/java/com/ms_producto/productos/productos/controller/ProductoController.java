package com.ms_producto.productos.productos.controller;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.tags.Tag;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import com.ms_producto.productos.productos.config.ApiRoutes;
import com.ms_producto.productos.productos.dto.ActualizarPrecioRequest;
import com.ms_producto.productos.productos.dto.ProductoDto;
import com.ms_producto.productos.productos.service.ProductoService;

@RestController
@RequestMapping(ApiRoutes.PRODUCTOS)
@RequiredArgsConstructor
@Tag(name = "Productos", description = "Operaciones relacionadas con Productos")
public class ProductoController {

    private final ProductoService productoService;
@PostMapping(
            value = ApiRoutes.ACTUALIZAR_PRECIO,
            consumes = MediaType.APPLICATION_JSON_VALUE,
            produces = MediaType.APPLICATION_JSON_VALUE
    )
    @Operation(
            summary = "Actualizar precio de un producto",
            description = "Actualiza el precio de un producto existente en PostgreSQL.",
            responses = {
                    @ApiResponse(
                            responseCode = "200",
                            description = "Precio actualizado correctamente",
                            content = @Content(schema = @Schema(implementation = ProductoDto.class))
                    ),
                    @ApiResponse(
                            responseCode = "400",
                            description = "Datos inválidos o producto no encontrado",
                            content = @Content(mediaType = "application/json")
                    ),
                    @ApiResponse(
                            responseCode = "500",
                            description = "Error interno del servidor",
                            content = @Content(mediaType = "application/json")
                    )
            }
    )
    public ProductoDto actualizarPrecio(@Valid @RequestBody ActualizarPrecioRequest request) {
        return productoService.actualizarPrecio(request);
    }
}
