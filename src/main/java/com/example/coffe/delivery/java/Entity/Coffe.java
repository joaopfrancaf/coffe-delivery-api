package com.example.coffe.delivery.java.Entity;

import com.example.coffe.delivery.java.Dto.CoffeDto.CoffeRequestDto;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.List;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Document(collection = "coffes")
public class Coffe {
    @Indexed
    private String id;
    private String name;
    private List<String> tipo;
    private String description;
    private Double price;
    private String img;

    public Coffe (CoffeRequestDto dto) {
        this.name = dto.name();
        this.tipo = dto.type();
        this.description = dto.description();
        this.price = dto.price();
        this.img = dto.img();
    }
}
