package com.ms_operacion.operaciones.repository;

import com.ms_operacion.operaciones.entity.Operacion;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OperacionRepository extends JpaRepository<Operacion, Long> {
}
