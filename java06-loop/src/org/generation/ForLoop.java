package org.generation;

public class ForLoop {

	public static void main(String[] args) {
		/*
		 * Sintaxis:
		 * 
		 * for( expresion_inicial ; comparacion; expresion_final) 
		 * 	instrucción;
		 * 
		 * for( expresion_inicial ; comparacion; expresion_final){ 
		 *      instrucciones; 
		 *   }
		 * 
		 */
		
		for (int iteracion = 1; iteracion < 6; iteracion++ ) {
			System.out.println("Núm. iteración: " + iteracion );
		}
		
				
		// Ejercicio mental ====================================
		int iteracion = 1;
		
		for(  ;  ;  ) {
			if( iteracion > 5 ) break;
			System.out.println("Núm. Iteración: " + iteracion++);
		}
		
		System.out.println("Valor final de iteracion: " + iteracion ); // 6
		
		// --------------------------------------------------------
		
		ciclo:
		for (int i = 0; i < 5; i++) { 
			System.out.println("Valor de i: " + i);
			if( i > 3 ) break ciclo;
		}
		// Qué imprime la línea 37 ?   0,1,2,3,4 
		
		// --------------------------------------------------------
		
		// Tabla de multiplicación del 1 al 10
		principal:
		for (int i = 1; i <= 5; i++) {
			
			secundario:
			for (int j = 1; j <= 10; j++) {
				System.out.println(i + " * " + j + " = " + (i * j) );
				if ( j >= 7 ) break principal; 
			}							
		}	
		// Qué tablas de multiplicar se imprime?  
		
		// -----------------------------------------------------------
		// Uso de continue
		// Se usa para saltar la iteración actual del bucle y
		// continuar a la siguiente iteración.
		
		// Imprimir los números impares del 1 al 20(incluyendo)
		for (int i = 1; i <= 20; i++) {
			if( i % 2 == 0 ) continue;
			System.out.println("Valor impar: " + i);
		}
		
		for (int i = 1; i <= 20; i+=2) {
			System.out.println("2: Valor impar: " + i);
		}
		
		for (int i = 1; i <= 20; i++) {
			if( i % 2 != 0 ) System.out.println("3: Valor impar: " + i);
		}
		

	}

}
