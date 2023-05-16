package com.example.coffe.delivery.java.Entity;

import com.example.coffe.delivery.java.Dto.PedidoDto.PedidoRequestDto;
import lombok.*;
import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.List;
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Document(collection = "pedidos")
public class Pedido {
    @Indexed
    private String id;
    private List<Coffe> carrinho;
    private Endereco endereco;

    public Pedido(PedidoRequestDto dto) {
        this.carrinho = dto.carrinho();
        this.endereco = dto.endereco();
    }
}
