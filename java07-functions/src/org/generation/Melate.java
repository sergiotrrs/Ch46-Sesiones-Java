package org.generation;

/**
 * https://alegrialoteria.com/melate
 */
public class Melate {

	/**
	 * Método que genera un número aleatorio entre 1 y 57 (inclusive).
	 * Utiliza Math.random() que genera un número entre 0 y 1 (sin incluir 1).
	 */
	int generateRandomNumber() {
		int min = 1;
	    int max = 57;

	    // Generar un número aleatorio entre 0.0 y 1.0
	    double randomValue = Math.random();

	    // Escalar el número aleatorio al rango deseado (entre 1 y 57)
	    double scaledRandomValue = randomValue * (max - min + 1);

	    // Convertir el número escalado en un entero redondeado hacia arriba
	    int finalNumber = (int) Math.ceil(scaledRandomValue);

	    // Return the random number within the desired range
	    return finalNumber;
	}
	
	

}
