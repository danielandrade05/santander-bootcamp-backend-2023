package me.dio;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;

@OpenAPIDefinition(servers = { @Server(url = "/", description = "Default Server URL") })

@SpringBootApplication
public class SantanderBootcampBackend2023Application {

	public static void main(String[] args) {
		SpringApplication.run(SantanderBootcampBackend2023Application.class, args);
	}

}