package java03_datos;

public class Casting {

	public static void main(String[] args) {
		/*
		 *  El orden de la jerarquía depende del tamaño de bits
		 *  y la precisión. El orden de jerarquía de los datos
		 *  primitivos de menor a mayor es:
		 *  
		 *  1.- byte (8 bits)
		 *  2.- short (16 bits)
		 *  3.- int (32 bits)
		 *  4.- long (64 bits)
		 *  5.- float (32 bits)
		 *  6.- double (64 bits)
		 * 
		 *  El Java las conversiones de tipo se llaman type casting.
		 *  Hay dos tipos principales: implicit casting y explicit casting)
		 * 
		 */
		
		// Java convierte automáticamente un tipo más pequeño a uno más grande
		byte varA = 67;
		short varB = varA;
		
		// Debes especificar manualmente la conversión explícita cuando
		// pasas de un tipo más grande a uno más pequeño
		long numPersonas =  12_896;
		int personasCh46 = (int)numPersonas;

		//_____________________
		short calificacion = 131;
		byte puntos = (byte)calificacion;
		System.out.println("Valor puntos:" + puntos); // -125
		
		// En la conversión explícita es importante tener en cuenta
		// que puede haber pérdida de datos si el tipo de destino
		// no puede alamcenar todas la información del tipo original.
		
		
		
	}

}
