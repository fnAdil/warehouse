package com.fnadil.productservice.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.fnadil.productservice.model.Product;

public interface ProductRepository extends MongoRepository<Product,String> {
    
}
