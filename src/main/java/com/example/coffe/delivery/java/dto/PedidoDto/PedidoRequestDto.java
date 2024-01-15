package com.example.coffe.delivery.java.dto.PedidoDto;

import com.example.coffe.delivery.java.Entity.Endereco;
import com.example.coffe.delivery.java.Entity.Product;

import java.util.List;

public record PedidoRequestDto(List<Product> carrinho, Endereco endereco) {
}
