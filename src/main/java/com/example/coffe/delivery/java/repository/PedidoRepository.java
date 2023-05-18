package com.example.coffe.delivery.java.repository;

import com.example.coffe.delivery.java.entity.Pedido;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PedidoRepository extends MongoRepository<Pedido,Long> {
}
