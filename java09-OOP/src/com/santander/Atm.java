package com.santander;


/**
 *  Clase: Una clase es una componente fundamental de la programación
 *  orientada a objeto(OOP: Object oriented Programming). 
 *  Una clase es una plantilla que define el
 *  comportamiento(métodos) y las propiedades(atributos) de los objetos
 *  que se crean(instancian) a partir de ella. Una clase puede
 *  considerarse como un plano o un molde a partir del cual se crean
 *  los objetos( instanciar la clase).
 *  
 */
public class Atm {
	/* Atributo de instancia (non-static fileds) 
	 *   Variables que pertenecen a cada instancia (u objeto) de una clase. 
	 *   Esto significa que cada objeto creado a partir de la clase tiene 
	 *   su propia copia de estos atributos, por lo que pueden tener valores 
	 *   diferentes en cada instancia.
	 * 
	 * */
	int serialNumber;
	String model;
	double balance;
	
	/* Atributos de clase (static fields) 
	 *   Atributos que pertenecen a la clase. Esto significa que 
	 *   tendrá el mismo valor para todos los objetos. 
	 *   Estos atributos son útiles para mantener información común en todos 
	 *   los objetos. También, para propiedades donde no se requiere crear objetos.
	 * 
	 * */
	static String bankName;
	
	/* Métodos constructores */
	
	/* Métodos de instancia (non-static methods) 
	 *    <modificarAcceso> <retorno> nombreMétodo( parámetros )
	 *  Son aquellos que pertenecen a una instancia específica de una clase. 
	 *  Estos métodos pueden acceder y modificar los atributos de instancia 
	 *  y son llamados sobre un objeto particular de la clase.  
	 *    
	 * */
	 double deposit( double amount) {
		 // return balance = balance + amount ;
		 return balance += amount ;
	 }
	
	
	/* Métodos de clase (static methods) */
	
	

}
