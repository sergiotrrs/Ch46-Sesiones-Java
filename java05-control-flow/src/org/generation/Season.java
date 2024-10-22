package org.generation;

import java.util.Scanner;

public class Season {

	public static void main(String[] args) {
		/*
		 * Determinar la estación.
		 * 
		 * 1.- Solicitar al usuario que ingrese un mes como texto. Ejemplo: Enero,
		 * Febrero, etc. 2.- Determinar la estación del año de acuerdo al mes ingresado
		 * 3.- Imprimir la estación correspondiente: Primavera, Verano, Otoño, Invierno
		 * 
		 * donde: - Primavera: Marzo, Abril, Mayo - Verano: Junio, Julio, Agosto -
		 * Otoño: Septiembre, Octubre, Novimiembre - Invierno: Diciembre, Enero, Febrero
		 * 
		 * Evaluar los meses usando if-else-if y switch
		 */

		Scanner sc;
		sc = new Scanner(System.in);

		System.out.println("Escribe un mes (ejemplo: Enero, Febrero, Marzo, etc.) ");

		// Parametrizar la entrada con .toLowerCase()
		String mes = sc.nextLine(); // Lee un texto

		switch (mes) {
		case "Diciembre", "Enero", "Febrero":
			System.out.println("El mes que ingresaste corresponde a la estación Invierno");
			break;
		case "Marzo", "Abril", "Mayo":
			System.out.println("El mes que ingresaste corresponde a la estación Primavera");
			break;
		case "Junio", "Julio", "Agosto":
			System.out.println("El mes que ingresaste corresponde a la estación Verano");
			break;
		case "Septiembre", "Octubre", "Noviembre":
			System.out.println("El mes que ingresaste corresponde a la estación Otoño");
			break;
		default:
			System.out.println("Ingresa un mes válido");
			break;
		}

		if (mes.equals("Diciembre") || mes.equals("Enero") || mes.equals("Febrero"))
			System.out.println("El mes que ingresaste se evaluó con if y corresponde a la estación Invierno");
		else if (mes.equals("Marzo") || mes.equals("Abril") || mes.equals("Mayo"))
			System.out.println("El mes que ingresaste se evaluó con if y corresponde a la estación Primavera");
		else if (mes.equals("Junio") || mes.equals("Julio") || mes.equals("Agosto"))
			System.out.println("El mes que ingresaste se evaluó con if y corresponde a la estación Verano");
		else if (mes.equals("Septiembre") || mes.equals("Octubre") || mes.equals("Noviembre"))
			System.out.println("El mes que ingresaste se evaluó con if y corresponde a la estación Otoño");
		else
			System.out.println("El mensaje ingresado no es válido");
		
		sc.close();

	}

}
