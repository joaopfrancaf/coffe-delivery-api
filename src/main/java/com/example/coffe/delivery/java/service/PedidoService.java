package com.example.coffe.delivery.java.service;

import com.example.coffe.delivery.java.dto.PedidoDto.PedidoRequestDto;
import com.example.coffe.delivery.java.dto.PedidoDto.PedidoResponseDto;
import com.example.coffe.delivery.java.entity.Pedido;
import com.example.coffe.delivery.java.repository.PedidoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class PedidoService {
    @Autowired
    private PedidoRepository pedidoRepository;

    public Pedido savePedido(PedidoRequestDto dto) {
        Pedido pedido = new Pedido(dto);
        Pedido savedPedido = pedidoRepository.save(pedido);

        return savedPedido;
    }

    public List<PedidoResponseDto> pegaTodos() {
        List<PedidoResponseDto> pedidos = pedidoRepository.findAll().stream().map(PedidoResponseDto::new).toList();
        return pedidos;
    }
}
