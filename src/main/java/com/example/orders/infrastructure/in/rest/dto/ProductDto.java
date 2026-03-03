package com.example.orders.infrastructure.in.rest.dto;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Builder;

import java.math.BigDecimal;

@Schema(
        name = "ProductDto",
        description = "Data Transfer Object for Product information",
        example = """
                {
                    "name": "Laptop",
                    "description": "High-performance laptop",
                    "price": 999.99,
                    "stock": 50
                }
                """
)
@Builder(toBuilder = true)
public record ProductDto(

        @Schema(description = "Product name", example = "Laptop")
        String name,

        @Schema(description = "Product description", example = "High-performance laptop with 16GB RAM")
        String description,

        @Schema(description = "Product price", example = "999.99")
        BigDecimal price,

        @Schema(description = "Product stock quantity", example = "50")
        Integer stock
) {
}
