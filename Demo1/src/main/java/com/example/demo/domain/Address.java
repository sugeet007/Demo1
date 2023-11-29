package com.example.demo.domain;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

/*
 * Created by Sugeet Patel
 */

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity
@Table(name = "address")
public class Address {
	
	@Id
	public Integer id;
	public String addr1;
	public String addr2;
	public String city;
	public String state;
	public String country;
	
	
}
