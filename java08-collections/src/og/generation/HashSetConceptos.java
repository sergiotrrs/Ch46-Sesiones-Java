package og.generation;

import java.util.HashSet;

public class HashSetConceptos {

	public static void main(String[] args) {
		/*
		 * Una colección de tipo set es una colección NO ordenada.
		 *  - No se permiten elementos duplicados
		 *  - cualquier elemento duplicado no se insertará
		 *  
		 *  Sintaxis:
		 *    HashSet<Object> varName = new HashSet<>();
		 */
		HashSet< String > medallas = new HashSet<>(); 
		
		// Agregar elementos, add()
		medallas.add( "Split" ); 
		medallas.add( "Perrotón" ); 
		medallas.add( "Medio Maratón CDmx" ); 
		medallas.add( "Maratón CDmx" );
		medallas.add( "Bimbo" );
		
		System.out.println( medallas );
		
		// Agregar un elemento duplicado
		System.out.println("Agregado Gatorade? " + medallas.add( "Gatorade" )); // true
		System.out.println("Agregado Bimbo? " + medallas.add( "Bimbo" )); // false
		
		System.out.println( medallas );

	}

}
