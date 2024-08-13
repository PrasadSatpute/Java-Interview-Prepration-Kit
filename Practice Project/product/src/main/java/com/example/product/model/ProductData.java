package com.example.product.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class ProductData {
    @Id
    private String productId;
    private String color;
    private String capacity;
    private Integer capacityGB;
    private Double price;
    private String generation;
    private Integer year;
    private String cpuModel;
    private String hardDiskSize;
    private String strapColour;
    private String caseSize;
    private String description;
    private Double screenSize;
    private String capacityGB2;

    @OneToOne
    @MapsId
    @JoinColumn(name = "productId", referencedColumnName = "id")
    private Product product;
}
