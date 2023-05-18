package com.example.coffe.delivery.java.service;

import com.example.coffe.delivery.java.dto.CoffeDto.CoffeRequestDto;
import com.example.coffe.delivery.java.dto.CoffeDto.CoffeResponseDto;
import com.example.coffe.delivery.java.entity.Coffe;
import com.example.coffe.delivery.java.repository.CoffeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class CoffeService {
    @Autowired
    private CoffeRepository coffeRepository;

    public List<CoffeResponseDto> PegarTodos() {
        List<CoffeResponseDto> coffes = coffeRepository.findAll().stream().map(CoffeResponseDto::new).toList();

        return coffes;
    }

    public CoffeResponseDto saveCoffe(CoffeRequestDto dto) {
        Coffe coffe = new Coffe(dto);
        coffe = coffeRepository.save(coffe);

        return new CoffeResponseDto(coffe);
    }

    public List<CoffeResponseDto> saveCoffeArray(List<CoffeRequestDto> dto) {
        List<Coffe> coffes = dto.stream().map(Coffe:: new).toList();
        List<Coffe> savedCoffes = coffes.stream().map(coffe -> coffeRepository.save(coffe)).toList();

        return savedCoffes.stream().map(CoffeResponseDto::new).toList();
    }
}
