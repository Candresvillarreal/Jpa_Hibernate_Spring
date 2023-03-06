package com.crm.backend.crmbackend.service;

import com.crm.backend.crmbackend.model.Customer;
import com.crm.backend.crmbackend.repository.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class CustomerService {

    @Autowired
    private CustomerRepository customerRepository;

    public void save(Customer customer){
    }
    public List<Customer> listAll(){
        return null;
    }

    public Customer get(Integer id){

        return null;
    }
}
