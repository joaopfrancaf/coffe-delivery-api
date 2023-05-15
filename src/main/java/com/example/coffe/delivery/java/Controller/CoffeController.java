package com.example.coffe.delivery.java.Controller;

import com.example.coffe.delivery.java.Dto.CoffeDto.CoffeRequestDto;
import com.example.coffe.delivery.java.Dto.CoffeDto.CoffeResponseDto;
import com.example.coffe.delivery.java.Service.CoffeService;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("coffe")
public class CoffeController {
    @Autowired
    private CoffeService coffeService;

    @CrossOrigin(origins = "*")
    @PostMapping
    public CoffeResponseDto createCoffe(@RequestBody CoffeRequestDto dto) {
        CoffeResponseDto responseDto = coffeService.saveCoffe(dto);

        return responseDto;
    }

    @CrossOrigin(origins = "*")
    @GetMapping
    public List<CoffeResponseDto> findAll () {
        List<CoffeResponseDto> coffes = coffeService.PegarTodos();

        return coffes;
    }

}
