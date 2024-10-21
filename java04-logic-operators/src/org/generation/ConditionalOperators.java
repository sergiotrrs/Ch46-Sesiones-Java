package org.generation;

public class ConditionalOperators {

	public static void main(String[] args) {
		/*
		 * Los operadores evaluan valores booleanos
		 * Tienen el comportamiento de corto circuito: El segundo operador
		 *  solo se evalua si es necesario
		 
		   && conditional AND
		   ||  conditonal OR
		 
		 */
		
        int value1 = 1;
        int value2 = 2;
        
        if((value1 == 1) && (value2 == 2))
            System.out.println("value1 is 1 AND value2 is 2"); // Se imprime
        
        if((value1 == 1) || (value2 == 1))
            System.out.println("value1 is 1 OR value2 is 1"); // Se imprime
        
        
        
        

	}

}
