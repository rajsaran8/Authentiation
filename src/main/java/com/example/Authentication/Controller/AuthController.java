package com.example.Authentication.Controller;

import java.io.IOException;
import java.nio.charset.StandardCharsets;

import javax.servlet.http.HttpServletRequest;

import org.apache.commons.io.IOUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;



@CrossOrigin
@RestController
@RequestMapping(path = "/")
public class AuthController {

	Logger logger = LoggerFactory.getLogger(AuthController.class);
	
	@PostMapping
	public ResponseEntity<Boolean> authenticateUsers(HttpServletRequest request) throws IOException{
		String json = IOUtils.toString(request.getInputStream(), StandardCharsets.UTF_8);
	    System.out.println("json = " + json);
	    logger.info(" " + System.getProperty("dbString"));
		return  ResponseEntity.status(HttpStatus.OK).body(true);
		
	}
}
