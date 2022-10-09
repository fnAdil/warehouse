package com.fnadil.inventoryservice.controller;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.fnadil.inventoryservice.dto.InventoryResponse;
import com.fnadil.inventoryservice.model.Inventory;
import com.fnadil.inventoryservice.service.InventoryService;

import lombok.RequiredArgsConstructor;

@RestController
@RequestMapping("/api/inventory")
@RequiredArgsConstructor
public class InventoryController {
    private final InventoryService inventoryService;

    @GetMapping
    @ResponseStatus(HttpStatus.OK)
    public List<InventoryResponse> isInStock(@RequestParam("skuCode") List<String> skuCode) {
        System.out.println("ashjgbcvfjahsdknvbcjksdnvkjdsj");
        return inventoryService.isInStock(skuCode);
    }

    @GetMapping
    @RequestMapping("/getall")
    @ResponseStatus(HttpStatus.OK)
    public List<Inventory> getAllProducts() {
    return inventoryService.getAll();
    }
}
