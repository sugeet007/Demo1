package com.example.demo.controller;

import java.util.Optional;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.domain.Demo;
import com.example.demo.service.DemoService;

@RestController
@RequestMapping("/demo")
public class DemoController {
	
	@Autowired
	public DemoService demoService;
	
	private Logger logger = LoggerFactory.getLogger(DemoController.class);
	
	@GetMapping("/{id}")	
	public ResponseEntity<Demo> getDemoById(@PathVariable Integer id){
	    Demo demo	= demoService.getDemoByID(id); 
	    logger.info("Controller Demo ID:- "+id);
		return ResponseEntity.ok(demo);
	}
	
	@PostMapping
	public ResponseEntity<Demo> saveUser(@RequestBody Demo demo){
		Demo demo1 = demoService.saveDemo(demo);
		return ResponseEntity.status(HttpStatus.CREATED).body(demo1);
	}

}
