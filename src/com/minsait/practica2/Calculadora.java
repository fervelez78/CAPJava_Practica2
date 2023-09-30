package com.minsait.practica2;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Calculadora {

	public static int leerEntero(BufferedReader in) {
		int resultado = 0;
		boolean leido = false;
		while (!leido) {
			try {
				resultado = Integer.parseInt(in.readLine());
				leido = true;
			}catch(Exception e) {
				System.out.println(" Numero incorrecto:");
			}
		}
		return resultado;
		
	}
	
	public static void main(String[] args) {
		
		int opcion = -1;
		int numero1 = 0;
		int numero2 = 0;
		
		while (opcion != 5) {
			System.out.println("Ingresar dos números:");
			System.out.print(" Número 1:");
			BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
			numero1 = leerEntero(in);
			System.out.print(" Número 2:");
			numero2 = leerEntero(in);
			System.out.println("Seleccione la opciona realizar:");
			System.out.println(" 1. Sumar");
			System.out.println(" 2. Restar");
			System.out.println(" 3. Multiplicar:");
			System.out.println(" 4. Dividir");
			System.out.println(" 5. Salir");
			System.out.print("Opción:");
			opcion = leerEntero(in);
			float resultado = 0f;
			switch (opcion){
				case 1:
					resultado = numero1 + numero2;
					break;
				case 2:
					resultado = numero1 - numero2;
					break;
				case 3:
					resultado = numero1 * numero2;
					break;
				case 4:
					resultado = numero1 / numero2;
					break;
			}
			if (opcion != 5)
				System.out.println("Resultado: " + resultado);
			
		}
		
	}
	
}
