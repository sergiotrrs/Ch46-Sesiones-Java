package com.santander;

public class AtmTest {

	public static void main(String[] args) {
		
		// Instanciar la clase Atm y asignarlo a una variable
		Atm cajero01 = new Atm();
		// Instanciar nuevamente la clase Atm y asignarlo a la variable 'cajero02'
		Atm cajero02 = new Atm();
		
		// Asignar valores a los atributos del cajero01
		cajero01.serialNumber = 1;
		cajero01.model = "T-800";
		cajero01.balance =  450_000;
		
		// Asignar valores a los atributos del cajero02
		cajero02.serialNumber = 2;
		cajero02.model = "T-1000";
		cajero02.balance = 600_000;
		
		// Asignar un valor al atributo static de la clase ATM
		Atm.bankName = "Santander";
		
		// Leer los atributos estáticos
		System.out.println( cajero01.bankName ); // Santander
		System.out.println( cajero02.bankName ); // Santander
		System.out.println( Atm.bankName ); // Santander
		
		// Imprimir el balance de cajero 01, depositar $50_000, y mostrar el nuevo balance
		System.out.println("Cajero01 $ " + cajero01.balance ); // 450_000
		cajero01.deposit(50_000);
		System.out.println("Cajero01 $ " + cajero01.balance ); // 500_000
		
		// Realizar lo mismo para el cajero 02, con depósito de $120_000
		System.out.println("Cajero02 $ " + cajero02.balance); // 600_000
		System.out.println("Más depósito $" + cajero02.deposit(120_000) ); // 720_000
		System.out.println("Cajero02 $ " + cajero02.balance); // 720_000
		
		// Realizar la implementación en la clase Atm, del método withdraw()
		// para que los cajeros acepten retiros, el 'amount'(retiro) se suma a 'balance'
		// Mostrar en AtmTest el balance antes y después del retiro
		// Realizar para cajero01 retiro de $30_000
		System.out.println(cajero01.balance);
		System.out.println("Retiro: $" + cajero01.withdraw(30_000)); // 470000.0
					
		// Realizar para cajero02 retiro de $70_000
		System.out.println(cajero02.balance);
		System.out.println("Retiro: $" + cajero02.withdraw(70_000)); // 650000.0
		
		// System.out.println( cajero01.printBankName() );
		// System.out.println( cajero02.printBankName() );
		System.out.println( Atm.printBankName() );
		

	}

}
