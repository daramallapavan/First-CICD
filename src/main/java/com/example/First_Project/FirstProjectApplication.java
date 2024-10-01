package com.example.First_Project;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class FirstProjectApplication {

	@GetMapping
	public String m1(){
		return "Welcome .....";
	}
	@GetMapping("/get")
	public String m2(){
		return "Welcome2 .....";
	}


	public static void main(String[] args) {
		SpringApplication.run(FirstProjectApplication.class, args);
	}

}
