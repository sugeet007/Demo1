package com.example.demo.service;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

import com.example.demo.domain.Demo;
import com.example.demo.exception.ResourceNotFoundException;
import com.example.demo.repository.DemoRepository;

@Service
public class DemoServiceImpl implements DemoService {
	
	@Autowired
	public DemoRepository demoRepository;

	@Override
	public Demo saveDemo(Demo demo) {
		
		return demoRepository.save(demo);
	}

	@Override
	public Demo getDemoByID(Integer id) {
		Demo demo = demoRepository.findById(id).orElseThrow(() -> new ResourceNotFoundException("Demo with given id is not found on server !! : "+id));
		//Optional<Demo> demo = demoRepository.findById(id).orElseThrow(() -> new ResourceNotFoundException("Demo with given id is not found on server !! : "+id));
		return demo;
	}

}
