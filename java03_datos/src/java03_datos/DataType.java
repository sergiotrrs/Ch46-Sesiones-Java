package java03_datos;

public class DataType {

	public static void main(String[] args) {
		// Este es un comentario de línea
		/*
		 * Este es un comentario de bloque
		 */
		
        /*         
         * 
         * Reglas para el nombre de las variables:
		 *  - Se distingue entre minúsculas y mayúsculas
		 *  - La longitud del nombre es ilimitada
		 *  - Puedes utilizar cualquier caracter Unicode
		 *  - La variable puede comenzar:
		 *    > una letra ej. miVariable
		 *    > signo de dolar $miVariable
		 *    > caracter de subrayado _miVariable
		 *  
         */
		
		int $myVar; // Es válido, pero no se recomienda
		int _numEngranes; // Es válido, pero no se recomienda
		int myVarEnEspañol; // Es válido, se recomienda nombres en inglés
		int sinC0m3nt4r10s; // Es válido, no recomendable por que es confuso
		// int 5comentarios; // No es válido 
		boolean isOpenDoor5; // Es válida
		
		/*
		 * En Java tendremos  los siguientes tipo de variables:
		 *  Variables de instancia (Non static fields): atributos de los objetos.
		 *  Variables de clase (Static Fields): atributos de la clase.
		 *  Variables locales (local variables): variable dentro de las funciones(métodos)
		 *  Parámetros (parameters): Entrada de las funciones
		 * 
		 */
		
		/**
		 *  https://docs.oracle.com/javase/tutorial/java/nutsandbolts/datatypes.html
		 *  Tipos de datos en Java
		 *  - Objetos
		 *  - Datos primitivos
		 *  	8 datos primitivos
		 *   > byte
		 *   > short
		 *   > int
		 *   > long
		 *   > float
		 *   > double
		 *   > boolean
		 *   > char
		 *      
		 */
		
		// El tipo byte es de 8 bits, almacena datos numéricos enteros
		byte myVarByte; // Declarando variable
		myVarByte = 12; // Asignar un valor a la variable
		
		/*
		 *  El número de de dígitos que puede contener la varible
		 *  2^8 = 256;
		 *  
		 *  Para Obtener el valor máximo y mínimo del tipo byte
		 *  usando su wrapper (clase envolvete) Byte.
		 */
		// byte diametroTierra = 12742; No puede almacenar este valor
		System.out.println("Max Value in byte type: " + Byte.MAX_VALUE ); // 127
		System.out.println("Min Value in byte type: " + Byte.MIN_VALUE ); // -128
		
		/*
		 *  Tipo de dato short
		 *  Dato de 16 bits, alamacena valores enteros
		 *  2^16 = 65536
		 *  Valores positivos:  0... 32767
		 *  Valores Negativos: -1... -32768
		 *  Obtener el MAX_VALUE y MIN_VALUE usando el warapper Short
		 */
		short myVarShort = 12742;
		// Imprimer el MAX y MIN VALUE para el dato short        
		System.out.println("Max Value in short type: " + Short.MAX_VALUE);
		System.out.println("Min Value in short type: " + Short.MIN_VALUE);
		
		/*
		 * Tipo de dato int
		 * Dato de 32 bits, almacena datos enteros
		 * El wrapper de int es Integer
		 */
		// Declara una variable de tipo int
		// Muestra el MAX_VALUE y MIN_VALUE usando el warapper Integer
		int myVarInt = 61234;
		System.out.println("Max Value in int type: " + Integer.MAX_VALUE ); // 2147483647
		System.out.println("Min Value in int type: " + Integer.MIN_VALUE ); // -2147483648
		
		/*
		 * Tipo de dato long
		 * Dato de 64 bits, alamcena datos enteros
		 * El wrapper de long es Long
		 */	
		// Imprimir el MAX y MIN VALUE para el dato long		
		System.out.println("Max value in long type: " + Long.MAX_VALUE);
	    System.out.println("Max value in long type: " + Long.MIN_VALUE);
		
	    long myVarLong;
	    
	    myVarLong = 2_147_483_648L;
	    		
		/*
		 * Las literales numéricas enteras en java son de tipo int
		 * ej. 12, -456, 0
		 * Para idicar una literal numética de tipo long
		 * hay que indicar la literal con la letra l o L.
		 * Se recomienda usar la L para no confundir con el 1
		 */
	    // short edad = 67L; No se puede alacenar 64 bits en variable de 16bits
	    
		// =========Datos de punto flotante===================================
		/*
		 * Dato de tipo float
		 * Dato de 32 bits, almacena valos numéricos de punto flotante.
		 * 
		 * El wrapper de float es Float.
		 * 
		 */
	    // Muestra el MAX_VALUE y MIN_VALUE usando el warapper Float
	    System.out.println("Max Value in float type: " + Float.MAX_VALUE);// 3.4028235E38
		System.out.println("Min Value in float type: " + Float.MIN_VALUE);// 1.4E-45
	    System.out.println( .1 + .2 ); // 0.30000000000000004
	    
		/*
		 * Dato de tipo double
		 * Dato de 64 bits, almacena valos numéricos de punto flotante.
		 * 
		 * El wrapper de double es Double.
		 * 
		 */
	     // Muestra el MAX_VALUE y MIN_VALUE usando el warapper Double
	    System.out.println("Max value in double type: " + Double.MAX_VALUE); // 1.7976931348623157E308
	    System.out.println("Max value in double type: " + Double.MIN_VALUE); // 4.9E-324
	    
	    /*
		 *  Las literales de punto flotante son por default double(64)
		 *  ej. 123.567, 0.012, -0.989
		 */
	    float myVarFloat = 1.23F;
	    
	    /*
		 * Dato Boolean
		 * Almacea valores true o false
		 */
		boolean myVarBoolea = true;
		
		/*
		 * Dato char
		 * Almacena un solo caracter.
		 * Se debe definir la literal con apóstrofe ej. 'a', 'C', ' '
		 * Solo almacea caracteres de la tabla unicode(16 bits).
		 * puede almacenar del 0 al 65535
		 */
		char primeraLetraEnFernanda =  'F';
	    
		// Se puede alacenar por su valor unicode '\\u ValorHexadecimal'
		char primeraLetraEnFernandaUnicode = '\u0046'; // F
		System.out.println( primeraLetraEnFernandaUnicode);
		// Se puede definir por su valor numérico
		char letraF = 70;
		System.out.println("F: " + letraF);
		
		/*
		 * Formas de representar un número
		 */
		System.out.println("Representación decimal: " + 34 );
		System.out.println("Representación hexadecimal: " + 0x22 ); // 34
		System.out.println("Representación binaria: " + 0b0010_0010 ); // 34
		System.out.println("Representación octal: " + 042 ); // 34
		
		//===============Objeto String =====================================
		/*
		 * Tipo de dato String
		 * Es un objeto que se define con comillas dobles.
		 * 
		 * Si deseas imprimir comillas dobles,se usa el 
		 * caracter de escape \
		 *   \b backspace
		 *   \t tab
		 *   \n line feed
		 *   \r carriage return
		 *   \" double quote
		 *   \' single quote
		 *   \\ backslash
		 */
		String despedida = "Java \"Monos\" \na \n\tComer";
		System.out.println( despedida );
				
		
	}

}
