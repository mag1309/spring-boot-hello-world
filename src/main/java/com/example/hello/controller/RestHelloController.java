package com.example.hello.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RestHelloController {
	
	@Autowired
	Environment env;
	
	@GetMapping("/rest-hello/{name}")
	public ResponseEntity<String> getHello(@PathVariable String name) {
		return new ResponseEntity<String>("Hello, " + name + ":" + env.getProperty("local.server.port"), HttpStatus.OK);
	}
}