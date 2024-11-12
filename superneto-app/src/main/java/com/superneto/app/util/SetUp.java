package com.superneto.app.util;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;

import com.superneto.app.model.Customer;
import com.superneto.app.repository.CustomerRepository;

/**
* CommandLineRunner es una interfaz en Spring Boot que se 
* usa para ejecutar código específico una vez que la 
* aplicación ha iniciado completamente. Es particularmente 
* útil para ejecutar tareas de inicialización o configuración 
* cuando se arranca la aplicación.
*/
@Configuration
public class SetUp implements CommandLineRunner {
	
	@Autowired
	CustomerRepository repository;

	@Override
	public void run(String... args) throws Exception {
	      // save a few customers
	      repository.save(new Customer("Jack", "Bauer"));
	      repository.save(new Customer("Chloe", "O'Brian"));
	      repository.save(new Customer("Kim", "Bauer"));
	      repository.save(new Customer("David", "Palmer"));
	      repository.save(new Customer("Michelle", "Dessler"));
		
	}

}
