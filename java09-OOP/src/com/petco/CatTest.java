package com.petco;

import java.util.ArrayList;

public class CatTest {

	public static void main(String[] args) {
		Cat gato1 = new Cat();

		gato1.name = "Rufina";
		gato1.age = 4;
		gato1.food = 1;

		Cat.specie = "Felis Catus";

		System.out.println(gato1.name);
		System.out.println(gato1.age);
		
		// Poner a 4 gatos en una colección ArrayList;
		// Tenemos una guardería de gatos
		ArrayList< Cat > losPintitos = new ArrayList<>();
		
		losPintitos.add( gato1 );
		
		Cat gato2 = new Cat();
		gato2.name = "Tibio";
		gato2.age = 5;
		gato2.food = 3;
		
		Cat gato3 = new Cat();
		gato3.name = "Gominola";
		gato3.age = 3;
		gato3.food = 2;
		
		losPintitos.add(gato2);
		losPintitos.add(gato3);
		
		Dog tessa = new Dog();
		// La colección está definida para almacenar
		// objetos de tipo Cat, tessa es de tipo Dog
		// losPintitos.add( tessa );
			
		// Mostrar los gatos que su porción sea mayor o igual a 3
	    // imprimir en consola
		System.out.println("Gatos con porción sea mayor o igual a 3:");
        for (Cat gato : losPintitos) {
            if (gato.food >= 3) {
            	System.out.println( gato );
            }
        }
		

	}

}
