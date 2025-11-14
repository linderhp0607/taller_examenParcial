package com.ms_operacion.operaciones.entity;

import jakarta.persistence.*;
import lombok.*;

import java.math.BigDecimal;

@Entity
@Table(name = "operacion")
@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Operacion {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_operacion")
    private Long idOperacion;

    @Column(name = "id_cliente", nullable = false)
    private Long idCliente;

    @Column(name = "tipo_operacion", nullable = false, length = 50)
    private String tipoOperacion;

    @Column(name = "total", nullable = false)
    private BigDecimal total;
}
