package com.zehraBal.product_listing_service.entity;

import lombok.Data;


@Data
public class ApiResponse {
    // example response from api:
    //{
    // 23 items
    //"timestamp":1751920005
    //"metal":"XAU"
    //"currency":"USD"
    //"exchange":"FOREXCOM"
    //"symbol":"FOREXCOM:XAUUSD"
    //"prev_close_price":3337.245
    //"open_price":3337.22
    //"low_price":3296.525
    //"high_price":3342.695
    //"open_time":1751846400
    //"price":3336.685
    //"ch":-0.56
    //"chp":-0.02
    //"ask":3337.18
    //"bid":3336.29
    //"price_gram_24k":107.2769
    //"price_gram_22k":98.3372
    //"price_gram_21k":93.8673
    //"price_gram_20k":89.3974
    //"price_gram_18k":80.4577
    //"price_gram_16k":71.5179
    //"price_gram_14k":62.5782
    //"price_gram_10k":44.6987
    //}

    private long timestamp;
    private String metal;
    private String currency;
    private String exchange;
    private String symbol;
    private double prev_close_price;
    private double open_price;
    private double low_price;
    private double high_price;
    private long open_time;
    private double price;
    private double ch;
    private double chp;
    private double ask;
    private double bid;
    private double price_gram_24k;
    private double price_gram_22k;
    private double price_gram_21k;
    private double price_gram_20k;
    private double price_gram_18k;
    private double price_gram_16k;
    private double price_gram_14k;
    private double price_gram_10k;



}
