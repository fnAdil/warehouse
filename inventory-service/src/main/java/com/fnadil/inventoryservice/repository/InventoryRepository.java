package com.fnadil.inventoryservice.repository;

import java.util.Optional;



import org.springframework.data.jpa.repository.JpaRepository;

import com.fnadil.inventoryservice.model.Inventory;

public interface InventoryRepository extends JpaRepository<Inventory,Long>{
    Optional<Inventory> findBySkuCode(String skuCode);
}
