package com.superneto.app.service.impl;

import java.util.Optional;

import org.springframework.stereotype.Service;

import com.superneto.app.model.Customer;
import com.superneto.app.repository.CustomerRepository;
import com.superneto.app.service.LoginCustomerService;

@Service
public class CustomerLoginServiceImpl implements LoginCustomerService {
	
	CustomerRepository customerRepository;
		
	public CustomerLoginServiceImpl(CustomerRepository customerRepository) {
		this.customerRepository = customerRepository;
	}

	@Override
	public Customer loginCustomer(Customer customer) {
		String email = customer.getEmail();
		Optional<Customer > optionalCustomer = customerRepository.findByEmail(email);
		if( optionalCustomer.isPresent() ) {
			Customer existingCustomer = optionalCustomer.get();
			if( existingCustomer.getPassword().equals( customer.getPassword()) ) {
				return existingCustomer;
			}
		}
		throw new IllegalStateException("Incorrect e-mail or password");				
	}

}
