package com.zehraBal.product_listing_service.controller;

import com.zehraBal.product_listing_service.dto.ProductResponseDto;
import com.zehraBal.product_listing_service.service.ProductService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.io.IOException;
import java.util.List;


@RestController
@RequestMapping("/api/products")
@RequiredArgsConstructor
public class ProductController {

    private final ProductService productService;

    @GetMapping
    public ResponseEntity<List<ProductResponseDto>> getAllProducts() {
        try {
            List<ProductResponseDto> products = productService.getProducts();
            return ResponseEntity.ok(products);
        } catch (IOException e) {
            return ResponseEntity.internalServerError().build();
        }
    }

}
