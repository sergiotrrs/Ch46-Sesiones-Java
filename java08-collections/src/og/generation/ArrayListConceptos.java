package og.generation;

import java.util.ArrayList;

public class ArrayListConceptos {

	public static void main(String[] args) {
	/*
	 * Array List.
	 * https://docs.oracle.com/javase/8/docs/api/java/util/ArrayList.html
	 * 
	 * Una colección List es una colección ...?
	 *  - Es una colección ordenada (respeta el orden en que se agregan)
	 *  - Se permite elementos duplicados
	 *  - Se basa en un array redimensionable que crece su tamaño,
	 *   según crece la colección de elementos.
	 *  - Esta colección es la mejor rendimiento tiene.
	 *  
	 *  Sintaxis:
	 *  ArrayList<object> varName = new ArrayList<>();
	 *  
	 * 
 */
		int age = 17;
		Integer edad = 18;
		
		// Definir una colección de datos numéricos
		// ArrayList< int > numeros; Se debe indicar una clase(whrapper para los primitivos)
		ArrayList< Integer > numeros;
		
		// Definir una colección de Strings
		// para almacenar el nombre de las etiquetas de Ivanna
		ArrayList<String> nombreEtiquetas;
		
		// Crear el objeto de la colección
		nombreEtiquetas = new ArrayList<>();
		
		// Agregar un elemento con el método add()
		nombreEtiquetas.add("Coca-cola"); // indice 0
		// Agregar 5 elementos más a la colección.
		nombreEtiquetas.add("Toxic"); 
		nombreEtiquetas.add("Vans"); 
		nombreEtiquetas.add("Disney");
		nombreEtiquetas.add("Peanuts"); 
		nombreEtiquetas.add("Mala Racha");
		
		System.out.println( nombreEtiquetas ); // [Coca-cola, Toxic, Vans, Disney, Peanuts, Mala Racha]

		// Agregar un elemento duplicado
		nombreEtiquetas.add("Vans");
		System.out.println( nombreEtiquetas ); // Se duplica "Vans"
		
		// Obtener el tamaño de una colección, size()
		System.out.println( nombreEtiquetas.size() ); // 7
		
		// Mostrar un emeneto en particular, get()
		// Indicar el número de índice.
		System.out.println( nombreEtiquetas.get(1) ); // Toxic
		// Mostra el elemento "Mala Racha"
		System.out.println( nombreEtiquetas.get(5) ); // Mala Racha
		
		// Remover un elemento, remove()
		// System.out.println( "Eliminado: " + nombreEtiquetas.remove(3));
		System.out.println( "Eliminado: " + nombreEtiquetas.remove("Disney"));
		System.out.println( nombreEtiquetas );
		
		// Verificar si un elemento existe, contains()
		System.out.println("Vans? " + nombreEtiquetas.contains("Vans"));
		System.out.println("Cuidado con el perro? " + nombreEtiquetas.contains("Cuidado con el Perro"));
		
		


	}

}
