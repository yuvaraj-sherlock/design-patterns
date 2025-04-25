package com.designpatterns;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DesignpatternsApplication {

	public static void main(String[] args) {
		SpringApplication app = new SpringApplication(DesignpatternsApplication.class);
		app.setBanner((environment, sourceClass, out) -> {
			out.println("=== Welcome to My Custom Spring Boot App ===");
		});
		app.run(args);
	}

}
