package com.example.coffe.delivery.java.Dto.PedidoDto;

import com.example.coffe.delivery.java.Entity.Coffe;
import com.example.coffe.delivery.java.Entity.Endereco;
import com.example.coffe.delivery.java.Entity.Product;

import java.util.List;

public record PedidoRequestDto(List<Product> carrinho, Endereco endereco) {
}
