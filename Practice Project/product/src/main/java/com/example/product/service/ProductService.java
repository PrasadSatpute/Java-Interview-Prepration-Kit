package com.example.product.service;

import com.example.product.model.Product;
import com.example.product.repository.ProductDataRepository;
import com.example.product.repository.ProductRepository;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class ProductService {

    @Autowired
    private ProductRepository productRepository;

    @Autowired
    private ProductDataRepository productDataRepository;

    @Transactional
    public Product createProduct(Product product) {
        productDataRepository.save(product.getData());
        return productRepository.save(product);
    }

}
