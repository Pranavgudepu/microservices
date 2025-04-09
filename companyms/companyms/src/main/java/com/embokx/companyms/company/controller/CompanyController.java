package com.embokx.companyms.company.controller;

import com.embokx.companyms.company.entity.Company;
import com.embokx.companyms.company.service.CompanyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/company")
public class CompanyController {
    @Autowired
    private CompanyService companyService;

    @PostMapping("/addcompany")
    public Company createCompany(@RequestBody Company company) {
        return companyService.createCompany(company);
    }

    @GetMapping("/getcompany/{id}")
    public Company getCompanyById(@PathVariable long id) {
        return companyService.getcompanyById(id);

    }

    @GetMapping("/getallcompanies")
    public List<Company> getAllCompanies() {
        return companyService.getAllCompanies();
    }

    @PutMapping("/updatecompany/{id}")
    public Company updateCompany(@PathVariable long id, @RequestBody Company company) {
        return companyService.updateCompany(id, company);
    }

    @DeleteMapping("/deletecompany/{id}")
    public Company deleteCompany(@PathVariable long id) {
        return companyService.deleteById(id);
    }

    @DeleteMapping("/deleteallcompanies")
    public List<Company> deleteAllCompanies() {
        return companyService.deleteAll();
    }

}
