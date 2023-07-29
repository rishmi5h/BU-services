package org.example.model;

import jakarta.persistence.Entity;
import lombok.Data;

import java.util.UUID;

@Entity
@Data
public class Category {

    private final UUID categoryId = UUID.randomUUID();

    private String categoryName;

    private String categoryDescription;
}
