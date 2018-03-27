package com.example.jogging;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@SpringBootApplication
@EnableJpaAuditing
public class JoggingApplication {

	public static void main(String[] args) {
		SpringApplication.run(JoggingApplication.class, args);
	}
}
