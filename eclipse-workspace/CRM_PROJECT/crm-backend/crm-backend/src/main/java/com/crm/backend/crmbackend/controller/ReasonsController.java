package com.crm.backend.crmbackend.controller;

import com.crm.backend.crmbackend.model.Reasons;
import com.crm.backend.crmbackend.service.ReasonsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.NoSuchElementException;

@RestController
@RequestMapping("/reasons")
public class ReasonsController {


    @Autowired
    private ReasonsService reasonsService;

    //Create a new reason
    @PostMapping("/reason")
    public String add(@RequestBody Reasons reason) {
       return null;
    }

    //Update a reason
    @PutMapping("/updateReason/{id}")
    public ResponseEntity<Reasons> update(@RequestBody Reasons reason, @PathVariable Integer id){
      return null;
    }

    //Get all reasons
    @GetMapping("/getAllReasons")
    public List<Reasons> list(){

        return null;
    }

    //Get a reason by id
    @GetMapping("/getReasons/{id}")
    public ResponseEntity<Reasons> get(@PathVariable Integer id){
        return null;
    }
}


