package org.example.model;

import jakarta.persistence.Entity;
import lombok.Data;

import java.util.UUID;

@Entity
@Data
public class Product {

    private final UUID productId = UUID.randomUUID();

    private String name;

    private Double price;

    private String pictureUrl;

    private String brandName;

    private String clothType;

    private String sizesAvailable;
}
