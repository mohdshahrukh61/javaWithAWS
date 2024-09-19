package com.example.demo.repo;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Repository;

import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBMapper;
import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBSaveExpression;
import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBScanExpression;
import com.amazonaws.services.dynamodbv2.model.AttributeValue;
import com.amazonaws.services.dynamodbv2.model.ComparisonOperator;
import com.amazonaws.services.dynamodbv2.model.Condition;
import com.amazonaws.services.dynamodbv2.model.ExpectedAttributeValue;
import com.example.demo.config.DynoConfiguration;
import com.example.demo.entity.CompanyMaster1;

@Repository
public class CompanyMasterRepository {
	ApplicationContext context = new AnnotationConfigApplicationContext(DynoConfiguration.class);
	DynamoDBMapper dbMapper = context.getBean(DynamoDBMapper.class);
	DynamoDBScanExpression scanExpression = new DynamoDBScanExpression();

	private DynoConfiguration configuration = new DynoConfiguration();

	public CompanyMaster1 save(CompanyMaster1 company) {
		configuration.dynamoDBMapper().save(company);
		return company;
	}

	
}
