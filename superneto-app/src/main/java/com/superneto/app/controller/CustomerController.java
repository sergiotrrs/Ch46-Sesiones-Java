package com.superneto.app.controller;

import java.util.Set;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.superneto.app.model.Customer;
import com.superneto.app.service.CustomerService;

/**
 *  Una API REST, o Interfaz de Programación de Aplicaciones Representacional 
 *  por sus siglas en inglés (Representational State Transfer), 
 *  es un conjunto de reglas y convenciones para construir 
 *  servicios web que permiten la comunicación entre sistemas 
 *  de software a través del protocolo HTTP de manera simple y eficiente.
 *  
 *  Beneficios: Permite que sistemas desarrollados en diferentes 
 *  lenguajes de programación y ejecutados en diferentes 
 *  plataformas puedan comunicarse entre sí.
 *  
 * @RestController indica que la clase será un controlador API REST
 * Esta anotación combina @Controller y @ResponseBody
 * 
 * @Controller Indica la clase como un controlador MVC (Model-View-Controller).
 *  Esta clase se encarga de manejar las solicitudes HTTP y devuelve una respuesta
 *  
 * @ResponseBody indica que los métodos devuelven la respuesta en el cuerpo de la
 *  respuesta HTTP. Los objetos devueltos por los métodos se serializan automáticamente
 *  en el formato deseado. Por default la respuesta es en JSON.
 *  
 * @RequestMapping mapea una solicitud HTTP en la URL indicada.
 *  Se puede aplicar a nivel de clase o método.
 *  A nivel de clase define el prefijo común de la URL para todas
 *  las rutas de los métodos.
 *  
 */
@Controller
@ResponseBody
// @RestController
@RequestMapping("/api/v1/customers")   // http:localhost:8080/api/v1/customers
public class CustomerController {
	
	CustomerService customerService;

	public CustomerController(CustomerService customerService) {
		this.customerService = customerService;
	}
	
	/**
	 * La anotación @PathVariable en Spring MVC se utiliza para 
	 * extraer valores de la URL de una solicitud HTTP y vincularlos 
	 * a los parámetros de un método de controlador. Esto permite que 
	 * los parámetros dinámicos en la URL se pasen a los métodos del 
	 * controlador, facilitando la creación de rutas RESTful y 
	 * permitiendo la captura de valores específicos directamente 
	 * desde la URL.
	 * 
	 * Los valores dinámicos se definen en la URL de la solicitud 
	 * utilizando llaves {}. Estos valores pueden ser extraídos y 
	 * utilizados en los métodos del controlador.
	 */
	@GetMapping("{id}") // http:localhost:8080/api/v1/customers/{id} 
	Customer getUserById(@PathVariable("id") Long id){
		Customer existingCustomer = customerService.getCustomerById(id);
		return existingCustomer;
	}
	
	
	/**
	 * La anotación @RequestParam en Spring MVC se utiliza para 
	 * extraer parámetros de consulta de una solicitud HTTP y 
	 * vincularlos a los parámetros de un método del controlador. 
	 * Los parámetros de consulta son aquellos que se encuentran 
	 * en la URL después del signo de interrogación ? y suelen 
	 * utilizarse para pasar datos adicionales en las solicitudes GET.
	 */
	@GetMapping // http:localhost:8080/api/v1/customers?active=false&size=10&firstname="Estafany"
	Set<Customer> getAllUsers(
			@RequestParam(
					name="active", 
					required = false,
					defaultValue = "true"
					) boolean active  
			){
		return customerService.getAllUsers(active);
	}
	
	/**
	 * La anotación @RequestBody en Spring MVC se utiliza para 
	 * vincular automáticamente el cuerpo de una solicitud HTTP 
	 * a un objeto en un método de controlador. Esta anotación 
	 * permite que los datos JSON (o XML) enviados en el cuerpo 
	 * de la solicitud se deserialicen y se conviertan en una 
	 * instancia de una clase Java que se puede utilizar en el 
	 * método del controlador.
	 * 
	 */
	@PostMapping // http:localhost:8080/api/v1/customers
	Customer createCustomer(@RequestBody Customer newCustomer) {
	   Customer registeredCustomer = customerService.createCustomer(newCustomer);
	   return registeredCustomer;
	}
	
	

}
