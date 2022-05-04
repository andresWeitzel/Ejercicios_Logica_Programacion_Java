package funciones.scanner;

import java.util.Scanner;



/*
 * ESCRIBIR UNA FUNCION A LA QUE SE LE PASEN DOS ENTEROS POR CONSOLA Y MUESTRE
 *  TODOS LOS NUMEROS COMPRENDIDOS ENTRE ELLOS
 * 
 * */

public class NumerosEntreNumeros {
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
		
		if(num01 < num02) {
			//Nos indican entre ellos, no que incluyamos los numeros de entrada
			//entonces i sumamos 1 al primer numero para que no lo muestre y el
			//segundo no lo incluimos
			System.out.println("\n== Numeros Comprendidos entre "+num01+" y "+num02);
			for(int i = (num01)+1 ; i < num02 ; i++) {
				System.out.println(i);
			}
		}else {
			System.out.println("\n== Numeros Comprendidos entre "+num02+" y "+num01);
			for(int i = (num02)+1 ; i < num01 ; i++) {
				System.out.println(i);
			}
			
		}
	}

}
