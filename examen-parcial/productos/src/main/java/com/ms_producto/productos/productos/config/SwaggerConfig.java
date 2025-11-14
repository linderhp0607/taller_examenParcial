package com.ms_producto.productos.productos.config;
import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Info;
import org.springframework.context.annotation.Configuration;

@Configuration
@OpenAPIDefinition(
        info = @Info(
                title = "API - MS Producto",
                version = "1.0",
                description = "Producto - Actualizar Precio"
        )
)
public class SwaggerConfig {
    // Springdoc detecta automáticamente esta configuración
}