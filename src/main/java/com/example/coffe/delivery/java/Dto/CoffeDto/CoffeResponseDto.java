package com.example.coffe.delivery.java.Dto.CoffeDto;

import com.example.coffe.delivery.java.Entity.Coffe;
import org.springframework.boot.context.properties.ConstructorBinding;

import java.util.List;

@ConstructorBinding
public record CoffeResponseDto(String id,String name, String description, List<String> type, double price, String img) {

    public CoffeResponseDto(Coffe coffe) {
        this(coffe.getId(), coffe.getName(), coffe.getDescription(), coffe.getTipo(), coffe.getPrice(), coffe.getImg());
    }
}
