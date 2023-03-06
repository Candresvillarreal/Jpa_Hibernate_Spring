package com.crm.backend.crmbackend.service;

import com.crm.backend.crmbackend.model.Contact;
import com.crm.backend.crmbackend.repository.ContactRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class ContactService {

    @Autowired
    private ContactRepository contactRepository;

    public void save(Contact contact){
    }

    public List<Contact> listAll(){
        return null;
    }

    public Contact get(Integer id){
        return null;
    }



}
