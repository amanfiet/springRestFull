package com.aman.springbootrestfull;

import java.util.Date;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
@RequestMapping("spring")
public class SpringbootrestfullApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringbootrestfullApplication.class, args);
	}
	
	@GetMapping("data")
	public String welcome(){
		
		System.out.println("inside ");
		
		return new Date().toString();
	}

}
