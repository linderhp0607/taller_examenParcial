package com.ms_usuario.usuarios.dto;
import lombok.Data;

@Data
public class LoginRequest {
    private String nombre;
    private String clave;
}
