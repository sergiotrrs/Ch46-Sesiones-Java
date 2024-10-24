package org.generation;

public class MathOperationsTest {

	public static void main(String[] args) {
		// Instanciar una clase
	 MathOperations math1 = new MathOperations();
	 
	 double result = math1.sumarNumeros(5, 5.5);
	 math1.imprimirResultadoSumatoria(result);

	 // Suma 5 + 8.8 = 13.8 e imprime en consola
	 result = math1.sumarNumeros(5, 8.8);
	 math1.imprimirResultadoSumatoria(result);

	 // Suma "4" + "10.8" = 14.8 e imprime en consola
	 double numA = Double.parseDouble("4");
	 double numB = Double.parseDouble("10.8");	 
	 result = math1.sumarNumeros( numA, numB );
//	 result = math1.sumarNumeros("4", "10.8");
	 math1.imprimirResultadoSumatoria(result);

	}

}
