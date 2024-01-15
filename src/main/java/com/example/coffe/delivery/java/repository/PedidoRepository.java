package com.example.coffe.delivery.java.repository;

import com.example.coffe.delivery.java.Entity.Pedido;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PedidoRepository extends MongoRepository<Pedido,Long> {
}
