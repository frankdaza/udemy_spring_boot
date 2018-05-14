package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DemoDevToolsApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoDevToolsApplication.class, args);
		
		MyAppConfig myAppConfig = new MyAppConfig();
		System.out.println(myAppConfig.toString());
	}
}
