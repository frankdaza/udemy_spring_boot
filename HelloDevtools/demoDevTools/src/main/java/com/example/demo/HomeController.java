package com.example.demo;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {
	
	@Value("${pageController.msg}")
	private String pageController;
	
	@RequestMapping("/")
	public String home() {
		return this.pageController;
	}

}
