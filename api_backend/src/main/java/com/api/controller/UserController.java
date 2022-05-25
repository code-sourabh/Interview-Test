package com.api.controller;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.api.entity.User;

@CrossOrigin(origins = "http://localhost:3000")
@RestController
@RequestMapping("/api")
public class UserController {
	@RequestMapping("/")
	public String hello() {
		return "hello workd";
	}
	
	@GetMapping("/{username}")
	public Object getUser(@PathVariable String username) {
		String url = "https://leetcode-stats-api.herokuapp.com/"+username;
		System.out.println("url =  "+url);
		RestTemplate restTemplate = new RestTemplate();
		
		User user = restTemplate.getForObject(url, User.class);
		System.out.println(user);
		
		
		
		return user;
	}
}
