package com.crm.backend.crmbackend.model;


import jakarta.persistence.*;

@Entity
public class CompanyUsers {

    //Attributes
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idUser;
    private String name;
    private String password;

    //Constructor - Getters and Setters

    public CompanyUsers() {
    }

    public CompanyUsers(int idUser, String name, String password) {
        this.idUser = idUser;
        this.name = name;
        this.password = password;
    }

    public int getIdUser() {

        return idUser;
    }

    public void setIdUser(int idUser) {

        this.idUser = idUser;
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
}
