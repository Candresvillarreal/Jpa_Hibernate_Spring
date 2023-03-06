package com.crm.backend.crmbackend.model;

import jakarta.persistence.*;

import java.util.Set;

@Entity
public class Customer {

    //Relations with entities
    @OneToMany(mappedBy = "customer")
    private Set<Opportunity> opportunities;

    //Attributes
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idCustomer;
    private int idOpportunity;

    //Constructor - Getters and setters

    public Customer() {
    }

    public int getIdCustomer() {
        return idCustomer;
    }

    public void setIdCustomer(int idCustomer) {
        this.idCustomer = idCustomer;
    }

    public int getIdOpportunity() {
        return idOpportunity;
    }

    public void setIdOpportunity(int idOpportunity) {
        this.idOpportunity = idOpportunity;
    }

    public Set<Opportunity> getOpportunities() {
        return opportunities;
    }

    public void setOpportunities(Set<Opportunity> opportunities) {
        this.opportunities = opportunities;
    }
}
