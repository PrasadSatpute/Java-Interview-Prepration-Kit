package com.example.demo.controller;

import com.example.demo.exception.ProductNotFoundException;
import com.example.demo.handler.ProductResponseHandler;
import com.example.demo.model.Product;
import com.example.demo.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/home")
public class ProductController {

    @Autowired
    private ProductService productService;

    // Create a new product
    @PostMapping("/product")
    public ResponseEntity<Product> saveProduct(@RequestBody Product product) {
        Product savedProduct = productService.saveProduct(product);
        return ResponseEntity.ok(savedProduct);
    }

    // Get all products
    @GetMapping("/getAll")
    public ResponseEntity<List<Product>> getAllProducts() {
        List<Product> products = productService.fetchAllProducts();
        return ResponseEntity.ok(products);
    }

    // Get a product by ID
    @GetMapping("/product/{id}")
    public ResponseEntity<Object> getProductById(@PathVariable Long id) {



        if(productService.fetchProductById(id).isEmpty())
            throw new ProductNotFoundException("This Product ID is not Present");
        return ProductResponseHandler.responseEntityBuilder("Product Details",HttpStatus.OK,productService.fetchProductById(id).get());
    }

    // Update a product
    @PutMapping("/product/{id}")
    public ResponseEntity<Product> updateProduct(@PathVariable Long id, @RequestBody Product product) {
        Optional<Product> updatedProductOptional = productService.updateProduct(id, product);
        return updatedProductOptional.map(ResponseEntity::ok)
                .orElseGet(() -> ResponseEntity.notFound().build());
    }

    //Delete a product
    @DeleteMapping("/product/{productId}")
    public ResponseEntity<String> deleteProduct(@PathVariable Long productId) {
        boolean deletionStatus = productService.deleteProduct(productId);
        if (deletionStatus) {
            return ResponseEntity.ok("Product with ID " + productId + " has been deleted successfully");
        } else {
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body("Failed to delete product with ID " + productId);
        }
    }
}
