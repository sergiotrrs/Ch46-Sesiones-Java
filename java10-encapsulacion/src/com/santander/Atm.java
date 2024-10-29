package com.santander;


/**
 *  Los pilares de OOP: encapsulación, herencia, polimorfismo, abstracción.
 *  
 *  Encapsulación: Principio de consiste en ocultar los detalles de como 
 *  funciona un objeto. Un aspecto importante de la encapsulación es el
 *  concepto de acceso controlado. Se puede establecer diferentes
 *  niveles de acceso para los atributos y métodos de un objeto.
 *  
 *  La encapsulación ofrece beneficios como:
 *  - Seguridad de datos: Ocultar los detalles internos o que los datos
 *  	sean modificados de manera incorrecta o no autorizada.
 *  - Modularidad: Se facilita la creacíón de componentes independientes
 *  	que pueden ser reutilizados.
 *  - Abstracción: Permite que los usuarios de un objeto se centren en
 *  	lo que hace el objeto en lugar de cómo lo hace.
 *  
 *  Niveles de acceso para la encapsulación:
 *  1.- Public: Son accesibles desde cualquier parte del código.
 *  2.- Protected: Son accesibles desde la misma clase, paquete y clases derivadas.
 *  3.- Default: Son accesibles dentro de la misma clase y del mismo paquete.
 *  4.- Private: Son accesibles dentro de la misma clase.
 * 
 */
public class Atm {
	private int serialNumber;
	private String model;
	private double balance;
	
	/* Métodos constructores
	 *  Un constructor es un tipo especial de método que se llama automáticamente
	 *  cuando se crea una instancia(objeto) de una clase. Su propósito principal
	 *  es inicializar el estado de un objeto recién creado.
	 *  
	 *  Reglas:
	 *  - El nombre del constructor debe ser el mismo que el de la clase.
	 *  - Un constructor no tiene retorno.
	 *  - Un constructor puede llamar a otro constructor de la misma clase usando
	 *  	la palabra this(). Esta llamada debe ser la primera instrucción del constructor.
	 *  - Es posible tener una sobrecar de constructores.
	 *  - Constructor por default: Si no se proporciona un constructor en la clase, Java
	 *  	proporciona un constructor por defecto sin parámetros.
	 */
	 Atm(){
		 
	 }
	
	 Atm(String model, double balance) {
		 this.model = model;
		 this.balance = balance;		
	}
	

	/** Métodos setters y getters
	 *  Convención para el nombre de los métodos: 
	 *  <ModificadorAcceso> <retorno> setNombreDelAtributo( parámetros )
	 * */
	public int getSerialNumber() {
		return this.serialNumber;
	}
	
	public void setModel( String newModel ) {
		this.model = newModel;
	}
	
	public String getModel() {
		return this.model;
	}
	
	// Realizar el setter y getter de balance
	
	/**
	 *  Es común que en los setters el parámetro tenga el 
	 *  mismo nombre que el atributo que establece para 
	 *  mantener consistencia, legibilidad y claridad en 
	 *  el código. Esto ayuda a identificar fácilmente 
	 *  cuál es el atributo de la clase y cuál es el 
	 *  valor que estamos pasando para actualizarlo.
	 *  
	 *  Para diferenciar entre el parámetro y el atributo, 
	 *  en Java se utiliza la palabra clave this. 
	 *  this hace referencia al contexto actual de la 
	 *  instancia de la clase, permitiendo distinguir 
	 *  el atributo de instancia del parámetro del método.
	 */
	public double setBalance(double balance) {
		return this.balance = balance;
	}
	
	public double getBalance() {
		return this.balance;
	}
	
	public String toString() {
		return "Serial number: " + this.serialNumber +
				" , model: " + this.model +
				" , balance: " + this.balance;
	}
	

}
