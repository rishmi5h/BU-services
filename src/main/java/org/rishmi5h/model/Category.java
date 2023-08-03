package org.rishmi5h.model;

import jakarta.persistence.*;
import lombok.Data;

import java.util.Set;

@Entity
@Data
public class Category {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "category_name")
    private  String categoryName;

    private  String description;

    private  String imageUrl;

    // add imageURL here

    @OneToMany(mappedBy = "category", fetch = FetchType.LAZY,
            cascade = CascadeType.ALL)
    Set<Product> products;

    public Category() {
    }

    public Category( String categoryName,  String description) {
        this.categoryName = categoryName;
        this.description = description;
    }

    public Category( String categoryName,  String description,  String imageUrl) {
        this.categoryName = categoryName;
        this.description = description;
        this.imageUrl = imageUrl;
    }
}
