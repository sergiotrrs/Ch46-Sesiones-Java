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
	 result = math1.sumarNumeros("4", "10.8");
	 math1.imprimirResultadoSumatoria(result); // 14.8

	 // Suma "2" + "3" = 5.0 e imprime en consola
	 result = math1.sumarNumeros(34, 5.4);	 
	 math1.imprimirResultadoSumatoria(result); // 14.8
	 
	 // Realizar los cambios necesarios en la clase MathOperations
	 // que se pueda realizar la suma con 
	 result = math1.sumarNumeros("34", 5.4);	 
	 math1.imprimirResultadoSumatoria(result); // 39.4 

	 result = math1.sumarNumeros(34, "5.4");	 
	 math1.imprimirResultadoSumatoria(result); // 39.4
	 
	 



	}

}
