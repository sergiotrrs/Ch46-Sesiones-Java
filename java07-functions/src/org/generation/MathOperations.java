package org.generation;

/**
 *  Las funciones(métodos) son fundamentales por:
 *  
 *  - Reutilización del código.
 *  - Organizar el código.
 *  - Facilidad de depuración.
 *  - Mejora la legibilidad.
 *  - Abstracción: encapsular la lógica de una tarea
 */
public class MathOperations {
	/*
	 *  https://docs.oracle.com/javase/tutorial/java/javaOO/methods.html
	 *  Sintaxis de un método:
	 *  
	 *   <modificadores_de_acceso> <tipo_retorno> nombreMétodo( parámetros ) <lista_de_excepciones> {
	 *   
	 *      // cuerpo del método
	 *   }
	 *   
	 *   Modificadores de acceso: public, protected, default, private.
	 *   Tipo retorno: Especifica el tipo de valor que el método devolverá( return ).
	 *   		Si el método no devuelve ningún valor(String, int, etc), 
	 *   		se usa la palabra reservada "void".
	 *   Nombre del método: Se recomienda comenzar el nombre con un verbo, 
	 *   		seguido por un adjetivo, sustantivo, etc. Usar la convención camelCase.
	 *   Parámetros: Lista de parámetros separados por coma.
	 *   
	 *   La firma del método es como:
	 *   nombreMétodo( double, int, double, double  )
	 *   
	 *   
	 */
	
	/**
	 * Sumatoria de dos números de punto flotante
	 * @param numeroA operando 1
	 * @param numeroB operando 2
	 * @return resultado de la sumatoria de A más B
	 */
	double sumarNumeros( double numeroA, double numeroB ) {		
		return numeroA + numeroB;		
	}
	
	/**
	 * Imprime en consola el resultado de una operación
	 * @param resultado valor a imprimir
	 */
	void imprimirResultadoSumatoria( double resultado ) {
		System.out.println("El resultado es: " + resultado);
		return;
	}
	
	
	

}
