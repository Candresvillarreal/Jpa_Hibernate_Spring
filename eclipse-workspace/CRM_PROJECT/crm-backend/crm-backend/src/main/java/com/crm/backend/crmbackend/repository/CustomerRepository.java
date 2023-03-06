package com.crm.backend.crmbackend.repository;

import com.crm.backend.crmbackend.model.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CustomerRepository extends JpaRepository <Customer, Integer> {

}
