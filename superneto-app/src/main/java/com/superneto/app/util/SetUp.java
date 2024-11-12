package com.superneto.app.util;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import com.superneto.app.model.Customer;
import com.superneto.app.model.Product;
import com.superneto.app.repository.CustomerRepository;
import com.superneto.app.repository.ProductRepository;

/**
* CommandLineRunner es una interfaz en Spring Boot que se 
* usa para ejecutar código específico una vez que la 
* aplicación ha iniciado completamente. Es particularmente 
* útil para ejecutar tareas de inicialización o configuración 
* cuando se arranca la aplicación.
*/
@Configuration
@Profile("devH2")
public class SetUp implements CommandLineRunner {
	
	@Autowired
	CustomerRepository repository;
	@Autowired
	ProductRepository productRepository;

	@Override
	public void run(String... args) throws Exception {
		  // Creación de clientes
	      repository.save(new Customer("Jack", "Bauer"));
	      repository.save(new Customer("Chloe", "O'Brian"));
	      repository.save(new Customer("Kim", "Bauer"));
	      repository.save(new Customer("David", "Palmer"));
	      repository.save(new Customer("Michelle", "Dessler"));
	      repository.save(new Customer("Estef", "Contreras", "stef@gmail.com"));
	      
	      // Recuperando todos los clientes
	      List<Customer> customers = (List<Customer>) repository.findAll();
	      
	      // Imprimiendo los clientes recuperados
	      for(Customer customer : customers ) {
	    	  System.out.println(customer);
	      }
	      
	      // Recuperar un cliente por su  id
	       Customer cliente1 = repository.findById(2);
	       System.out.println( cliente1 ); // Chole
	       
	      // Recuperar un cliente por su email
	      Optional<Customer> optionalCustomer = repository.findByEmail("stef@gmail.com");
	      if( optionalCustomer.isPresent()) {
	    	  Customer stef = optionalCustomer.get();
	    	  System.out.println( stef );
	    	  // Modificar un cliente
	    	  stef.setFirstName("Estefany");
	    	  repository.save(stef); // update
	    	  
	      } else {
	    	  System.out.println("El usuario no existe");
	      }
	      
	      // Eliminar un registo
	      repository.deleteById(2L); // Se elimina a Chole
	      
	      
	      // Recuperando todos los clientes
	      List<Customer> customersModificados = (List<Customer>) repository.findAll();
	      
	      // Imprimiendo los clientes recuperados
	      for(Customer customer : customersModificados ) {
	    	  System.out.println(customer);
	      }
	      
	      // =============== Productos ======================
	      productRepository.save( new Product("Crema", 458.25) );
	      productRepository.save( new Product("Helado", 67.25) );
	      productRepository.save( new Product("Jabón Zote", 10.50) );
	   
		
	}

}
