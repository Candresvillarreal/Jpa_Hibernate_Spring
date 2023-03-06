package com.crm.backend.crmbackend.repository;

import com.crm.backend.crmbackend.model.CompanyUsers;
import com.crm.backend.crmbackend.model.Contact;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ContactRepository extends JpaRepository<Contact, Integer> {
}
