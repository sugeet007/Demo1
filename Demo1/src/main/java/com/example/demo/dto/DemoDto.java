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
public class DemoDto {

    private Integer id;

    private String firstname;

    private String lastname;
   
	private AddressDto address;
}
