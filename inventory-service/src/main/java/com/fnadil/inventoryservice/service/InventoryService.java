package com.fnadil.inventoryservice.service;

import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.fnadil.inventoryservice.dto.InventoryResponse;
import com.fnadil.inventoryservice.model.Inventory;
import com.fnadil.inventoryservice.repository.InventoryRepository;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class InventoryService {
    private final InventoryRepository inventoryRepository;

    @Transactional(readOnly = true)
    public List<InventoryResponse>  isInStock(List<String> skuCode) {
        return inventoryRepository.findBySkuCodeIn(skuCode).stream().map(inventory->
             InventoryResponse.builder().skuCode(inventory.getSkuCode()).isInStock(inventory.getQuantity()>0).build()
        ).toList();
    }

    @Transactional(readOnly = true)
    public List<Inventory>  getAll() {
        return inventoryRepository.findAll();
    }
}
