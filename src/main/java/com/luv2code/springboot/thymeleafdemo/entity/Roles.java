package com.luv2code.springboot.thymeleafdemo.entity;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotEmpty;


@Entity
@Table(name = "roles")
public class Roles {

    // define fields
    @Id
    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "user_id")
    private Members members;

    @NotEmpty(message = "This field can't be empty")
    @Column(name = "roles")
    private String roles;


    // define constructors

    public Roles() {

    }

    public Roles(Members members, String roles) {
        this.members = members;
        this.roles = roles;
    }

    public Roles(String roles) {
        this.roles = roles;
    }
    // define getter/setter


    public Members getMembers() {
        return members;
    }

    public void setMembers(Members members) {
        this.members = members;
    }

    public String getRoles() {
        return roles;
    }

    public void setRoles(String roles) {
        this.roles = roles;
    }

    // define tostring


    @Override
    public String toString() {
        return "Roles{" +
                "members=" + members +
                ", roles='" + roles + '\'' +
                '}';
    }
}











