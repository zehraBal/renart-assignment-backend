package com.zehraBal.product_listing_service.service;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.zehraBal.product_listing_service.dto.ProductDto;
import com.zehraBal.product_listing_service.dto.ProductResponseDto;
import com.zehraBal.product_listing_service.mapper.ProductMapper;
import com.zehraBal.product_listing_service.util.PriceCalculationUtil;

import lombok.RequiredArgsConstructor;
import org.springframework.core.io.ClassPathResource;
import org.springframework.stereotype.Service;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

@Service
@RequiredArgsConstructor
public class ProductService {

    private final ObjectMapper objectMapper;
    private final GoldPriceService goldPriceService;
    private final ProductMapper productMapper;

    public List<ProductResponseDto> getProducts() throws IOException{
        InputStream inputStream = new ClassPathResource("product.json").getInputStream();
        List<ProductDto> products= objectMapper.readValue(inputStream, new TypeReference<List<ProductDto>>() {});

        double goldPrice=goldPriceService.getGoldPrice();
        return products.stream()
                .map(product->{
                    double price= PriceCalculationUtil.calculatePrice(product,goldPrice);
                    return productMapper.toResponseDto(product,price);
                }).toList();
    }
}


