package com.crm.backend.crmbackend.service;

import com.crm.backend.crmbackend.model.Opportunity;
import com.crm.backend.crmbackend.repository.OpportunityRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class OpportunityService {

    @Autowired
    private OpportunityRepository oR;

    public void save(Opportunity opportunity){

    }

    public List<Opportunity> listAll(){

        return null;

    }

    public Opportunity get(Integer id){

        return null;

    }

    public boolean checkNewOportunity(Opportunity opportunity){

        return false;
    }

}
