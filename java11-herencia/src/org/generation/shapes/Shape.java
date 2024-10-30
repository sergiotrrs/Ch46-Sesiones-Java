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
	
	/*
	 *  @Override: Anotación que indica que el método está sobreescribiendo
	 *  el comportamiento de una método de la clase heredada.
	 *  Su propósito es hacer una validación en tiempo de
	 *  compilación para asegurarse que la subclase está
	 *  sobreescribiendo correctamente y coincide
	 *  con la firma del método.
	 */	 
	@Override
	public String toString() {
		return "Shape [name=" + name + "]";
	}
	
	/**
	 *  Un método abstracto no tiene implementación, solo
	 *  la definción del método.
	 *  Termina con punto y coma.
	 *  
	 *  Si tienes un método abstracto, tienes la obligación
	 *  de hacer tu clase abstracta.
	 */
	abstract public double getArea();
		

}
