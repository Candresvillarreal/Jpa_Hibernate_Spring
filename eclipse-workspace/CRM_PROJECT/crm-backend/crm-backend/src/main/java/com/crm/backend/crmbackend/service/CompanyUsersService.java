package com.crm.backend.crmbackend.service;

import com.crm.backend.crmbackend.model.CompanyUsers;
import com.crm.backend.crmbackend.repository.CompanyUsersRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class CompanyUsersService {

    @Autowired
    private CompanyUsersRepository companyUsersRepository;

    public void save(CompanyUsers companyUser){

    }

    public List<CompanyUsers> listAll(){
        return null;

    }

    public CompanyUsers get(Integer id){
        return null;
    }

}
