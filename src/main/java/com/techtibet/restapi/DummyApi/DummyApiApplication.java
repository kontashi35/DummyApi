package com.techtibet.restapi.DummyApi;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class DummyApiApplication {
	@Bean
	ObjectMapper getObjectMapper(){
		return  new ObjectMapper();
	}
	public static void main(String[] args) {
		SpringApplication.run(DummyApiApplication.class, args);
	}

}
