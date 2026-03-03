package com.example.orders.application.usecase.config;

import com.example.orders.application.usecase.ProductUseCase;
import com.example.orders.domain.ports.in.ProductInputPort;
import com.example.orders.domain.ports.out.ProductRepository;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("com.example.orders")
public class UseCaseConfig {

    @Bean
    public ProductInputPort productUseCase(
            ProductRepository productRepositoryPort
    ) {
        return new ProductUseCase(productRepositoryPort);
    }
}
