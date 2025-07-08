package com.zehraBal.product_listing_service.mapper;

import com.zehraBal.product_listing_service.dto.ProductDto;
import com.zehraBal.product_listing_service.dto.ProductResponseDto;
import org.springframework.stereotype.Component;

@Component
public class ProductMapper {

    public ProductResponseDto toResponseDto(ProductDto productDto, double price){
        return new ProductResponseDto(
                productDto.getName(),
                productDto.getPopularityScore(),
                productDto.getWeight(),
                productDto.getImages(),
                price
        );
    }
}
