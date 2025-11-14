package com.ms_usuario.usuarios.dto;
import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class UsuarioDto {
    private String idUsuario;
    private String nombre;
}
