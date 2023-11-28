package com.example.demo.service;


import java.util.List;

import com.example.demo.domain.Demo;
import com.example.demo.dto.DemoDto;

public interface DemoService {
	
	public Demo saveDemo(Demo demo);
	
	public Demo getDemoByID(Integer id);
	
	public List<Demo> getDemo();
	
	public Demo createDemo(DemoDto demoDto);
	
	public DemoDto getDemoMapperByID(Integer id);
	
	public List<DemoDto> getAllMapperDemo();

}
