package com.example.coffe.delivery.java.Dto;

import com.example.coffe.delivery.java.Entity.Coffe;
import com.example.coffe.delivery.java.Entity.Endereco;

import java.util.List;

public record PedidoRequestDto(List<Coffe> coffes, List pagamento, Endereco endereco) {
}
