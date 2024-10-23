package org.generation;

import java.util.Scanner;

public class DoWhile {

	public static void main(String[] args) {
		/**
		 * Ciclo Do-While
		 * Ejecuta un bloque de código al menos una vez
		 * antes de evaluar la condición.
		 * 
		 * Sintaxis:
		 *     
		 *    do {
		 *    
		 *     Instrucciones;
		 *     
		 *    } while (condición);
		 * 
		 */
		
	
		/*
		* Mostrar en la consola un mensaje de bienvenida
		* Posteriormente preguntar al usuario si desea
		* seguir activo, si la respuesta es "sí" volver a mostrar
		* el mensaje de bienvenida, en caso contrario despedirse
		*/
		Scanner sc = new Scanner( System.in);
		
		boolean isActive = false;

		do {
			System.out.println("Bienvenida a mi programa");
			System.out.print("Quieres seguir activa (s/n)? ");
			
			// normalizar la respuesta
			char response = sc.nextLine().toLowerCase().charAt(0);
			
			if( response == 's' || response == 'y' ) {
				isActive = true;
			} else {
				isActive = false;
			}
				
		} while ( isActive );
		
		System.out.println("Regresa pronto");
		
		sc.close();

	}

}
