package com.example.demo.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.amazonaws.auth.AWSCredentials;
import com.amazonaws.auth.AWSStaticCredentialsProvider;
import com.amazonaws.auth.BasicAWSCredentials;
import com.amazonaws.services.s3.AmazonS3;
import com.amazonaws.services.s3.AmazonS3ClientBuilder;
@Configuration
public class S3config {


	    @Bean
	    public AmazonS3 s3(){

	        AWSCredentials awsCredentials=new BasicAWSCredentials("AKIAZMJOMPPJY3NHZEER","dZtXF9oG7xiWPV05uZ7B6aGgCyRo3BrZvuuM1KJR");


	        return AmazonS3ClientBuilder.standard().withRegion("ap-south-1").withCredentials(new AWSStaticCredentialsProvider(awsCredentials)).build();

	    }
}
