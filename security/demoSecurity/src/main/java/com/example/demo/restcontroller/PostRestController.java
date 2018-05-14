package com.example.demo.restcontroller;

import org.springframework.security.access.annotation.Secured;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/posts")
public class PostRestController {
	
	@Secured("ROLE_USER")
	@RequestMapping("/list")
	public String list() {
		return "list posts...";
	}
	
	@Secured("ROLE_ADMIN")
	@RequestMapping("/add")
	public String addPost() {
		return "add posts...";
	}
	

}
