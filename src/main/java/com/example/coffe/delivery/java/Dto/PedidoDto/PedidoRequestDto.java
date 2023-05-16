package com.example.coffe.delivery.java.Dto.PedidoDto;

import com.example.coffe.delivery.java.Entity.Coffe;
import com.example.coffe.delivery.java.Entity.Endereco;

import java.util.List;

public record PedidoRequestDto(List<Coffe> carrinho, Endereco endereco) {
}
