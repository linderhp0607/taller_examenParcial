package com.ms_usuario.usuarios.controller;


import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import com.ms_usuario.usuarios.config.ApiRoutes;
import com.ms_usuario.usuarios.dto.LoginRequest;
import com.ms_usuario.usuarios.dto.UsuarioDto;
import com.ms_usuario.usuarios.service.UsuarioService;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.http.MediaType;

@RestController
@RequestMapping(ApiRoutes.USUARIOS)
@RequiredArgsConstructor
@Tag(name = "Usuarios", description = "Operaciones relacionadas con Usuarios")
public class UsuarioController {

    private final UsuarioService usuarioService;

    @PostMapping(value = ApiRoutes.LOGIN,
                 consumes = MediaType.APPLICATION_JSON_VALUE,
                 produces = MediaType.APPLICATION_JSON_VALUE)
    @Operation(summary = "Login de usuario")
    public UsuarioDto login(@RequestBody LoginRequest request) {
        return usuarioService.login(request);
    }
}
