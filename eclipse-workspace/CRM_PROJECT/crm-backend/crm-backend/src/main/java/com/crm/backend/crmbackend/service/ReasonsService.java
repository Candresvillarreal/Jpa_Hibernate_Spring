package com.crm.backend.crmbackend.service;

import com.crm.backend.crmbackend.model.Reasons;
import com.crm.backend.crmbackend.repository.ReasonsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ReasonsService {

    @Autowired
    private ReasonsRepository reasonsRepository;

    public void save(Reasons reasons){
    }

    public List<Reasons> listAll(){
        return null;
    }

    public Reasons get(Integer id){
        return null;
    }
}
