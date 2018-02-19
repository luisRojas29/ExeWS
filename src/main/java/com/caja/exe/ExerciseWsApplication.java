package com.caja.exe;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.boot.context.properties.EnableConfigurationProperties;

@SpringBootApplication
@EnableConfigurationProperties
@EntityScan(basePackages = {"com.caja.entities"})
public class ExerciseWsApplication {

	public static void main(String[] args) {
		SpringApplication.run(ExerciseWsApplication.class, args);
	}
}
