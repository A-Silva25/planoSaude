package com.projectplanosaude.application;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@EntityScan(basePackages = "com.projectplanosaude.entity")
@EnableJpaRepositories(basePackages = "com.projectplanosaude.repository")
@ComponentScan(basePackages = "com.projectplanosaude.controller")
@SpringBootApplication
public class PlanoDeSaudeApplication {

	public static void main(String[] args) {
		SpringApplication.run(PlanoDeSaudeApplication.class, args);
	}

}
