package com.luv2code.springboot.thymeleafdemo.entity;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotEmpty;

@Entity
@Table(name = "members")
public class Members {

    // define fields

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;

    @NotEmpty(message = "This field can't be empty")
    @Column(name = "name")
    private String name;

    @NotEmpty(message = "This field can't be empty")
    @Column(name = "pw")
    private String password;

    @Column(name = "active")
    private int active;


    // define constructors

    public Members() {

    }

    public Members(int id, String name, String password, int active) {
        this.id = id;
        this.name = name;
        this.password = password;
        this.active = active;
    }

    public Members(String name, String password, int active) {
        this.name = name;
        this.password = password;
        this.active = active;
    }


    // define getter/setter

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public int getActive() {
        return active;
    }

    public void setActive(int active) {
        this.active = active;
    }


    // define tostring

    @Override
    public String toString() {
        return "Members{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", password='" + password + '\'' +
                ", active=" + active +
                '}';
    }

}
