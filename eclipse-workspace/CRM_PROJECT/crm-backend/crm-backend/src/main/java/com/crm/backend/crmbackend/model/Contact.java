package com.crm.backend.crmbackend.model;

import jakarta.persistence.*;

import java.util.Date;
import java.util.List;

@Entity
public class Contact {

    //Entity relations
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name="idOpportunity")
    private Opportunity opportunityC;

    //Attributes

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idContact;
    private int idReason;
    private String Reason;
    private String Observations;
    private Date date;
    private boolean finished;

    //Constructor - Getters and setters

    public Contact() {
    }

    public int getIdContact() {
        return idContact;
    }

    public void setIdContact(int idContact) {
        this.idContact = idContact;
    }

    public String getReason() {
        return Reason;
    }

    public void setReason(String reason) {
        Reason = reason;
    }

    public String getObservations() {
        return Observations;
    }

    public void setObservations(String observations) {
        Observations = observations;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public boolean isFinished() {
        return finished;
    }

    public void setFinished(boolean finished) {
        this.finished = finished;
    }

    public int getIdReason() {
        return idReason;
    }

    public void setIdReason(int idReason) {
        this.idReason = idReason;
    }

    public Opportunity getOpportunity() {
        return opportunityC;
    }

    public void setOpportunity(Opportunity opportunity) {
        this.opportunityC = opportunityC;
    }
}
