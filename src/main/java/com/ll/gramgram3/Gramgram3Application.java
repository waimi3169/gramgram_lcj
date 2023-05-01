package com.ll.gramgram3;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@SpringBootApplication
@EnableJpaAuditing
public class Gramgram3Application {

	public static void main(String[] args) {
		SpringApplication.run(Gramgram3Application.class, args);
	}

}
