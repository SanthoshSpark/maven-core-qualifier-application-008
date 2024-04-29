package com.spring.core.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

@SpringBootApplication
public class App {

	public static void main(String[] args) {
		SpringApplication.run(App.class, args);
		execute();
	}
	
	public static void execute() {
        try (AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class)) {
            // Retrieve the University bean from the context
            University university = context.getBean(University.class);

            // Use the University object to display university information
            university.displayUniversityInfo();
        }
    }

	
	

}
