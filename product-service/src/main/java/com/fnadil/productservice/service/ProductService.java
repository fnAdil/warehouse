package com.fnadil.productservice.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.fnadil.productservice.dto.ProductRequest;
import com.fnadil.productservice.dto.ProductResponse;
import com.fnadil.productservice.model.Product;
import com.fnadil.productservice.repository.ProductRepository;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor

public class ProductService {
    private final ProductRepository productRepository;

    public void createProduct(ProductRequest productRequest){
        Product product = Product.builder().name(productRequest.getName()).description(productRequest.getDescription()).price(productRequest.getPrice()).build();
        productRepository.save(product);
    }

    public List<ProductResponse> getAllProducts() {
        List<Product> products= productRepository.findAll();

      return  products.stream().map(this::mapToProductRepsonse).toList();

    }

    private ProductResponse mapToProductRepsonse(Product product) {
        return ProductResponse.builder().id(product.getId()).name(product.getName()).description(product.getDescription()).price(product.getPrice()).build();
    }
}
