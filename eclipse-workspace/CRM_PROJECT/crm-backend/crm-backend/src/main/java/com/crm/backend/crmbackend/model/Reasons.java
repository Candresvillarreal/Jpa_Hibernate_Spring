package com.crm.backend.crmbackend.model;

import jakarta.persistence.*;

@Entity
public class Reasons {

    //Relations with entities
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name="idOpportunity")
    private Opportunity opportunityR;

    //Attributes
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idReason;
    private String reason;

    //Constructor - Getters and setters

    public Reasons() {
    }

    public int getIdReason() {
        return idReason;
    }

    public void setIdReason(int idReason) {
        this.idReason = idReason;
    }

    public String getReason() {
        return reason;
    }

    public void setReason(String reason) {
        this.reason = reason;
    }

    public Opportunity getOpportunityR() {
        return opportunityR;
    }

    public void setOpportunity(Opportunity opportunity) {
        this.opportunityR = opportunityR;
    }
}
