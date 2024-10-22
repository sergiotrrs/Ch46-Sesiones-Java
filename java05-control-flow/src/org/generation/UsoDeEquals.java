package org.generation;

public class UsoDeEquals {

	public static void main(String[] args) {
		
		// Dato inmutable: no se puede modificar
		int nCuentaBancaria = 999;
		nCuentaBancaria = 888;
		
		// Los Strings en java son objetos inmutables
		String nombre = "Lizbeth";
		nombre = "Lorena";
		
		String persona = "Lizbeth";
		
		// Con el operador == en los objetos se verifica
		// la referencia en memoria
		// 0xAB4521 ==  0xAB4521
		if( persona == "Lizbeth") System.out.println("Es la misma persona");
		else System.out.println("No es la persona");
		
		// forzar en la creación de un nuevo objeto
		String name = new String("Lizbeth");
     // 0xCCC333 ==  0xAB4521
		if( name == "Lizbeth") System.out.println("Es la misma persona");
		else System.out.println("No es la persona");
		
		// Compara el contenido del objeto
		//    Lizbeth es igual a Lizbeth
		if( name.equals("Lizbeth") ) System.out.println("Es la misma persona");
		else System.out.println("No es la persona");
	
	
		

	}

}
