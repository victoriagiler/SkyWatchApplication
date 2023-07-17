package com.Sky_Watch_App.SkyWatch.entities;


import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

@Entity
public class User {

    @Id
    @GeneratedValue
    @Column(nullable = false, updatable = false)
    private Integer id;
    private String firstname;

    private String lastname;

    private String username;
    private String password;
    private String email;

    public User(Integer id, String firstname, String lastname, String email, String username, String password){
    this.id = id;
    this.username = username;
    this.password = password;
    this.email = email;
    this.lastname = lastname;
    this.firstname = firstname;
    }

    public User(){

    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getFirstName() {
        return firstname;
    }

    public void setFirstName(String firstname) {
        this.firstname = firstname;
    }

    public String getLastName() {
        return lastname;
    }

    public void setLastName(String lastname) {
        this.lastname = lastname;
    }
}
