package com.example.orders.infrastructure.config;


import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Contact;
import io.swagger.v3.oas.annotations.info.Info;
import org.springframework.context.annotation.Configuration;

@Configuration
@OpenAPIDefinition(
        info = @Info(
                title = "Orders API",
                description = "API for managing product orders with reactive programming",
                version = "1.0.0",
                contact = @Contact(
                        name = "API Support",
                        url = "https://example.com",
                        email = "support@example.com"
                )))
public class OpenApiConfig {
}

