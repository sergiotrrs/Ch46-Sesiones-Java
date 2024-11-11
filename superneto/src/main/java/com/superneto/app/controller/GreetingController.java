package com.superneto.app.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 *  @Controller indica que la clase será un controlador MVC
 *  (Model-View-Controller). Esta clase se encarga de manejar
 *  las solicitudes HTTP y devuelve una respuesta(Vista).
 */
@Controller
public class GreetingController {
	

	/**
	 * @GetMaping mapea las solicitud http GET
	 * Entre paréntesis se indica la ruta donde se
	 * mapeará.
	 */
	@GetMapping("/greeting") // localhost:8080/greeting?name=Sergio
	public String greeting(@RequestParam(name="name", required=false, defaultValue="World") String name, Model model) {
		model.addAttribute("name", name);
		return "greeting";
	}
	
	@GetMapping("/cohortes/ch46")
	public String greetingCh46() {
		return "la-banda";
	}
	
}
