package com.crm.backend.crmbackend.model;

import jakarta.persistence.*;

import java.util.List;
import java.util.Set;

@Entity
public class Opportunity {

    //Relation with Customer
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name="idCustomer")
    private Customer customer;

    //Relation with Contatcs
    @OneToMany(fetch = FetchType.LAZY, mappedBy = "opportunityC")
    private Set<Contact> contacts;

    //Relation with Reasons
    @OneToMany(fetch = FetchType.LAZY, mappedBy = "opportunityR")
    private Set<Reasons> reasons;

    //Attributes
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idOpportunity;
    private String CIF;
    private String Name;
    private String PhoneNumber;
    private boolean Success;

    //Constructor - Getters and setters

    public Opportunity() {
    }

    public int getIdOpportunity() {

        return idOpportunity;
    }

    public void setIdOpportunity(int idOpportunity) {

        this.idOpportunity = idOpportunity;
    }

    public String getCIF() {

        return CIF;
    }

    public void setCIF(String CIF) {

        this.CIF = CIF;
    }

    public String getName() {

        return Name;
    }

    public void setName(String name) {

        Name = name;
    }

    public String getPhoneNumber() {
        return PhoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {

        PhoneNumber = phoneNumber;
    }

    public boolean isSuccess() {
        return Success;
    }

    public void setSuccess(boolean success) {
        Success = success;
    }

    public Set<Contact> getContacts() {
        return contacts;
    }

    public void setContacts(Set<Contact> contacts) {
        this.contacts = contacts;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public Set<Reasons> getReasons() {
        return reasons;
    }

    public void setReasons(Set<Reasons> reasons) {
        this.reasons = reasons;
    }
}
