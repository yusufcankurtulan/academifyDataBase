package com.example.academify;

import com.example.academify.controller.UserProfileController;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = "com.example.academify.service")
public class AcademifyApplication {

	public static void main(String[] args) {
		SpringApplication.run(AcademifyApplication.class, args);
	}

}
