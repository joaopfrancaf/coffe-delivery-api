package com.example.coffe.delivery.java.Entity;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Endereco {

    private String cep;
    private String bairro;
    private String cidade;
    private String complemento;
    private int numero;
    private String rua;
    private String uf;
}
