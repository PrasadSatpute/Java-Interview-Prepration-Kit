package com.example.demo.repository;

import com.example.demo.model.Product;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;

import java.util.List;
import java.util.Optional;

@DataJpaTest
public class ProductRepositoryTest {

    @Autowired
    private ProductRepository productRepository;
    Product product;

    @BeforeEach
    void setUp() {
        product = new Product(101L,"ABCD",144.2,33);
        productRepository.save(product);
    }

    @AfterEach
    void tearDown() {
        product = null;
        productRepository.deleteAll();
    }

//    Test case Success

    @Test
    void testFindByProductID_Found()
    {
        Optional<Product> getProduct = productRepository.findById(101L);
        Assertions.assertThat(getProduct).isEqualTo(product);
    }

//    Test case Failure

}
