package com.zehraBal.product_listing_service.util;


import com.zehraBal.product_listing_service.dto.ProductDto;

public class PriceCalculationUtil {
    public static double calculatePrice(ProductDto product, double goldPrice) {
        return (product.getPopularityScore() + 1) * product.getWeight() * goldPrice;
    }
}