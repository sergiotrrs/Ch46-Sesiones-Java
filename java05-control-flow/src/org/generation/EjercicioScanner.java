package org.generation;

import java.util.Scanner;

public class EjercicioScanner {

	public static void main(String[] args) {
		/*
		 *  Usando la clase scanner, realiza la siguiente:
		 *  
		 *  1.- Solicita al usuario su nombre
		 *  2.- Solicita su edad
		 *     2.1 - Verificar que la edad sea valores positivos 
		 *  3.-Solicita la cantidad de años que desea a gregar a su edad
		 *  4.- Calcula e imprime el nombre y la edad con la suma de años
		 *  
		 *  
		 */
		Scanner sc;
		sc = new Scanner(System.in);
		
		System.out.println("Escribe tu nombre: ");
		String name = sc.nextLine();//lee una linea de texto
		
		System.out.println("Te llamas " + name);
		
		System.out.println("Escribe tu edad: ");
		int edad = sc.nextInt(); // lee un numero entero
		sc.nextLine();
		
		System.out.println("¿Cuantos años te gustaria aumentarte?");
		int masEdad = sc.nextInt();
		sc.nextLine();
		
		System.out.println("Tu nombre es: " + name + 
				" Tienes: " + edad + 
				" Pero te gustaria tener: " + (edad + masEdad));
		
		sc.close();

	}

}
