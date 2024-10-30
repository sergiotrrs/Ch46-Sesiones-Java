package org.generation.util;

/**
 *  Una interfaz es una declaración formal de un contrato, en la
 *  cuál los métodos no contienen implementaciones.
 *  Es similar a los métodos abstractos.
 *  
 *  Una clase puede implementar varias interfaces.
 *  
 *  Las interfaces son adecuadas para proporcionar funcionalidad
 *  a clases que no están relacionadas entre si.
 *  
 *  
 *  Para patrones de diseño, se suele utilizar interfaces.
 */
public interface Draw {
	// Los atributos en las interfaces son de tipo public, final y static
	// public static final boolean IS_DRAWABLE = true;
	boolean IS_DRAWABLE = true;
	
	// Los métodos por default son de tipo public, abstract
	void draw();
	
	// A partir de la versión 8 de Java, se pueden tener
	// métodos con implementaciones.
	// Estos métodos deben ser default
	default String greeting() {
		return "Puedo ser dibujable";
	}

}
