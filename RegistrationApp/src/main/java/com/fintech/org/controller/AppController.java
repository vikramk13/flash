package com.fintech.org.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.fintech.org.model.AppUsers;
import com.fintech.org.service.AppService;

@RestController
@RequestMapping("/api")
public class AppController {
	@Autowired
	private AppService appservice;
	
	@PostMapping("/add")
	public String saveDetails(@RequestBody AppUsers appusers)
	{
		return appservice.add(appusers);
	}
	
	
	@GetMapping("/login")
	public String loginForm(@RequestBody AppUsers appUsers) 
	{
		return appservice.login(appUsers);
	}
	
	
	
	
	

}
