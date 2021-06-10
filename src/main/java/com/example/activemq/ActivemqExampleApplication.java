package com.example.activemq;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.jms.annotation.EnableJms;

@SpringBootApplication
public class ActivemqExampleApplication {

	public static void main(String[] args) {
		SpringApplication.run(ActivemqExampleApplication.class, args);
	}

}
