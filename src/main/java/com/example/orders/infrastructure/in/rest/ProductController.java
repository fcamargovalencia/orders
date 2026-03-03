package com.example.orders.infrastructure.in.rest;

import com.example.orders.infrastructure.in.rest.dto.ProductDto;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.tags.Tag;
import reactor.core.publisher.Flux;

@Tag(name = "Products", description = "Product management APIs")
public interface ProductController {

    @Operation(
            summary = "Get all products",
            description = "Retrieve all available products from the database",
            tags = {"Products"}
    )
    @ApiResponse(
            responseCode = "200",
            description = "List of all products",
            content = @Content(
                    mediaType = "application/json",
                    schema = @Schema(implementation = ProductDto.class)
            )
    )
    Flux<ProductDto> findAll();
}
