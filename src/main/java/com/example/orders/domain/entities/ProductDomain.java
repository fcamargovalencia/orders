package com.example.orders.domain.entities;

import lombok.Builder;

import java.math.BigDecimal;
import java.util.UUID;

@Builder(toBuilder = true)
public record ProductDomain(
        UUID id,

        String name,

        String description,

        BigDecimal price,

        Integer stock
) {
}