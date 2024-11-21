package com.superneto.app.service.impl;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.Optional;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;

import com.superneto.app.model.Customer;
import com.superneto.app.repository.CustomerRepository;
import com.superneto.app.service.CustomerService;

/*
*  Mockito es una biblioteca de pruebas unitarias
*  que se utiliza para simular objetos y comportamiento
*  de pruebas unitarias.
*  
*  Proporciona una forma sencilla y flexible de crear objetos
*  simulados(mocks) que se utilizan como sustitutos de los objetos
*  reales en las pruebas.
*  
*  En este ejercicio se simulará el objeto customerRepository
*  Para que entregue el valor que necesita el servicio de getCustomerById
*  de las clase CustomerService.
*/

//Lo siguiente inicializará automáticamente los objetos mock y
//las anotaciones de Mockito en la clase prueba
@ExtendWith(MockitoExtension.class)
public class CustomerServiceImplTest {
	
	// Inyectar automáticamente los objetos mocks en la clase bajo prueba.
	@InjectMocks
	private CustomerServiceImpl customerService;
	
	// Crea un objeto mock de una clase o interfaz determinada.
	// Este objeto mock puede ser utilizado para simular el
	// comportamiento de la clase o interfaz durante
	// la ejecución de la prueba unitaria.
	@Mock
	private CustomerRepository customerRepository;
	
	@Test
	void getUserByIdTest() {
		
		// Crear un objeto de prueba de la clase Customer
		Customer customerMock = new Customer("Christofer", "Robin");
		customerMock.setId(100L);
		customerMock.setEmail("christofer@disney.com");
		customerMock.setActive(true);
		
		// Definir el comportamiento esperado de un mock
		// ¿Qué va a realizar el objeto simulado?
		Long id = 100L;
		Mockito.when( customerRepository.findById( id )).
			thenReturn(  Optional.of(customerMock)  );
		
		// Invocar el método a probar
		Customer existingCustomer = customerService.getCustomerById(100L);
		
		// Realizar comparaciones
		assertEquals( 100L, existingCustomer.getId(), "Verificando el ID" );
		assertEquals( "christofer@disney.com", existingCustomer.getEmail(), "Verificando email" );
		assertEquals( "Robin", existingCustomer.getLastName(), "Verificando apellido" );
		
	}

}
