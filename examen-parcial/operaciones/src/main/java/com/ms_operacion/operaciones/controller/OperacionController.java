package com.ms_operacion.operaciones.controller;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.tags.Tag;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import com.ms_operacion.operaciones.config.ApiRoutes;
import com.ms_operacion.operaciones.dto.OperacionDto;
import com.ms_operacion.operaciones.dto.RegistrarOperacionRequest;
import com.ms_operacion.operaciones.service.OperacionService;

@RestController
@RequestMapping(ApiRoutes.OPERACIONES)
@RequiredArgsConstructor
@Tag(name = "Operaciones", description = "Operaciones financieras")
public class OperacionController {

    private final OperacionService operacionService;

    @PostMapping(
            value = ApiRoutes.REGISTRAR,
            consumes = MediaType.APPLICATION_JSON_VALUE,
            produces = MediaType.APPLICATION_JSON_VALUE
    )
    @Operation(
            summary = "Registrar operación",
            description = "Registra una nueva operación con idCliente, tipoOperacion y total.",
            responses = {
                    @ApiResponse(
                            responseCode = "200",
                            description = "Operación registrada",
                            content = @Content(schema = @Schema(implementation = OperacionDto.class))
                    ),
                    @ApiResponse(
                            responseCode = "400",
                            description = "Datos inválidos",
                            content = @Content
                    ),
                    @ApiResponse(
                            responseCode = "500",
                            description = "Error interno del servidor",
                            content = @Content
                    )
            }
    )
    public OperacionDto registrar(@Valid @RequestBody RegistrarOperacionRequest request) {
        return operacionService.registrar(request);
    }
}
