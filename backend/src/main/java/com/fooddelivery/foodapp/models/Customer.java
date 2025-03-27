package com.fooddelivery.foodapp.models;

import javax.persistence.*;
import java.util.List;

@Entity
public class Customer {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String username;
    private String password;
    private String email;
  
    @OneToMany(mappedBy = "customer")
    private List<Order> orders;

}
