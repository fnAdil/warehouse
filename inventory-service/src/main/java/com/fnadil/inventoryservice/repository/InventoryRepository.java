package com.fnadil.inventoryservice.repository;

import java.util.List;



import org.springframework.data.jpa.repository.JpaRepository;

import com.fnadil.inventoryservice.model.Inventory;

public interface InventoryRepository extends JpaRepository<Inventory,Long>{


    List<Inventory> findBySkuCodeIn(List<String> skuCode);
    
}
