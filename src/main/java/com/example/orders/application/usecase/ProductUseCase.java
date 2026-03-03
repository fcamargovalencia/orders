package com.example.orders.application.usecase;

import com.example.orders.domain.entities.ProductDomain;
import com.example.orders.domain.ports.in.ProductInputPort;
import com.example.orders.domain.ports.out.ProductRepository;
import lombok.RequiredArgsConstructor;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

import java.util.UUID;

@RequiredArgsConstructor
public class ProductUseCase implements ProductInputPort {

    private final ProductRepository productRepository;


    @Override
    public Flux<ProductDomain> findAll() {
        return productRepository.findAll();
    }

    @Override
    public Mono<ProductDomain> findById(UUID id) {
        return productRepository.findById(id);
    }

    @Override
    public Mono<ProductDomain> createProduct(ProductDomain productDomain) {
        return productRepository.createProduct(productDomain);
    }
}
