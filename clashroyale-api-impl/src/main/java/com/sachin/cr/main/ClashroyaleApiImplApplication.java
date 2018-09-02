package com.sachin.cr.main;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages="com.sachin")
public class ClashroyaleApiImplApplication{

	public static void main(String[] args) {
		SpringApplication.run(ClashroyaleApiImplApplication.class, args);
	}
}
