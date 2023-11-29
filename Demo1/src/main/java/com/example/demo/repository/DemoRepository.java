package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.domain.Demo;

/*
 * Created by Sugeet Patel
 */

public interface DemoRepository extends JpaRepository<Demo, Integer> {

}
