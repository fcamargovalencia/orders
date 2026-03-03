package com.example.orders.infrastructure.out.repositories;

import com.example.orders.infrastructure.out.entities.Product;
import org.springframework.data.repository.reactive.ReactiveCrudRepository;
import reactor.core.publisher.Flux;

import java.math.BigDecimal;
import java.util.UUID;

public interface ProductR2dbcRepository extends
        ReactiveCrudRepository<Product, UUID> {

    Flux<Product> findByNameAndPrice(String name, BigDecimal price);
}
