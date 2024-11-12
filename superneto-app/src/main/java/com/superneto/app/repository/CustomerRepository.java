package com.superneto.app.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.repository.CrudRepository;

import com.superneto.app.model.Customer;


/**
 * La especificación de JPA es una especificación estándar de Java 
 * que define una interfaz común y un conjunto de reglas para 
 * el mapeo objeto-relacional y la gestión de entidades en aplicaciones Java.
 * 
 * Varios proveedores de tecnología, como Hibernate, EclipseLink, Apache OpenJPA, 
 * entre otros, implementan la especificación de JPA y proporcionan las bibliotecas 
 * y herramientas necesarias para utilizar JPA en aplicaciones Java. 
 * Estas implementaciones ofrecen funcionalidades adicionales y 
 * características específicas, además de cumplir con los requisitos 
 * básicos definidos por la especificación de JPA.
 * 
 *  Por defecto, Spring Boot utiliza Hibernate como proveedor de JPA.
 *  
 *  Puedes especificar el proveedor de JPA a través de la propiedad 
 *  spring.jpa.properties.hibernate.dialect, donde hibernate.dialect 
 *  es la propiedad específica de Hibernate
 *  
 *  Hibernate es un framework de mapeo objeto-relacional que simplifica 
 *  el acceso a bases de datos relacionales y permite a los desarrolladores 
 *  trabajar con objetos en lugar de consultas SQL.  Hibernate proporciona 
 *  un lenguaje de consulta llamado Hibernate Query Language (HQL), 
 *  similar a SQL pero orientado a objetos.
 *  
 *  CrudRepository es una interfaz básica que proporciona métodos CRUD estándar, 
 *  mientras que JpaRepository es una interfaz extendida de CrudRepository 
 *  que agrega funcionalidades específicas de JPA. Si estás utilizando JPA 
 *  en tu aplicación de Spring y necesitas características adicionales como 
 *  consultas personalizadas o paginación, es recomendable utilizar JpaRepository. 
 *  Sin embargo, si solo necesitas las operaciones CRUD básicas, 
 *  CrudRepository puede ser suficiente.
 */
public interface CustomerRepository extends CrudRepository<Customer, Long> {
	
	/*
	 * Los query methods se refieren a métodos definidos en las 
	 * interfaces de repositorios en Spring Data JPA (y otras 
	 * implementaciones de Spring Data) que permiten generar 
	 * consultas de manera automática a partir del nombre del 
	 * método. Estos métodos siguen una convención de nombres 
	 * específica que indica la consulta que deben ejecutar, 
	 * evitando la necesidad de escribir manualmente consultas 
	 * JPQL (Java Persistence Query Language) o SQL.
	 * 
	 * https://docs.spring.io/spring-data/jpa/reference/jpa/query-methods.html
	 * 
	 */
	// SELECT * FROM customer WHERE last_name = ?
	List<Customer> findByLastName(String lastname);
	List<Customer> findByFirstName(String firstname);
	Optional< Customer > findByEmail(String email);
	// Sobrecarga de método, existe un método en CRUDRepository
	// Optional<Customer> findById(Long id);
	Customer findById(long id);
	
	
	

}
