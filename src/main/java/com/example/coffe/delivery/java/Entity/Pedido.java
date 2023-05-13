package com.example.coffe.delivery.java.Entity;

import com.example.coffe.delivery.java.Dto.PedidoDto.PedidoRequestDto;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.List;
@Setter
@Getter
@EqualsAndHashCode(of = "id")
@Document(collection = "pedidos")
public class Pedido {
    @Id
    private String id;
    private List<Coffe> carrinho;
    private Endereco endereco;

    public Pedido(PedidoRequestDto dto) {
        this.carrinho = dto.carrinho();
        this.endereco = dto.endereco();
    }
}
