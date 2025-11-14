package com.ms_usuario.usuarios.service.impl;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;

import org.springframework.stereotype.Service;

import com.ms_usuario.usuarios.dto.LoginRequest;
import com.ms_usuario.usuarios.dto.UsuarioDto;
import com.ms_usuario.usuarios.entity.Usuario;
import com.ms_usuario.usuarios.exception.BusinessException;
import com.ms_usuario.usuarios.mapper.UsuarioMapper;
import com.ms_usuario.usuarios.repository.UsuarioRepository;
import com.ms_usuario.usuarios.service.UsuarioService;

@Slf4j
@Service
@RequiredArgsConstructor
public class UsuarioServiceImpl implements UsuarioService {

    private final UsuarioRepository usuarioRepository;

    @Override
    public UsuarioDto login(LoginRequest request) {

        log.info("Intentando login para el usuario: {}", request.getNombre());

        Usuario usuario = usuarioRepository.findByNombre(request.getNombre())
                .orElseThrow(() -> {
                    log.warn("Usuario no encontrado: {}", request.getNombre());
                    return new BusinessException("Usuario no encontrado");
                });

        if (!usuario.getClave().equals(request.getClave())) {
            log.warn("Clave incorrecta para usuario: {}", request.getNombre());
            throw new BusinessException("Clave incorrecta");
        }

        log.info("Login exitoso para usuario: {}", request.getNombre());
        return UsuarioMapper.toDto(usuario);
    }
}