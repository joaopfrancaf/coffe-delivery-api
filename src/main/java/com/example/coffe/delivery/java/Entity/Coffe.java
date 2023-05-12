package com.example.coffe.delivery.java.Entity;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.List;
@Document(collection = "coffes")
public class Coffe {
    @Id
    private Long id;
    private String name;
    private List<String> tipo;
    private String description;
    private Double price;
    private String img;
}
