package com.ms_usuario.usuarios.service;

import com.ms_usuario.usuarios.dto.LoginRequest;
import com.ms_usuario.usuarios.dto.UsuarioDto;

public interface UsuarioService {
    UsuarioDto login(LoginRequest request);
}
