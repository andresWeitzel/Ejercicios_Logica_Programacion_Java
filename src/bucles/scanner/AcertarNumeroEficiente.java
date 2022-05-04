package bucles.scanner;

import java.util.Scanner;

public class AcertarNumeroEficiente {

	public static void main(String[] args) {

		System.out.println("\n ======= JUEGO NÚMERO SECRETO EFICIENTE========");

		try {

			// Mat.random()*numero + numero minimo
			// numero maximo = numero + numero minimo
			// numero maximo = 99 + 1
			// numero maximo = 100
			int numAleat = (int) (Math.random() * 99 + 1);
			
			System.out.println(numAleat);

			System.out.println("\n-- Ingresar un Número --");

			Scanner sc = new Scanner(System.in);

			int numInput = sc.nextInt();

			// la logica del while ahora no se centra en mayor o menor, sino
			// en que no sea el numero generado y el de salir del programa
			// Nos ahorramos 1 if, 1 for y 1 while
			
			//SIEMPRE EL FOR VA A SER MAS EFICIENTE QUE UN WHILE, PERO SI DENTRO
			//DEL FOR TENEMOS MAS CANTIDAD DE BUCLES NO SERA TAN EFICIENTE COMO
			//UN WHILE GENERICO

			while (numInput != numAleat && numInput != -1) {

				if (numInput > numAleat) {

					System.out.println("\n-----------------------------");
					System.out.println("--EL NUMERO SECRETO ES MENOR--");
					System.out.println("-------------------------------");

					System.out.println("\n-- INGRESAR OTRO NÚMERO --");
					numInput = sc.nextInt();

				} else {

					System.out.println("\n--------------------------------");
					System.out.println("--EL NUMERO SECRETO ES MAYOR--");
					System.out.println("---------------------------------");

					System.out.println("\n-- INGRESAR OTRO NÚMERO --");
					numInput = sc.nextInt();

				}

				if (numInput == numAleat) {
					System.out.println("\n------------------------------");
					System.out.println("--HAS ACERTADO, FELICIDADES--");
					System.out.println("------------------------------");
					System.out.println("\n-- El numero secreto es " + numAleat);

					// El return nos corta el ciclo natural de comprobacion del
					// while, puede ser util o no segun que se considere
					return;

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
