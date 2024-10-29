package com.petco;

class Dog {
	
	String name = "Solovino";
	
	Dog(){		
	}
	
	Dog( String name){
		this.name = name;
	}
	
} // Dog


public class Pet {
	
	public static void main(String[] args) {
		Dog tessa = new Dog("Tessa");
		System.out.println( tessa.name);	// Tessa
		
		Dog chocolate = new Dog();
		System.out.println( chocolate.name); // Solovino
		
	}
	
} // Pet
