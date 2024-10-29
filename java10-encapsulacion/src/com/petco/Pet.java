package com.petco;

class Dog {
	
	String name = "Solovino";	
	{ // bloque de inicialización de atributos non-static
		this.name = "Firulais";		
	}
	
	Dog(){	}
	
	Dog( String name){
		this.name = name;
	}
	
	Dog( String name, int age ){
		this(name);
		age++;
	} 
}// Dog


public class Pet {
	public static void main(String[] args) {
		Dog tessa = new Dog("Tessa");
		System.out.println( tessa.name);	// Tessa
		
		Dog chocolate = new Dog();
		System.out.println( chocolate.name); // Firulais
		
		Dog locky = new Dog("Rocky", 9 );
		System.out.println( locky.name );
	}
} // Pet
