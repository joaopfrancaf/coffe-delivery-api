package com.example.coffe.delivery.java.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Document(collection = "enderecos")
public class Endereco {
    @Id
    private Long id;
    private String cep;
    private String bairro;
    private String cidade;
    private String complemento;
    private int numero;
    private String rua;
    private String uf;
    private String pagamento; //colocar ENUN acho dps
}
