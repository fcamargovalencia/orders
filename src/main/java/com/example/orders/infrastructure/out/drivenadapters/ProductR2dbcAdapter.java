package com.example.orders.infrastructure.out.drivenadapters;

import com.example.orders.domain.entities.ProductDomain;
import com.example.orders.domain.ports.out.ProductRepository;
import com.example.orders.infrastructure.out.entities.Product;
import com.example.orders.infrastructure.out.repositories.ProductR2dbcRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

import java.util.UUID;

@Repository
@RequiredArgsConstructor
public class ProductR2dbcAdapter implements ProductRepository {
    private final ProductR2dbcRepository repository;

    @Override
    public Flux<ProductDomain> findAll() {
        return repository.findAll()
                .map(product -> {
                    return ProductDomain.builder()
                            .name(product.getName())
                            .price(product.getPrice())
                            .description(product.getDescription())
                            .stock(product.getStock()).build();
                });
    }

    @Override
    public Mono<ProductDomain> findById(UUID id) {
        return repository.findById(id)
                .map(product -> {
                    return ProductDomain.builder()
                            .name(product.getName())
                            .price(product.getPrice())
                            .description(product.getDescription())
                            .stock(product.getStock()).build();
                });
    }

    @Override
    public Mono<ProductDomain> createProduct(ProductDomain productDomain){
        Product product = new Product();
        product.setId(productDomain.id());
        product.setName(productDomain.name());
        return repository.save(product).map(
                result -> {
                    return ProductDomain.builder()
                            .name(result.getName())
                            .price(result.getPrice())
                            .description(result.getDescription())
                            .stock(result.getStock()).build();
                }
        );
    }
}
