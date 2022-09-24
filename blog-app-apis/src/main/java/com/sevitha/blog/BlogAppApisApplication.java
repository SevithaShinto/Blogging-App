package com.sevitha.blog;

import org.modelmapper.ModelMapper;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class BlogAppApisApplication {

	public static void main(String[] args) {
		SpringApplication.run(BlogAppApisApplication.class, args);
	}

	//for reducing the LOC in UserServiceImpl class in dtoToUser() 
	//and userToDto() methods - need to add ModelMapper dependency
	//and autowire ModelMapper in UserServiceImpl class
	@Bean
	public ModelMapper modelMapper()
	{
		return new ModelMapper();
		
	}
}
