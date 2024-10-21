package org.generation;

public class RelationalOperators {

	public static void main(String[] args) {
		/*
		 *  Operadores de igualdad, relacionales y condicionales
		   
		   ==      equal to
		   !=      not equal to
		   >       greater than
		   >=      greater than or equal to
		   <       less than
		   <=      less than or equal to		
		 
		 */
        int value1 = 1;
        int value2 = 2;
        
        if(value1 == value2)
            System.out.println("value1 == value2"); // No se imprime
        
        if(value1 != value2)
            System.out.println("value1 != value2"); // imprime
        
        if(value1 > value2)
            System.out.println("value1 > value2"); // No se imprime
        
        if(value1 < value2)
            System.out.println("value1 < value2"); //  Se imprime
        
        if(value1 <= value2)
            System.out.println("value1 <= value2"); // Se imprime
        
        // if(value1 <= "10") No se puede realizar la comparación
        String valor = "10";
        byte valorAByte = Byte.parseByte(valor);
        short valorAShort = Short.parseShort(valor);
        int valorAInt = Integer.parseInt(valor);
        long valorALong = Long.parseLong(valor);
        float valorAFloat = Float.parseFloat(valor); 
        double valorADouble = Double.parseDouble(valor);
        
        if( value1 <= valorAShort ) System.out.println("Valor menor");
        
        
    }

	

}
