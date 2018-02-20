package com.caja.exe;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EnableJpaRepositories
@EntityScan(basePackages = {"com.caja.entities"})
@ComponentScan("com.caja.services")
public class ExerciseWsApplication {

	public static void main(String[] args) {
		SpringApplication.run(ExerciseWsApplication.class, args);
	}
}
