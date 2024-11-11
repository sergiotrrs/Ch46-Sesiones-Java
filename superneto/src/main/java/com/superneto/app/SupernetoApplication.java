package com.superneto.app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
/**
 * La anotación @SpringBootApplication se utiliza en las aplicaciones 
 * Spring Boot y es esencial para configurar y lanzar una aplicación 
 * de manera automática. 
 * 
 * Esta anotación es un atajo que combina tres anotaciones clave de Spring: 
 * @SpringBootConfiguration: Marca la clase como una configuración de Spring, 
 * similar a @Configuration.
 * @EnableAutoConfiguration: Le dice a Spring Boot que configure automáticamente
 * los beans y las dependencias necesarias según las bibliotecas presentes 
 * en el classpath.
 * @ComponentScan: Permite buscar y registrar automáticamente los componentes
 * (como @Controller, @Service, etc.) en el paquete y sus subpaquetes.
 */
@SpringBootApplication
public class SupernetoApplication {

	public static void main(String[] args) {
		SpringApplication.run(SupernetoApplication.class, args);
	}

}
