package com.watchtower.model;

import jakarta.persistence.*;

@Entity
public class Contact {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

    private String designation;

    private String phone;

    private boolean isScammer;

    public Contact() {
    }

    public Contact(
            String name,
            String designation,
            String phone,
            boolean isScammer
    ) {
        this.name = name;
        this.designation = designation;
        this.phone = phone;
        this.isScammer = isScammer;
    }

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getDesignation() {
        return designation;
    }

    public String getPhone() {
        return phone;
    }

    public boolean isScammer() {
        return isScammer;
    }
}
