package com.example.coffe.delivery.java.Repository;

import com.example.coffe.delivery.java.Entity.Coffe;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CoffeRepository extends MongoRepository<Coffe,String> {
}
