package com.example.orders.infrastructure.in.rest.impl;

import com.example.orders.domain.ports.in.ProductInputPort;
import com.example.orders.infrastructure.in.rest.ProductController;
import com.example.orders.infrastructure.in.rest.dto.ProductDto;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Flux;

@RestController
@RequestMapping("/api/products")
@RequiredArgsConstructor
public class ProductControllerImpl implements ProductController {

    private final ProductInputPort productPort;

    @Override
    @GetMapping
    public Flux<ProductDto> findAll(){
        return productPort.findAll()
                .map(productDomain -> {
                    return ProductDto.builder()
                            .name(productDomain.name())
                            .stock(productDomain.stock())
                            .description(productDomain.description())
                            .price(productDomain.price())
                            .build();
                });
    }
}
