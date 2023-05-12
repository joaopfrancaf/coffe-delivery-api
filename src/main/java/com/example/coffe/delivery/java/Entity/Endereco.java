package com.example.coffe.delivery.java.Entity;

import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Getter
@Setter
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
    private enum pagamento {
        CARTAO_DE_DEBITO,
        CARTAO_DE_CREDITO,
        DINHEIRO
    };
}
