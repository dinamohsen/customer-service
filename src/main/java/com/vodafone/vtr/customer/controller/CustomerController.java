package com.vodafone.vtr.customer.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/customer")
public class CustomerController {

	@GetMapping("/ping")
	public String getTestMessage() {
		return "Hi Customer";
	}
	
}
