package com.example.coffe.delivery.java.Controller;

import com.example.coffe.delivery.java.Dto.CoffeDto.CoffeRequestDto;
import com.example.coffe.delivery.java.Dto.CoffeDto.CoffeResponseDto;
import com.example.coffe.delivery.java.Service.CoffeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("coffe")
public class CoffeController {
    @Autowired
    private CoffeService coffeService;

    @CrossOrigin(origins = "*")
    @GetMapping
    public List<CoffeResponseDto> findAll () {
        List<CoffeResponseDto> coffes = coffeService.PegarTodos();

        return coffes;
    }

    @CrossOrigin(origins = "*")
    @PostMapping
    public void createCoffe(@RequestBody CoffeRequestDto dto) {
        coffeService.saveCoffe(dto);
    }
}
