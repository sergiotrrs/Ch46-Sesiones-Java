package org.generation;

import java.util.Scanner;

public class EjercicioMesDeNacimiento {

	public static void main(String[] args) {
		// Switch usa el método equals para comparar los Strings.
		/**
		 * Leer usando la clase Scanner un mes (1 - 12) e indicar el mes en texto.
		 * ej:entrada-> "Escribe tu mes de nacimiento: " 12 salida-> Naciste en
		 * diciembre.
		 * 
		 */
		Scanner sc;
		sc = new Scanner(System.in);
		System.out.print("Escribe el numero de mes(1-12): ");

		int month = sc.nextInt(); // Lee un numero

		String monthName;

		switch (month) {
		case 1:
			monthName = "Enero";
			break;
		case 2:
			monthName = "Febrero";
			break;
		case 3:
			monthName = "Marzo";
			break;
		case 4:
			monthName = "Abril";
			break;
		case 5:
			monthName = "Mayo";
			break;
		case 6:
			monthName = "Junio";
			break;
		case 7:
			monthName = "Julio";
			break;
		case 8:
			monthName = "Agosto";
			break;
		case 9:
			monthName = "Septiembre";
			break;
		case 10:
			monthName = "Octubre";
			break;
		case 11:
			monthName = "Noviembre";
			break;
		case 12:
			monthName = "Diciembre";
			break;
		default:
			monthName = "Mes invalido: (valor entre 1 y 12)";
			break;
		}
		System.out.println("El mes es: " + monthName);

	}

}
