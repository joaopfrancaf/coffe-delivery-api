package com.example.coffe.delivery.java.controller;

import com.example.coffe.delivery.java.dto.CoffeDto.CoffeRequestDto;
import com.example.coffe.delivery.java.dto.CoffeDto.CoffeResponseDto;
import com.example.coffe.delivery.java.service.CoffeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("coffe")
public class CoffeController {
    @Autowired
    private CoffeService coffeService;

    @CrossOrigin(origins = "*")
    @ResponseStatus(HttpStatus.CREATED)
    @PostMapping
    public CoffeResponseDto createCoffe(@RequestBody CoffeRequestDto dto) {
        CoffeResponseDto responseDto = coffeService.saveCoffe(dto);

        return responseDto;
    }

    @CrossOrigin(origins = "*")
    @PostMapping(value = "/arrayCoffes")
    public List<CoffeResponseDto> createCoffeArray(@RequestBody List<CoffeRequestDto> dto) {
        List<CoffeResponseDto> responseDto = coffeService.saveCoffeArray(dto);

        return responseDto;
    }

    @CrossOrigin(origins = "*")
    @GetMapping
    public List<CoffeResponseDto> findAll () {
        List<CoffeResponseDto> coffes = coffeService.PegarTodos();

        return coffes;
    }

}
