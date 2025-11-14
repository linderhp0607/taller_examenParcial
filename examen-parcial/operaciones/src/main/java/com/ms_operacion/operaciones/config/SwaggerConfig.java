package com.ms_operacion.operaciones.config;
import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Info;
import org.springframework.context.annotation.Configuration;

@Configuration
@OpenAPIDefinition(
        info = @Info(
                title = "API - MS Operacion",
                version = "1.0",
                description = "Microservicio Operacion - Registro de operaciones con MySQL"
        )
)
public class SwaggerConfig {
}
