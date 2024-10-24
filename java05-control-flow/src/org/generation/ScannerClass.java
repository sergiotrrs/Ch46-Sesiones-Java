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
		 * La clase Scanner en Java es una clase útil 
		 * que se encuentra en el paquete java.util
		 * 
		 */
		
		Scanner sc;
		// Instanciar la clase Scanner
		sc = new Scanner( System.in );
		
		System.out.println("Escribe tu nombre: ");
		
		/*
		 * Lee una línea completa de entrada como cadena de texto.
		 * Devuelve todo el texto de la línea, excluyendo el
		 * carácter de salto de línea(\n).
		 * 
		 * Buffer: Memoria temporal donde se almacenan los datos
		 * de entrada antes de ser procesados.
		 */
		//String nombre = sc.nextLine(); // Lee una línea de texto
		
		//System.out.println("Te llamas " + nombre);
		//System.out.println("N. de letras en tu nombre: " + nombre.length() );
		
		// Pregunta la ciudad donde se vive e imprime en consola
		// System.out.println("Escribe si vives en un lugar planito o rocoso: ");
		//String vivienda = sc.nextLine();
		// System.out.println("Genial, vives en un lugar que es: " + vivienda);
		
		/*
		 *  Método next()
		 *  Se utiliza para leer una palabra desde la entrada
		 *  Detiene la lectura cuado encuentra un espacio, salto de línea 
		 *  o tabulación
		 */
		 /*System.out.println("Escribe el nombre y apellido de un familar: ");
		 String firstName = sc.next();
		 String lastName = sc.next();
		 System.out.println("N. de caracteres en nombre: " + firstName.length() );
		 System.out.println("N. de caracteres en apellido: " + lastName.length() );
		 System.out.println(firstName+lastName);
		 */
		 System.out.print("Escribe el nombre de tu mascota: ");
		 String mascota = sc.next();
		 System.out.println("Apapachos a " + mascota);
		
		 System.out.println("Escribe tu edad: ");
		 int edad = sc.nextInt(); // leer un número entero
		 System.out.println("Tu edad : " + edad);
		 
		 System.out.println("Escribe la edad de tu mascota: ");
		 int edadMascota = sc.nextInt(); // leer un número entero
		 /*
		  * Se recomienda usar nextLine() adicional para
		  * capturar el salto de línea que quedó tras la entrada de nextLine()
		  */
		 sc.nextLine(); // limpiamos el buffer
		 System.out.println("La edad de tu mascota: " + edadMascota);
		 
		 System.out.println("Tienes frio  s/n ?");
		 String respuesta = sc.nextLine();
		 System.out.println("Tu respuesta es: " + respuesta);
		 
		 System.out.println("Ingresa tu num de cohorte: ");
		 if( sc.hasNextInt()  ) {
			 int numCohorte = sc.nextInt();
			 System.out.println("Chido por la ch " + numCohorte);
		 } else {
			 System.out.println("Usuario no sigue instrucciones");
		 }
		 sc.nextLine();
		 
		 
			 
		 
		 sc.close(); // Cerrar el objeto y liberar los recursos asociados
		

	}

}
