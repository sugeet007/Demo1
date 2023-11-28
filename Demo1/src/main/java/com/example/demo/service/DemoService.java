package com.example.demo.service;


import java.util.List;

import com.example.demo.domain.Demo;

public interface DemoService {
	
	public Demo saveDemo(Demo demo);
	
	public Demo getDemoByID(Integer id);
	
	public List<Demo> getDemo();
	
	public Demo createDemo(Demo demo);

}
