package com.zehraBal.product_listing_service.service;

import com.zehraBal.product_listing_service.entity.ApiResponse;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
@RequiredArgsConstructor
public class GoldPriceService {

    private final RestTemplate restTemplate;

    @Value("${gold.api.url}")
    private String goldApiUrl;

    @Value("${gold.api.key}")
    private String apiKey;

    public double getGoldPrice(){
        // set headers for api request
        // api request example:
        // curl -X GET 'https://www.goldapi.io/api/XAU/USD' \
        // -H 'x-access-token: api_key'
        HttpHeaders httpHeaders=new HttpHeaders();
        httpHeaders.set("x-access-token",apiKey);
        httpHeaders.set("Content-Type","application/json");

        HttpEntity<String> entity=new HttpEntity<>(httpHeaders);

        // send request to the api
        ResponseEntity<ApiResponse> response =restTemplate.exchange(
                goldApiUrl,
                HttpMethod.GET,
                entity,
                ApiResponse.class
        );

        return response.getBody()!= null ? response.getBody().getPrice() : 0.0;
    }
}