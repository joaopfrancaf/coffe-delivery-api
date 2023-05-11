package com.example.coffe.delivery.java.Controller;

import com.example.coffe.delivery.java.Dto.PedidoRequestDto;
import com.example.coffe.delivery.java.Dto.PedidoResponseDto;
import com.example.coffe.delivery.java.Entity.Pedido;
import com.example.coffe.delivery.java.Service.PedidoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("pedido") //"mapea" informa o spring qual endpoint (url) o restController controla(é responsavel). em baixo tem os metodos https que sao invocados
public class PedidoController {
    @Autowired
    private PedidoService pedidoService;

    @PostMapping
    public PedidoResponseDto createPedido(@RequestBody PedidoRequestDto pedidoDto) {
        Pedido savedPedido = pedidoService.savePedido(pedidoDto);
        PedidoResponseDto savedPedidoDto = new PedidoResponseDto(savedPedido);

        return savedPedidoDto;
    }

    public PedidoResponseDto findAll(@RequestBody PedidoRequestDto pedidoDto) {
        return null;
    }
}
