package com.example.coffe.delivery.java.Entity;

import com.example.coffe.delivery.java.Dto.PedidoRequestDto;
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
    private Long id;
    private List<Coffe> coffe;
    private Endereco endereco;

    public Pedido(PedidoRequestDto dto) {
        this.coffe = dto.coffes();
        this.endereco = dto.endereco();
    }
}
