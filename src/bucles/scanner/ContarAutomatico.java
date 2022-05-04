package bucles.scanner;

import java.util.Scanner;

/*
 * ESCRIBIR UNA APLICACION QUE APRENDA A CONTAR, PEDIRA UN NUMERO N Y MOSTRARA
 * TODOS LOS NUMEROS DEL 1 A N
 * */

public class ContarAutomatico {
	
	public static void main(String[] args) {

		System.out.println("\n ======= CONTAR AUTOMATICO ========");

		try {

			System.out.println("\n-- Ingresar un Número --");

			Scanner sc = new Scanner(System.in);

			int numInput = sc.nextInt();

			
			
			int sec=1;
			System.out.println("\n==Secuencia Numerica==");
			while(numInput > 0 && sec <= numInput){
				System.out.println(sec);
				sec++;
			}
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}

		finally {
			System.out.println("\n -- Programa Finalizado --");
		}

	}

}
