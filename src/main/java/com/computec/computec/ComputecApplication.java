package com.computec.computec;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication
public class ComputecApplication {

	public static void main(String[] args) {
		SpringApplication.run(ComputecApplication.class, args);
	}

}
