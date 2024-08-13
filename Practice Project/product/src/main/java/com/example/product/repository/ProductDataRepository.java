package com.example.product.repository;

import com.example.product.model.ProductData;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductDataRepository extends JpaRepository<ProductData, String> {
    // Custom query methods can be added here if needed
}
