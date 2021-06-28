package com.personal.starter;

import com.personal.starter.simple.placeholder.PlaceholderBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class StarterApplication {

	@Autowired
	PlaceholderBean placeholderBean;

	public static void main(String[] args) {
		SpringApplication.run(StarterApplication.class, args);
	}

}
