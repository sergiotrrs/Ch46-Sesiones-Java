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

	/** Métodos setters y getters
	 *  Convención para el nombre de los métodos: 
	 *  <ModificadorAcceso> <retorno> setNombreDelAtributo( parámetros )
	 * */
	public int getSerialNumber() {
		return serialNumber;
	}
	
	public void setModel( String newModel ) {
		model = newModel;
	}
	
	public String getModel() {
		return model;
	}
	
	// Realizar el setter y getter de balance
	
	
	

}
