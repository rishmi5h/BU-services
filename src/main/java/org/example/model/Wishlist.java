package org.example.model;

import jakarta.persistence.Entity;
import lombok.Data;

import java.util.List;
import java.util.UUID;

@Entity
@Data
public class Wishlist {

    private UUID userId;

    private List<Product> productList;

}
