package bucles.scanner;

import java.util.Scanner;

/*
 * ESCRIBIR UNA APLICACION QUE APRENDA A CONTAR, PEDIRA UN NUMERO N Y MOSTRARA
 * TODOS LOS NUMEROS DEL 1 A N
 * */

public class ContarAutomaticoEficiente {
	
	public static void main(String[] args) {

		System.out.println("\n ======= CONTAR AUTOMATICO ========");

		try {

			System.out.println("\n-- Ingresar un Número --");

			Scanner sc = new Scanner(System.in);

			int numInput = sc.nextInt();

			
		
			
			if(numInput > 0) {

				System.out.println("\n==Secuencia Numerica==");
				for(int i=1 ; i <= numInput ; i++ ) {
					System.out.println(i);
				}	
			}

			
		} catch (Exception e) {
			e.printStackTrace();
		}

		finally {
			System.out.println("\n -- Programa Finalizado --");
		}

	}

}
