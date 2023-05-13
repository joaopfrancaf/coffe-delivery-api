package com.example.coffe.delivery.java.Service;

import com.example.coffe.delivery.java.Dto.CoffeDto.CoffeRequestDto;
import com.example.coffe.delivery.java.Dto.CoffeDto.CoffeResponseDto;
import com.example.coffe.delivery.java.Dto.PedidoDto.PedidoResponseDto;
import com.example.coffe.delivery.java.Entity.Coffe;
import com.example.coffe.delivery.java.Repository.CoffeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

@Component
public class CoffeService {
    @Autowired
    private CoffeRepository coffeRepository;

    public List<CoffeResponseDto> PegarTodos() {
        List<CoffeResponseDto> coffes = coffeRepository.findAll().stream().map(CoffeResponseDto::new).toList();
        System.out.println(coffes);

        return coffes;
    }

    public void saveCoffe(CoffeRequestDto dto) {
        Coffe coffe = new Coffe(dto);
        coffeRepository.save(coffe);
    }
}
