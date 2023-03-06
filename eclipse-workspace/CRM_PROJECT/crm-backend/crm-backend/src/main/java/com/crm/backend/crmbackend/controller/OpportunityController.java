package com.crm.backend.crmbackend.controller;

import com.crm.backend.crmbackend.model.Opportunity;
import com.crm.backend.crmbackend.service.OpportunityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.List;


@RestController
@RequestMapping("/opportunities")
public class OpportunityController {

    @Autowired
    private OpportunityService opportunityService;

    //Create a new opportunity
    @PostMapping("/addOpportunity")
    public String add(@RequestBody Opportunity opportunity) {
        return null;
    }

    //Update an opportunity
    @PutMapping("/updateOpportunity/{id}")
    public ResponseEntity<Opportunity> update(@RequestBody Opportunity opportunity, @PathVariable Integer id){
        return null;
    }

    //Get all opportunities
    @GetMapping("/getAllOpportunities")
    public List<Opportunity> list(){
        return null;
    }

    //Get a opportunity by id
    @GetMapping("/getOpportunity/{id}")
    public ResponseEntity<Opportunity> get(@PathVariable Integer id){
        return null;
    }
}
