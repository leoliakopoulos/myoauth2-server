package com.lt.myoauth2server;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration;

@SpringBootApplication(exclude = {SecurityAutoConfiguration.class})
public class Myoauth2ServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(Myoauth2ServerApplication.class, args);
	}

}
