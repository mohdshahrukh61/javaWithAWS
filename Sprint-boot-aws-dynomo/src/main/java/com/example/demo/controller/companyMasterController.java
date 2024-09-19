package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;


import com.example.demo.config.DynoConfiguration;
import com.example.demo.entity.CompanyMaster1;
import com.example.demo.repo.CompanyMasterRepository;

@RestController  
public class companyMasterController {
	private DynoConfiguration configuration = new DynoConfiguration();
	@Autowired
 CompanyMasterRepository companyMasterRepository;
	
	@PostMapping("/saveCompany")
	public CompanyMaster1 saveCompanyMaster1(@RequestBody CompanyMaster1 companyMaster)
	{
		return companyMasterRepository.save(companyMaster);
	}
	
}
