package com.load_api.load_management;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
//@ComponentScan(basePackages = "com.load_api.load_management.service.LoadService")
//@EntityScan("com.load_api.load_management.entities.loadEntity")
public class LoadManagementApplication {

	public static void main(String[] args) {
		SpringApplication.run(LoadManagementApplication.class, args);
	}

}
