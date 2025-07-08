package com.zehraBal.product_listing_service.dto;

import jakarta.validation.constraints.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Map;
@Data
@AllArgsConstructor
@NoArgsConstructor
public class ProductDto {


    @NotBlank(message = "Name cannot be empty")
    private String name;


    @Min(value = 0,message = "Popularity must be between 0-100%")
    @Max(value = 1,message = "Popularity must be between 0-100%")
    private double popularityScore;

    @Positive(message = "Weight must be positive")
    private double weight;

    @Size(min = 3,max = 3, message = "Images must contain exactly 3 entries")
    private Map<String,String> images;
}
