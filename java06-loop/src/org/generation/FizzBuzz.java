package org.generation;

public class FizzBuzz {

	public static void main(String[] args) {
		/*
		 * Escribir un programa que muestre en pantalla los números del 1 al 20,
		 * sustituyendo los múltiplos de 3 por la palabra “fizz”, los múltiplos de 5 por
		 * la palabra "buzz" los múltiplos de ambos por la palabra "fizzbuzz", es decir,
		 * los múltiplos de 3 y 5,
		 * 
		 * 
		 * 1 2 fizz 4 buzz fizz 7 8 fizz buzz 11 fizz 13 14 fizzbuzz 16 17 fizz 19 buzz
		 * 
		 */
		for (int i = 1; i <= 20; i++) {
			if (i % 3 == 0 && i % 5 == 0) {
				System.out.println("fizzbuzz");
			} else if (i % 3 == 0) {
				System.out.println("fizz");
			} else if (i % 5 == 0) {
				System.out.println("buzz");
			} else {
				System.out.println(i);
			}
		}

	}

}
