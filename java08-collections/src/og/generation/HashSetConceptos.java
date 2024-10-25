package og.generation;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashSet;

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
		
		// Obtener el tamaño de la colección, size() 
		System.out.println( medallas.size() ); // 6
		
		// Saber si un elemento existe, contains()
		System.out.println( "Gatorade? "  + medallas.contains("Gatorade")); // true
		System.out.println( "Olímpica? "  + medallas.contains("Olímpica")); // false
		
		// Remover un elemento, remove()
		System.out.println("Eliminado Maratón CDmx? " + medallas.remove("Maratón CDmx"));
		
		// Iterar la colección, usando for loop enhanced
		for(String medalla : medallas) {
			   System.out.println("Medalla: " + medalla);
		}
		
		// =============Eliminar duplicados============================
		ArrayList<String> nombreEtiquetas;
		nombreEtiquetas = new ArrayList<>();
		nombreEtiquetas.add("Coca-cola"); 
		nombreEtiquetas.add("Toxic"); 
		nombreEtiquetas.add("Vans"); 
		nombreEtiquetas.add("Disney");
		nombreEtiquetas.add("Peanuts"); 
		nombreEtiquetas.add("Mala Racha");
		nombreEtiquetas.add("Vans"); 
		nombreEtiquetas.add("Toxic");
		System.out.println( nombreEtiquetas );
		
		// Eliminar los duplicados
		// HashSet<String> etiquetasNoDuplicadas = new HashSet<>( nombreEtiquetas );
		HashSet<String> etiquetasNoDuplicadas = new HashSet<>();
		etiquetasNoDuplicadas.add( "Nike" );
		etiquetasNoDuplicadas.addAll( nombreEtiquetas );
		System.out.println( etiquetasNoDuplicadas );
		
		//  Eliminar los duplicados, respetando el orden (LinkedHashSet)
		LinkedHashSet<String> etiquetasNoDuplicadasOrdenadas = new LinkedHashSet<>( nombreEtiquetas );
		  System.out.println( etiquetasNoDuplicadasOrdenadas );
		
		
		
		
	}

}
