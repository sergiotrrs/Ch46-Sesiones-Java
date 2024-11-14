package com.superneto.app.service.impl;

import java.util.Optional;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.superneto.app.model.Customer;
import com.superneto.app.repository.CustomerRepository;
import com.superneto.app.service.CustomerService;

/**
 * La inyección de dependencias es un patrón de diseño que permite
 * la creación de objetos y la gestión de sus dependencias de manera
 * automática.
 * 
 * En lugar de crear los objetos directamente, la inyección de dependencias
 * se encarga de proporcionar las dependencias necesarias a través de un
 * contenedor de inversión de control.
 * 
 * La responsabilidad de crear y administrar los objetos se delega la contenedor
 * de Spring.
 * 
 *  @Component es una anotación genérica que se utiliza
*  para indicar que la clase es componente de Spring
*  y debe ser gestionada por el contenedor
*  de inversión de control (IoC).
*  
*  @Component se aplica a una clase para que Spring
*  la detecte automáticamente y la registre como un bean
*  en el contexto de la aplicación.
*  
*  @Qualifer se usa para resolver ambiguedades cuando
*  hay varios objetos(beans) del mismo tipo en
*  el contexto de la aplicación y se necesita especificar
*  el bean que se debe inyectar.
*  
*  Bean: Es un objeto administrado por el contenedor de Spring.
 */
@Service
public class CustomerServiceImpl implements CustomerService {
	
	// @Autowired 1era forma de inyección de dependencia
	CustomerRepository customerRepository;	
	
	// 2a forma de inyección de dependencia
	public CustomerServiceImpl(CustomerRepository customerRepository) {
		this.customerRepository = customerRepository;
	}

	@Override
	public Customer createCustomer(Customer customer) {
		Optional<Customer> optionalCustomer = customerRepository.findByEmail(customer.getEmail());
		if( optionalCustomer.isPresent()) {
			throw new IllegalStateException("Customer already exist with email " + customer.getEmail());
		}
		// TODO Verificar si los atributos son válidos
		customer.setActive(true); // activar cliente
		customer.setId(null); // forzar la creación del cliente		
		Customer newCustomer = customerRepository.save( customer );
		return newCustomer;
	}

	@Override
	public Customer getCustomerById(Long id) {
		Optional<Customer> optionalCustomer = customerRepository.findById(id);
		if( optionalCustomer.isEmpty()) {
			// Lanzar una excepción.
			throw new IllegalStateException("Customer does not exist with id " + id);
		}
		Customer existingCustomer = optionalCustomer.get();
		return existingCustomer;
	}

	@Override
	public Customer getCustomerByEmail(String email) {
		Optional<Customer> optionalCustomer = customerRepository.findByEmail(email);
		if( optionalCustomer.isEmpty()) {
			throw new IllegalStateException("Customer does not exist with email " + email);
		}
		return optionalCustomer.get();
	}

	@Override
	public Set<Customer> getAllUsers(boolean isActive) {
		Set<Customer> customers;
		if( isActive ) {
			customers = customerRepository.findAllByActiveTrue();
		} else {
			customers = customerRepository.findAllByActiveFalse();
		}
		return customers;
	}

	@Override
	public Customer updateCustomer(Customer customer, Long id) {
		// TODO verificar los nuevos atributos a cambiar
		Customer existingCustomer = getCustomerById(id);
		existingCustomer.setFirstName( customer.getFirstName() );
		existingCustomer.setLastName( customer.getLastName() );
		// ID y email no se permite modificar
		return customerRepository.save(existingCustomer);
	}

	@Override
	public void deleteCustomer(Long id) {
		Customer existingCustomer = getCustomerById(id);
		// customerRepository.delete(existingCustomer);
		existingCustomer.setActive(false); // desactivar al usuario
		customerRepository.save(existingCustomer);
	}

}


/**
 * Una excepción es una situación no esperada
 * durante la ejecución de un programa.
 * 
 * Existen dos tipos de excepciones.
 * 
 * A) Checked Exceptions: Son  excepciones que se heredan
 * de la clase Exceptions. Se tiene que declarar la excepción
 * en la firma del método o bien manejar la excepción con 
 * el bloque try-catch.
 * 
 * B) Unchecked Exceptions: Son excepciones que se heredan
 * de la clase RuntimeException. No se está obligado a procesarlas.
 * Es opcional el uso de try-catch o declar en la firma del método.
 * 
 * Las excepciones de Error, son arrojadas por la JVM, son errores
 * de los que no se pueden recuperar.
 * 
 * Manejo de excepciones con el bloque try-catch
 * 
 * Sintaxis:
 * 
 *  try{
 *  
 *  }
 *  catch(exception e  ){
 *  
 *  }
 * 
 * try: bloque que contendrá sentencias que pudieran generar una excepción.
 * catch: se ejecutará si ocurre una excepción en try
 * finally: se ejecutará después de try o catch.
 * 
 * El stacktrace de una excepción es el conjunto
 * de mensajes desde el origen de la excepción
 * hasta la última clase que recibe la excepción.
 * 
 * 
 */
