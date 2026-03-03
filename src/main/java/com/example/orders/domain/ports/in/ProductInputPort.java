package com.example.orders.domain.ports.in;

import com.example.orders.domain.entities.ProductDomain;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

import java.util.UUID;

public interface ProductInputPort {

    Flux<ProductDomain> findAll();

    Mono<ProductDomain> findById(UUID id);

    Mono<ProductDomain> createProduct(ProductDomain productDomain);
}
