package com.dev1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class Dev1Application {
	
	@GetMapping("/")
	public String getMassage() {
		
		hello.print();
				
		return "devops...!   ";
		
	}
	public static void main(String[] args) {
		SpringApplication.run(Dev1Application.class, args);
	}

}
