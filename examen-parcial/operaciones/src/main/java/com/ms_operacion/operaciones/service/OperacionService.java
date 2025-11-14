package com.ms_operacion.operaciones.service;

import com.ms_operacion.operaciones.dto.OperacionDto;
import com.ms_operacion.operaciones.dto.RegistrarOperacionRequest;

public interface OperacionService {

    OperacionDto registrar(RegistrarOperacionRequest request);
}
