package com.fabrice.javafirstcrud.models;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

//this class is our user model
@Entity //help us to create the table whenever we are connected to the DB
public class User {
    //columns for our table
    //specifying the primary key
    @Id
    @GeneratedValue //making our ID primary key to be auto generated
    //make sure that the @Id and GenetatedValue goes one after another.
    private Long id;
    private String username;
    private String names;
    private String email;
    //columns for our table

    //getters and setters
    //those methods will help us to get,update the attributes/columns of our table


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getNames() {
        return names;
    }

    public void setNames(String names) {
        this.names = names;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
