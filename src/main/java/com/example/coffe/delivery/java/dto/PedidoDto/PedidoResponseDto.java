package com.example.coffe.delivery.java.dto.PedidoDto;

import com.example.coffe.delivery.java.entity.Endereco;
import com.example.coffe.delivery.java.entity.Pedido;
import com.example.coffe.delivery.java.entity.Product;

import java.util.List;

public record PedidoResponseDto(String id, List<Product> carrinho, Endereco endereco) {

    public PedidoResponseDto(Pedido pedido) {
        this(pedido.getId(),pedido.getCarrinho(), pedido.getEndereco());
    }
}
