package com.ms_operacion.operaciones.service.impl;

import org.springframework.stereotype.Service;

import com.ms_operacion.operaciones.dto.OperacionDto;
import com.ms_operacion.operaciones.dto.RegistrarOperacionRequest;
import com.ms_operacion.operaciones.entity.Operacion;
import com.ms_operacion.operaciones.mapper.OperacionMapper;
import com.ms_operacion.operaciones.repository.OperacionRepository;
import com.ms_operacion.operaciones.service.OperacionService;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@Service
@RequiredArgsConstructor
public class OperacionServiceImpl implements OperacionService {

    private final OperacionRepository operacionRepository;

    @Override
    public OperacionDto registrar(RegistrarOperacionRequest request) {

        log.info("Registrando operación. idCliente={}, tipoOperacion={}, total={}",
                request.getIdCliente(), request.getTipoOperacion(), request.getTotal());

        Operacion operacion = Operacion.builder()
                .idCliente(request.getIdCliente())
                .tipoOperacion(request.getTipoOperacion())
                .total(request.getTotal())
                .build();

        operacionRepository.save(operacion);

        log.info("Operación registrada. idOperacion={}", operacion.getIdOperacion());

        return OperacionMapper.toDto(operacion);
    }
}
