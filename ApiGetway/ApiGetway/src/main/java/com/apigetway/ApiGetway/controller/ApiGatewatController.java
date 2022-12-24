package com.apigetway.ApiGetway.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ApiGatewatController {

	@GetMapping("/ContactServiceFallback")
	public String getFallbackMegContactService() {
		return "ContactService is down";
	}

	@GetMapping("/UserServiceFallback")
	public String getFallbackMegUserService() {
		return "UserService is down";
	}
}
