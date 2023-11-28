package com.example.demo.mapper;

import java.util.List;

import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import com.example.demo.domain.Demo;
import com.example.demo.dto.DemoDto;

@Mapper(componentModel = "spring")
public interface DemoMapper {
	
	DemoMapper MAPPER = Mappers.getMapper(DemoMapper.class);
	
	
	//if field name is different then use below annotation
	//@Mapping(source = "lastname", target = "lastName")
	DemoDto mapToDemoDto(Demo demo);

	//@Mapping(source = "lastName", target = "lastname")
    Demo mapToDemo(DemoDto userDto);
    
    List<DemoDto> mapToDemoDtos(List<Demo> demo);

}
