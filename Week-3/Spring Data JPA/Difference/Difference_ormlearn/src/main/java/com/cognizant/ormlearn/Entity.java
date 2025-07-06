package com.cognizant.ormlearn;


import jakarta.persistence.*;

@Entity
public class Entity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private String name;
    private double salary;

    // getters and setters
}

