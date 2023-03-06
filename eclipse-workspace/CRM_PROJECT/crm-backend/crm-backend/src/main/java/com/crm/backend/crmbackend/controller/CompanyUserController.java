package com.crm.backend.crmbackend.controller;

import com.crm.backend.crmbackend.model.CompanyUsers;
import com.crm.backend.crmbackend.service.CompanyUsersService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/users")
public class CompanyUserController {

    @Autowired
    private CompanyUsersService companyUsersService;

    //Create a new company user
    @PostMapping("/addUser")
    public String add(@RequestBody CompanyUsers companyUser){
       return null;
    }

    //Update a company user
    @PutMapping("/updateUser/{id}")
    public ResponseEntity<CompanyUsers> update(@RequestBody CompanyUsers user, @PathVariable int id){
        return null;
    }

    //Get all company users
    @GetMapping("/getAllUsers")
    public List<CompanyUsers> list(){
        return null;
    }

    //Get a company user by id
    @GetMapping("/getUser/{id}")
    public ResponseEntity<CompanyUsers> get(@PathVariable int id){
        return null;
    }
}
