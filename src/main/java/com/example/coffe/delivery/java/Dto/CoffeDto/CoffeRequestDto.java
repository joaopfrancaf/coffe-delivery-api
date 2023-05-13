package com.example.coffe.delivery.java.Dto.CoffeDto;

import java.util.List;

public record CoffeRequestDto(String name, String description, List<String> type, double price, String img) {
}
