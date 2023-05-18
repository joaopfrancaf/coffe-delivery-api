package com.example.coffe.delivery.java.dto.CoffeDto;

import com.example.coffe.delivery.java.entity.Coffe;

import java.util.List;

public record CoffeResponseDto(String id,String name, String description, List<String> type, double price, String img) {

    public CoffeResponseDto(Coffe coffe) {
        this(coffe.getId(), coffe.getName(), coffe.getDescription(), coffe.getType(), coffe.getPrice(), coffe.getImg());
    }
}
