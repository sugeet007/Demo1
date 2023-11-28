package com.example.demo.service;


import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

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
		return demo;
	}
	
	@Override
	public List<Demo> getDemo() {
		List<Demo> demoList = new ArrayList<>();
		demoList = demoRepository.findAll();
		return demoList;
		
	}
	
	@Override
	public Demo createDemo(Demo demo) {
		//Demo demo = DemoMapper.MAPPER.mapToDemo(demoDto);
		Demo savedDemo = demoRepository.save(demo);
		
		//DemoDto savedDemoDto = DemoMapper.MAPPER.mapToDemoDto(savedDemo);
		return savedDemo;		
	}
	
	

}
