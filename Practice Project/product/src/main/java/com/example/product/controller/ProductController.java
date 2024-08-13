package com.example.product.controller;

import com.example.product.model.Product;
import com.example.product.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping("/api/products")
public class ProductController {

    @Autowired
    private ProductService productService;

    @GetMapping("/test")
    public String testProduct(){
        return "Api Work Successfully";
    }

    @PostMapping("/add")
    public Product addProduct(@RequestBody Product product)
    {
        return productService.createProduct(product);
    }

}
