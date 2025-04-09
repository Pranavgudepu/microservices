package com.embokx.companyms.company.service;

import com.embokx.companyms.company.entity.Company;
import com.embokx.companyms.company.repository.CompanyRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CompanyService {

    @Autowired
    private CompanyRepository companyRepository;

    public Company createCompany(Company company) {
        return companyRepository.save(company);
    }

    public Company getcompanyById(Long id) {
        return companyRepository.findById(id).orElse(null);
    }

    public List<Company> getAllCompanies() {
        return companyRepository.findAll();

    }

    public Company updateCompany(long id, Company company) {
        Company oldCompany = companyRepository.findById(id).orElse(null);
        if (oldCompany != null) {
            oldCompany.setCompany_name(company.getCompany_name());
            oldCompany.setCompany_description(company.getCompany_description());
            return companyRepository.save(oldCompany);
        }
        return null;
    }

    public Company deleteById(long id) {
        Company oldCompany = companyRepository.findById(id).orElse(null);
        if (oldCompany != null) {
            companyRepository.deleteById(id);
            return oldCompany;

        }
        return null;
    }

    public List<Company> deleteAll() {
        List<Company> companies = companyRepository.findAll();
        companyRepository.deleteAll();
        return companies;
    }


}
