package com.example.coffe.delivery.java.Service;

import com.example.coffe.delivery.java.Dto.PedidoRequestDto;
import com.example.coffe.delivery.java.Entity.Pedido;
import com.example.coffe.delivery.java.Repository.PedidoRepository;
import org.springframework.beans.factory.annotation.Autowired;

public class PedidoService {
    @Autowired
    private PedidoRepository pedidoRepository;

    public Pedido savePedido(PedidoRequestDto dto) {
        Pedido pedido = new Pedido(dto);
        Pedido savedPedido = pedidoRepository.save(pedido);

        return savedPedido;
    }
}
