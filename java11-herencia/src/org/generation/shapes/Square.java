package org.generation.shapes;

import org.generation.util.Draw;

public class Square extends TwoDimensionalShape implements Draw {
	
	public Square(String name, double side ) {
		super(name, side, side);
	}

	/**
	 *  Sobreescritura de métodos (Override)
	 *  
	 *  Para que un método sea sobreescrito, este debe tener la misma
	 *  firma del método de la clase superior. La sobreescritura permite
	 *  personalizar el comportamiento heredado.
	 *  
	 *  @Override: Anotación que indica que el método está sobreescribiendo
	 *  el comportamiento de una método de la clase heredada.
	 *  Su propósito es hacer una validación en tiempo de
	 *  compilación para asegurarse que la subclase está
	 *  sobreescribiendo correctamente y coincide
	 *  con la firma del método.
	 */
	@Override
	public double getPerimeter() {
		return super.getWidth() * 4 ;
	}

	@Override
	public double getArea() {
			return super.getWidth() * super.getHeight();
	}

	@Override
	public void draw() {
		System.out.println("Soy " + super.getName() + " y me voy a dibujar");		
	}
	

}
