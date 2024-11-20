package com.superneto.app.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.superneto.app.model.Customer;
import com.superneto.app.service.LoginCustomerService;

@RestController
@RequestMapping("api/v1/login")
@CrossOrigin(origins = "*")
public class LoginCustomerController {

	LoginCustomerService loginCustomerService;

	public LoginCustomerController(LoginCustomerService loginCustomerService) {	
		this.loginCustomerService = loginCustomerService;
	}
	
	@PostMapping
	ResponseEntity<Customer> loginUser(@RequestBody Customer customer){
		Customer existingCustomer =  loginCustomerService.loginCustomer(customer);
		return ResponseEntity.ok(existingCustomer);
	}
	
}
