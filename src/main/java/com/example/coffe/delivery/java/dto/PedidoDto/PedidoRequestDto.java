package com.example.coffe.delivery.java.dto.PedidoDto;

import com.example.coffe.delivery.java.entity.Endereco;
import com.example.coffe.delivery.java.entity.Product;

import java.util.List;

public record PedidoRequestDto(List<Product> carrinho, Endereco endereco) {
}
