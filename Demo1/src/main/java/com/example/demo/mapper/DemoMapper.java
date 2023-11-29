package com.example.demo.mapper;

import java.util.List;

import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import com.example.demo.domain.Address;
import com.example.demo.domain.Demo;
import com.example.demo.dto.AddressDto;
import com.example.demo.dto.DemoDto;

/*
 * Created by Sugeet Patel
 */

@Mapper(componentModel = "spring")
public interface DemoMapper {
	
	DemoMapper MAPPER = Mappers.getMapper(DemoMapper.class);
	
	
	//if field name is different then use below annotation
	//@Mapping(source = "lastname", target = "lastName")
	
	//if you need to remove any field for mapping then add below line for eg..
	//@Mapping(target = "lastname", ignore = true)
	//@Mapping(source = "demo.address", target = "addr")
	DemoDto mapToDemoDto(Demo demo);
	
	//@Mapping(source = "address", target = "addr")
	AddressDto mapToAddressDto(Address address);

	//@Mapping(source = "lastName", target = "lastname")
    Demo mapToDemo(DemoDto userDto);
    
    List<DemoDto> mapToDemoDtos(List<Demo> demo);

}
