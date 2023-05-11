package com.example.coffe.delivery.java.Dto;

import com.example.coffe.delivery.java.Entity.Coffe;
import com.example.coffe.delivery.java.Entity.Endereco;
import com.example.coffe.delivery.java.Entity.Pedido;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

import java.util.List;

public record PedidoResponseDto(Long id, List<Coffe> coffe, Endereco endereco) {

    public PedidoResponseDto(Pedido pedido) {
        this(pedido.getId(),pedido.getCoffe(), pedido.getEndereco());
    }
}
