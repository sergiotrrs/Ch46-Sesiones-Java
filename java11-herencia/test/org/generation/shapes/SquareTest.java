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
		
		System.out.println( cuadrito.printResultArea() );
		
		Shape cuadro2 = new Square("Cuado2", 50 );
		System.out.println( cuadro2.getArea()  );
		
		if( cuadro2 instanceof Square ) {
			// Down Casting
			System.out.println( ((Square)cuadro2).getPerimeter() );			
		}
		
		
		
		
		
		
		/*
		 * Generar la clase concreta de trìangulo
		 *  - Calcular el àrea y perìmetro
		 *  - Hacer las pruebas
		 */
		
	}

}
