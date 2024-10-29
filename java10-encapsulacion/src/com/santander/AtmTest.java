package com.santander;

public class AtmTest {

	public static void main(String[] args) {
		Atm cajero01 = new Atm();
		
		// cajero01.balance = 40_000; // No se puede acceder a atributos private
		// cajero01.serialNumber = 1;
		
		System.out.println("N.Serie cajero01: " + cajero01.getSerialNumber() ); // 0
		System.out.println("N.Modelo cajero01: " + cajero01.getModel() ); // null
		
		cajero01.setModel("T-800");
		System.out.println("N.Modelo cajero01: " + cajero01.getModel() ); // null
		
		System.out.println(cajero01.getBalance());
		cajero01.setBalance(350_000);
		System.out.println(cajero01.getBalance());
		
		System.out.println( cajero01 );

	}

}
