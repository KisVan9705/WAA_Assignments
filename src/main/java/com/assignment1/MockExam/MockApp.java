package com.assignment1.MockExam;

import org.modelmapper.ModelMapper;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class MockApp {

	public static void main(String[] args) {
		SpringApplication.run(MockApp.class, args);
	}

	@Bean
	public ModelMapper modelMapper(){
		return new ModelMapper();
	}
//	@Bean
//	public UserMapper userMapper(){ return  new UserMapper();}

}
