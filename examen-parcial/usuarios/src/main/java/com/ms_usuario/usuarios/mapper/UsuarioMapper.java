package com.ms_usuario.usuarios.mapper;

import com.ms_usuario.usuarios.dto.UsuarioDto;
import com.ms_usuario.usuarios.entity.Usuario;

public class UsuarioMapper {
    public static UsuarioDto toDto(Usuario usuario) {
        if (usuario == null) return null;

        return UsuarioDto.builder()
                .idUsuario(usuario.getIdUsuario())
                .nombre(usuario.getNombre())
                .build();
    }
}
