package org.generation.shapes;

public class SquareTest {

	public static void main(String[] args) {
		Square cuadrito = new Square("Cuadrito", 4 );
		// TwoDimensionalShape cuadrito = new Square("Cuadrito", 4 );
		// Shape cuadrito = new Square("Cuadrito", 4 );
		
		System.out.println("Area:" + cuadrito.getArea() );
		System.out.println("Perìmetro:" + cuadrito.getPerimeter() );
		System.out.println("Lado:" + cuadrito.getWidth() );
		cuadrito.draw();
		
		/*
		 * Generar la clase concreta de trìangulo
		 *  - Calcular el àrea y perìmetro
		 *  - Hacer las pruebas
		 */
		
	}

}
