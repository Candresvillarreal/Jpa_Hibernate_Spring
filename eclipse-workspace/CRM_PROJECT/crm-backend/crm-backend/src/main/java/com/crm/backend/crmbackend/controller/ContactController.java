package com.crm.backend.crmbackend.controller;

import com.crm.backend.crmbackend.model.Contact;
import com.crm.backend.crmbackend.service.ContactService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping("/contacts")
public class ContactController {
    @Autowired
    private ContactService contactService;

    //Create a new contact
    @PostMapping("/addContact")
    public String add(@RequestBody Contact contact){
        return null;
    }
    //Update a contact
    @PutMapping("/updateContact/{id}")
    public ResponseEntity<Contact> update(@RequestBody Contact contact, @PathVariable Integer id){
       return null;
    }
    //Get all contacts
    @GetMapping("/getAllContacts")
    public List<Contact> list(){
        return null;
    }
    //Get a contatcs by id
    @GetMapping("/getContact/{id}")
    public ResponseEntity<Contact> get(@PathVariable Integer id){
        return null;
    }
}
