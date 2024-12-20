package org.generation.shapes;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.*;
//import org.junit.jupiter.api.DisplayName;
//import org.junit.jupiter.api.Test;


class SquareJUnitTest {
	
	Square square;

	/**
	 *  @Test Anotación que indica que un método es una prueba unitaria. 
	 *  Al marcar un método con @Test, JUnit lo reconoce y lo ejecuta 
	 *  como una prueba cuando se corre la suite de pruebas.
	 */
	@Test
	void areaTest() {
		square = new Square("MySquare", 10 );
		double area = square.getArea(); // 100
		/*
		 * assertEquals es un método en JUnit que se utiliza 
		 * para verificar si el valor esperado coincide con 
		 * el valor real obtenido en una prueba unitaria. 
		 * Si los valores no coinciden, la prueba falla 
		 * y JUnit genera un mensaje de error.
		 */
		assertEquals( 100, area );
	}
	
	
	/**
	 * Prueba unitaria que verifica el perímetro
	 */
	@Test
	 void perimetroTest () {
	  Square square = new Square("MySquare", 10);
	  double perimetro = square.getPerimeter(); //100
	  assertEquals( 40, perimetro);
	 }
	
	@Test
	/*
	 * @DisplayName permite dar un nombre descriptivo y legible 
	 * a un método de prueba, facilitando la comprensión de los 
	 * resultados al ejecutarlos.
	 */
	@DisplayName("Modificar la altura y verificar el área y perímetro")
	void modificarAltura() {
		Square square = new Square("MySquare", 5 );
		square.setHeight(80);
		assertEquals( 80 , square.getHeight(), "La altura debe ser 80");
		assertEquals( 80 , square.getWidth(), "El ancho debe ser 80");
		assertEquals( 6400, square.getArea(), "Área debe ser 6400" ); 
		assertEquals( 320, square.getPerimeter(), "Perímetro debe ser 320" );		
	}

	@Test
	@DisplayName("Modificar el ancho y verificar el área y perímetro")
	void modificarAncho() {
		Square square = new Square("MySquare", 5 );
		square.setWidth(80);
		assertEquals( 80 , square.getHeight(), "La altura debe ser 80");
		assertEquals( 80 , square.getWidth(), "El ancho debe ser 80");
		assertEquals( 6400, square.getArea(), "Área debe ser 6400" ); 
		assertEquals( 320, square.getPerimeter(), "Perímetro debe ser 320" );		
	}
	
	@Test
	@DisplayName("Calcular el área y perímetro con decimales")
	void areaYPerimetroConDecimales() {
		Square square = new Square("MySquare", 5.01 );
		assertEquals( 5.01 , square.getHeight(), "La altura debe ser 5.01");
		assertEquals( 5.01 , square.getWidth(), "El ancho debe ser 5.01");
		assertEquals( 25.1001 , square.getArea(), 0.002, "Área debe ser 25.1001" ); 
		assertEquals( 20.04, square.getPerimeter(),0.002, "Perímetro debe ser 20.04" );
		
	}
	
	/*
	 *  BigDecimal es una clase en Java utilizada para realizar 
	 *  operaciones aritméticas de alta precisión con números decimales. 
	 *  Es especialmente útil en aplicaciones financieras o científicas 
	 *  donde la precisión es crucial, ya que evita los errores de 
	 *  redondeo que ocurren al usar float o double.
	 */

	
	
}
