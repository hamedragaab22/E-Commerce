package com.example.E_Commerce.service;

import com.example.E_Commerce.model.Product;
import com.example.E_Commerce.repo.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProductService {
    ProductRepository productRepository;
    @Autowired
    public ProductService(ProductRepository productRepository){
        this.productRepository=productRepository;
    }
    public Product addProduct(Product product){
       return productRepository.save(product);
    }
}
