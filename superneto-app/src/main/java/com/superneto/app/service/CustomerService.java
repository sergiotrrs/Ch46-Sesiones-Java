package com.superneto.app.service;

import java.util.Set;

import com.superneto.app.model.Customer;

/**
 *  Una interfaz es una declaración formal de un contrato, en la
 *  cuál los métodos no contienen implementaciones.
 *  Es similar a los métodos abstractos.
 *  
 *  Una clase puede implementar varias interfaces.
 *  
 *  Las interfaces son adecuadas para proporcionar funcionalidad
 *  a clases que no están relacionadas entre si.
 *  
 *  Para patrones de diseño, se suele utilizar interfaces.
 */
public interface CustomerService {
	
	// Los métodos por default son de tipo public, abstract
	Customer createCustomer(Customer customer);
	Customer getCustomerById(Long id);
	Customer getCustomerByEmail(String email);
	Set<Customer> getAllUsers(boolean isActive);
	Customer updateCustomer(Customer customer, Long id);
	void deleteCustomer(Long id);
}
