package org.generation.shapes;

/**
 *  Las clases abstractas son clases que no se pueden instanciar.
 *  Estas clases se utilizan como modelos(plantillas) para
 *  crear subclases concretas que se puedan instanciar.
 *  
 *  una clase abstracta se declara en la firma de la clase
 *  con la palabra reservada "abstract"
 *  
 *  La clase abstracta puede contener métodos abstractos y
 *  métodos concretos.
 *  
 *  Los métodos abstractos no tienen implementación. La implementación
 *  se debe realizar en las subclases concretas.
 *  
 *  Las clases abstractas se recomienda utilizar para
 *  clases que estén estrechamente relacionadas ( is-A )
 */

abstract public class Shape {
	
	private String name;
	
	protected Shape(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Shape [name=" + name + "]";
	}
	
	
	
	
	
	

}
