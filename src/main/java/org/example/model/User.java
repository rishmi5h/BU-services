package org.example.model;

import jakarta.persistence.Entity;
import lombok.Data;

import java.util.Date;
import java.util.UUID;

@Entity
@Data
public class User {

    private final UUID userId = UUID.randomUUID();

    private String firstName;

    private String lastName;

    private String email;

    private String password;

    private Date createdAt;

    private Date updatedAt;

    private Cart cart;

    private Wishlist wishlist;
}
