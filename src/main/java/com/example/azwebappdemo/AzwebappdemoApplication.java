package com.example.azwebappdemo;

import jdk.internal.vm.annotation.ReservedStackAccess;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class AzwebappdemoApplication {

	@GetMapping("/message")
	public String getMessage(){
		return "Hello World!";
	}
	public static void main(String[] args) {
		SpringApplication.run(AzwebappdemoApplication.class, args);
	}

}
