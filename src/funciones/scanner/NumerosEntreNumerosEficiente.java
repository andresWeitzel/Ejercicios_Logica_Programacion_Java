package funciones.scanner;

import java.util.Scanner;

public class NumerosEntreNumerosEficiente {

	public static void main(String[] args) {

		try {

			Scanner sc = new Scanner(System.in);
			
			System.out.println("\n==Ingrese el Primer Numero ==");
			int numInput01 = sc.nextInt();
			
			System.out.println("\n==Ingrese el Segundo Numero ==");
			int numInput02 = sc.nextInt();

			
			numerosComprendidos(numInput01, numInput02);

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			System.out.println("\n== Programa Finalizado ==");
		}

	}
	
	public static void numerosComprendidos(int num01, int num02) {
		
		//Ordenamos los numeros de entrada para ahorrarnos 1 for
		
		int menor = num01 < num02 ? num01 : num02;
		int mayor = num01 > num02 ? num01 : num02;
		
	
			System.out.println("\n== Numeros Comprendidos entre "+menor+" y "+mayor);
			for(int i = (menor)+1 ; i < mayor ; i++) {
				System.out.println(i);
			}
	
	}

}

