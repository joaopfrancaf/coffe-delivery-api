package com.example.coffe.delivery.java.controller;

import com.example.coffe.delivery.java.dto.PedidoDto.PedidoRequestDto;
import com.example.coffe.delivery.java.dto.PedidoDto.PedidoResponseDto;
import com.example.coffe.delivery.java.Entity.Pedido;
import com.example.coffe.delivery.java.service.PedidoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("pedido") //"mapea" informa o spring qual endpoint (url) o restController controla(é responsavel). em baixo tem os metodos https que sao invocados
public class PedidoController {
    @Autowired
    private PedidoService pedidoService;

    @CrossOrigin(origins = "*")
    @ResponseStatus(HttpStatus.CREATED)
    @PostMapping
    public PedidoResponseDto createPedido(@RequestBody PedidoRequestDto pedidoDto) {
        Pedido savedPedido = pedidoService.savePedido(pedidoDto);
        PedidoResponseDto savedPedidoDto = new PedidoResponseDto(savedPedido);

        return savedPedidoDto;
    }

    @CrossOrigin(origins = "*")
    @GetMapping
    public List<PedidoResponseDto> findAll() {
        List<PedidoResponseDto> pedidos = pedidoService.pegaTodos();
        return pedidos;
    }
}
