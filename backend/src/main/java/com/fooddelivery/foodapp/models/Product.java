package com.fooddelivery.foodapp.models;

import javax.persistence.*;

@Entity
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String category;
    private Double price;

    @ManyToMany(mappedBy = "products")
    private List<Restaurant> restaurants;

}
