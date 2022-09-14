package com.fnadil.orderservice.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.fnadil.orderservice.model.Order;

public interface OrderRepository extends JpaRepository<Order,Long>{
    
}
