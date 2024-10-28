package com.petco;

/**
 * Definir mínimo 2 atributos non-static Definir mínimo 1 atributo static
 * 
 * Realizar mínimo 1 método non-static Realizar mínimo 1 método static
 */
public class Cat {
	String name;
	int age;
	int food;

	static String specie;

	int portions(int amount) {
		return food += amount;
	}

	static String specie() {
		return "Bienvenido a Petco! \\" + "Tenemos:  " + specie;
	}
	
	// método non-static 'toString'
	// Devuelve la representación en formato String del objeto
	// Permite que el objeto se convierta en una cadena cuando se imprima
	// o se necesite en formato de texto
	public String toString() {
		return "El gato " + name + " , edad: " + age + " , food: " + food;
	}
	


}
