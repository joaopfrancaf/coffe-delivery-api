package com.example.coffe.delivery.java.Entity;

import org.springframework.data.annotation.Id;

public class Pedido {
    @Id
    private Long id;

    private Coffe[] coffes;

    private enum pagamento{};

    private Endereco endereco;
}
