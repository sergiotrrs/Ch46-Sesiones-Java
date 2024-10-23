package org.generation;

import java.util.Scanner;

public class WhileAndDoWhile {

	public static void main(String[] args) {
		/**
		 * Ciclo While
		 * Mientras la condición sea verdadera, se realiza un nuevo ciclo.
		 * 
		 * Sintaxis:
		 *     
		 *     while( condicion ) instruccion;
		 *     
		 *     while( condicion ) {
		 *        instrucciones;
		 *     }
		 * 
		 */
		
	
		/*
		* Mostrar en la consola un mensaje de bienvenida
		* Posteriormente preguntar al usuario si desea
		* seguir activo, si la respuesta es "sí" volver a mostrar
		* el mensaje de bienvenida, en caso contrario despedirse
		*/
		Scanner sc = new Scanner( System.in);
		
		boolean isActive = true;
		
		while( isActive ) {
			System.out.println("Bienvenida a mi programa");
			System.out.print("Quieres seguir activa (s/n)? ");
			
			// normalizar la respuesta
			String response = sc.nextLine().toLowerCase(); 
			
			if( response.equals("s") ) {
				isActive = true;
			} else {
				isActive = false;
			}
				
		}
		System.out.println("Regresa pronto");
		
		sc.close();

	}

}
