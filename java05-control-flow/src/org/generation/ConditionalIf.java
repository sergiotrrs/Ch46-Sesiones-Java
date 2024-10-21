package org.generation;

import java.util.Scanner;

public class ConditionalIf {

	public static void main(String[] args) {
		/**
		 * 
		 * Flujos de control: las sentencias de flujo de control interrumpen el flujo de
		 * ejecusión empleando toma de decisiones, bucles y ramificaciones lo que
		 * permite que el programa ejecute condicionalmente bloques de código
		 * particulares.
		 * 
		 * Sintaxis de la condicional if Si la condicional es verdadera, se ejecuta la
		 * instrucción de if
		 * 
		 * if ( condicional ) sentencia;
		 * 
		 * if ( condicional ) { sentencias; }
		 * 
		 * if ( condicional ) sentencia; else sentencia_Si_condicional_es_falsa;
		 * ------------------------------------------------------ if ( condicional )
		 * sentencia; else if ( nueva_condicional) sentencia; else if ( n_condición )
		 * sentencia; else sentencia;
		 * 
		 */

		/*
		 * Verifica la edad de una persona. Si es mayor o igual de 18 imprimir:
		 * "Puede votar", caso contrario: "No puede votar"
		 */
		int age = 15;
		if (age >= 18)
			System.out.println("Puede Votar");
		else
			System.out.println("No puede votar");

		/*
		 * De una variable tipo int, evaluar si está en el rango de 1 a 10, si es así
		 * desplegar en consola "La selección está en el rango" En caso contrario
		 * "La selección está fuera de rango"
		 */
		int myNum = 0;
		if (myNum >= 1 && myNum <= 10)
			System.out.println("Está en el rango");
		else
			System.out.println("Fuera de rango");

		if (myNum == 15)
			/* sentencia */ ; // el ; termina la evaluación de if
		System.out.println("Número es igual"); // Se imprime siempre

		/*
		 * Operador ternario.
		 * 
		 * Sintaxis: expresión ? respuesta_si_es_true : si_es_false
		 *
		 * Realizar el ejercicio anterior usado el operador ternario
		 */

		// Refactorizar el ejercicio anterior usando el operador ternario

		int evaluacionRango = 10;
		System.out.println(
				(evaluacionRango >= 1 && evaluacionRango <= 10) ? 
						"Felicidades! estás en el rango" : 
							"Fuera De Rango"
							);
		
		// --------------------------------------------------------------
		// -------------- Clase Scaner --------------------------------
		int edad;
		String nombre;
		Scanner sc;
		
		/*
		 *  
		 *  npm (Node Package Manager)
		 *   - Instala, actualiza y gestiona dependencias
		 *  npx (Node Package eXecute)
		 *   - Permite ejecutar comandos directamente 
		 *    desde paquetes sin necesidad de instalarlos globalmente
		 *   
		 * 
		 */
		
		

	}

}
