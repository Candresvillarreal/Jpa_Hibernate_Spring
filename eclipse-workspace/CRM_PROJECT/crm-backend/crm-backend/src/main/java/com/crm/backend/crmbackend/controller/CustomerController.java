package com.crm.backend.crmbackend.controller;

import com.crm.backend.crmbackend.model.Customer;
import com.crm.backend.crmbackend.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/customers")
public class CustomerController {

    @Autowired
    private CustomerService customerService;

    //Create a new customer
    @PostMapping("/addCustomer")
    public String add(@RequestBody Customer customer) {
        return null;
    }

    //Update a customer
    @PutMapping("/updateCustomer/{id}")
    public ResponseEntity<Customer> update(@RequestBody Customer customer, @PathVariable int id){
        return null;
    }

    //Get all customers
    @GetMapping("/getAllCustomers")
    public List<Customer> list(){
        return null;
    }

    //Get a customer by id
    @GetMapping("/getCustomer/{id}")
    public ResponseEntity<Customer> get(@PathVariable int id){
        return null;
    }
}
