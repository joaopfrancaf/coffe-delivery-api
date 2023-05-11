package com.example.coffe.delivery.java.Controller;

import com.example.coffe.delivery.java.Dto.PedidoRequestDto;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("pedido") //"mapea" informa o spring qual endpoint (url) o restController controla(é responsavel). em baixo tem os metodos https que sao invocados
public class PedidoController {

    @PostMapping
    public void savePedido(@RequestBody PedidoRequestDto pedido) {

    }
}
