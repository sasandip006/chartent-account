package com.san.springboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
//@EnableWebMvc
//@PropertySource("classpath:application.properties")
public class Application {

	public static void main(String[] args) {
		System.out.println('J'+'A'+10+20);
		SpringApplication.run(Application.class, args);
	}
}
