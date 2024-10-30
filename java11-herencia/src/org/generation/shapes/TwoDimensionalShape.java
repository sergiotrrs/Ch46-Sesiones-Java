package org.generation.shapes;


/**
 *  La herencia en Java significa que una clase 
 *  (llamada subclase o clase derivada) puede 
 *  heredar atributos y métodos de otra clase 
 *  (llamada superclase o clase base). 
 *  
 *  La subclase hereda todos los campos y métodos 
 *  no privados de la superclase, lo que significa 
 *  que puede utilizarlos como si fueran 
 *  parte de la propia subclase.
 */
abstract public class TwoDimensionalShape extends Shape {
	
	private double width;
	private double height;
	
	protected TwoDimensionalShape(String name, double width, double height) {
		super(name);
		this.width = width;
		this.height = height;
	}

	public double getWidth() {
		return width;
	}

	public void setWidth(double width) {
		this.width = width;
	}

	public double getHeight() {
		return height;
	}

	public void setHeight(double height) {
		this.height = height;
	}
	
	abstract public double getPerimeter();
	
	

}
