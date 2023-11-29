package com.example.demo.dto;

import lombok.AllArgsConstructor;
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
public class AddressDto {
	
	public Integer id;
	public String addr1;
	public String addr2;
	public String city;
	public String state;
	public String country;
	
	
}
