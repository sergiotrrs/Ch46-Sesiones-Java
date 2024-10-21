package org.generation;

import java.util.Scanner;

public class ScannerClass {

	public static void main(String[] args) {
		/*
		 * La clase Scanner en Java se utiliza para 
		 * leer datos de entrada de diferentes fuentes, 
		 * como la consola, archivos o flujos de texto. 
		 * Es especialmente útil para interactuar con 
		 * el usuario mediante la consola.
		 * 
		 */
		
		Scanner sc;
		// Instanciar la clase Scanner
		sc = new Scanner( System.in );
		
		System.out.println("Escribe tu nombre: ");
		
		String nombre = sc.nextLine(); // Lee una línea de texto
		
		System.out.println("Te llamas " + nombre);
		System.out.println("N. de letras en tu nombre: " + nombre.length() );
		
		sc.close(); // Cerrar el objeto y liberar los recursos asociados
		

	}

}
