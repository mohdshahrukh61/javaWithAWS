package com.example.demo.handler;

import java.text.ParseException;
import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.amazonaws.services.lambda.runtime.Context;
import com.amazonaws.services.lambda.runtime.LambdaLogger;
import com.example.demo.DTO.IdRequest;
import com.example.demo.entity.CompanyMaster1;
import com.example.demo.repo.CompanyMasterRepository;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class CompanyMasterHandler {
	private CompanyMasterRepository companyMasterRepository = new CompanyMasterRepository();

	public Object requestHandler(CompanyMaster1 master, Context context) {

		LambdaLogger logger = context.getLogger();
		logger.log("portfolio" + master.toString());
		CompanyMaster1 b = companyMasterRepository.save(master);
		logger.log(b.toString());
		return "successfully created";
	}

	

}
