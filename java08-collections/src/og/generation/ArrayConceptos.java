package og.generation;

public class ArrayConceptos {

	public static void main(String[] args) {
		/*
		 *  Las variables de tipo array se definen con corchetes []
		 *  Los corchetes pueden ir antes o después de la variable
		 *  ej. int[] myArray;
		 *      int myArray[]
		 *  
		 *  Para los array se debe asignar la cantidad de elementos
		 *  que contendrá.
		 *  Una vez definido, el arreglo no púede cambiar su tamaño
		 *      
		 *      
		 */
		
		// Definir un arreglo de 4 elementos de tipo int.
		// creando un objeto de tipo array de integers.
		int[] codigoColores = new int[4]; // [ 0 , 0  , 0 , 0 ] 
		
		// Iniciar un arreglo.
		// String[] frutas = new String[3]; // [ null , null , null ]
		String[] frutas = {"Uva", "Fresa", "Manzana"};
		
		// Crea un arreglo que pueda almacenar 4 nombres de automóviles.
		String[] nombresAutomoviles = new String[4];
		String[] autos = new String[4];		                 
		String[] nombreAutos = new String [4];
		
		// Agregar el nombre de un automovil en el índice 0
		autos[0] =  "Tesla";
		// Agregar otro nombre en el índice 1,2 y 3.
		autos[1] = "Cuchau";
		autos[2] = "Bochito";
		autos[3] = "Audi";
		
		// Si se intenta acceder a un elemento que no exista
		// se genera una excepción en tiempo de ejecución.
		// autos[4] = "Audi"; // Index 4 out of bounds for length 4
		
		
		// iterando un arreglo usando for loop
		for(int i = 0; i < autos.length ; i++ ) {
			System.out.println("Nombre de Auto :" + autos[i]);
		}
	
		// for loop enhanced 
		for(String auto : autos) {
			System.out.println("Auto: " + auto);
		}
		
		
		// Generar un arreglo de 2 dimensiones
		String[][] participantes = new String[3][5]; // 3 filas, 5 columnas
		
		
	} // main

} // class
