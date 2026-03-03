package com.example.orders.domain.ports.out;

import com.example.orders.domain.entities.ProductDomain;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

import java.util.UUID;

public interface ProductRepository {

    Flux<ProductDomain> findAll();

    Mono<ProductDomain> findById(UUID id);

    Mono<ProductDomain> createProduct(ProductDomain productDomain);
}
