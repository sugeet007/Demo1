package com.example.demo.controller;

import java.util.List;

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
import com.example.demo.dto.DemoDto;
import com.example.demo.mapper.DemoMapper;
import com.example.demo.service.DemoService;

@RestController
@RequestMapping("/demo")
public class DemoController {
	
	@Autowired
	public DemoService demoService;
	
	@Autowired
	public DemoMapper mapper;
	
	private Logger logger = LoggerFactory.getLogger(DemoController.class);
	
	@GetMapping("/{id}")	
	public ResponseEntity<Demo> getDemoById(@PathVariable Integer id){
	    Demo demo	= demoService.getDemoByID(id); 
	    logger.info("Controller Demo ID:- "+id);
		return ResponseEntity.ok(demo);
	}
	
	@PostMapping
	public ResponseEntity<Demo> saveDemo(@RequestBody Demo demo){
		Demo demo1 = demoService.saveDemo(demo);
		return ResponseEntity.status(HttpStatus.CREATED).body(demo1);
	}
	
	@GetMapping()
	public ResponseEntity<List<Demo>> getAllDemo() {
		List<Demo> demoList = demoService.getDemo();
		return ResponseEntity.ok(demoList);
	}
	
	@PostMapping("/create")
	public ResponseEntity<Demo> createDemo(@RequestBody DemoDto demoDto){
		Demo demo = mapper.mapToDemo(demoDto);
		Demo demo1 = demoService.createDemo(demo);
		return ResponseEntity.status(HttpStatus.CREATED).body(demo1);
	}
	
	@GetMapping("/get/{id}")	
	public ResponseEntity<DemoDto> getCreateDemoById(@PathVariable Integer id){
		DemoDto demo1 = mapper.mapToDemoDto(demoService.getDemoByID(id));
	    logger.info("Controller Demo ID:- "+id);
		return ResponseEntity.ok(demo1);
	}
	
	@GetMapping("/get")
	public ResponseEntity<List<DemoDto>> getDemos() {
		List<DemoDto> demoList = mapper.mapToDemoDtos(demoService.getDemo());
		return ResponseEntity.ok(demoList);
	}

}
