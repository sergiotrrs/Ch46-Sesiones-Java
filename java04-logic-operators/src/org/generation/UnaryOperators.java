package org.generation;

public class UnaryOperators {

	public static void main(String[] args) {
		/*
		 Los operadores unarios requieren un solo operando.
		  
		  +		Unary plus operator; indicates positive value (numbers are positive without this, however)
		  -		Unary minus operator; negates an expression
		  ++	Increment operator; increments a value by 1
		  --	Decrement operator; decrements a value by 1
		  !		Logical complement operator; inverts the value of a boolean
		 
		 */
	
		
		int valueA = -10; // El valor es negativo
		int valueB = +20; // Por feault los valores son positivos
		
		int valorInicial = 10;
		
		System.out.println("Preincremento: " + ++valorInicial); // 11		
		System.out.println("Postincremento: " + valorInicial++); // 11		
		System.out.println("Valor final " + valorInicial); // 12
		
		valorInicial = 50;
		System.out.println("Predecremento: " + --valorInicial); // 49		
		System.out.println("Postdecremento: " + valorInicial--); // 49	
		System.out.println("Valor final " + valorInicial); // 48
					

	}

}
