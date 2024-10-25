package com.stock.Microservices.exception;

public class StockNotFoundException extends RuntimeException {
    
    public StockNotFoundException(String message) {
        super(message);
    }
}
