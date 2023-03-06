package com.crm.backend.crmbackend.repository;

import com.crm.backend.crmbackend.model.Opportunity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OpportunityRepository extends JpaRepository<Opportunity, Integer> {
}
