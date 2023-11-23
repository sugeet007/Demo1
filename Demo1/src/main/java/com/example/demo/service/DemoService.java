package com.example.demo.service;

import java.util.Optional;

import com.example.demo.domain.Demo;

public interface DemoService {
	
	public Demo saveDemo(Demo demo);
	
	public Demo getDemoByID(Integer id);

}
