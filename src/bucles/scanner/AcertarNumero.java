package bucles.scanner;

import java.util.Scanner;

/*
 * 
 * REALIZAR EL JUEGO "EL NUMERO SECRETO" QUE CONSISTE EN ACERTAR UN NUMERO DESCONOCIDO
 * (GENERADO ALEATORIAMENTE ENTRE 1 Y 100). PARA ELLO SE LEEN POR TECLADO UNA SERIE
 * DE NUMEROS, PARA LOS QUE SE INDICA: "MAYOR" O "MENOR", SEGUN SEA MAYOR O MENOR CON
 * RESPECTO AL NUMERO SECRETO. EL PROCESO TERMINA CUANDO EL USUARIO ACIERTA O CUANDO 
 * SE RINDE (INTRODUCIENDO UN -1). 
 * 
 * */

public class AcertarNumero {
	
	public static void main(String[] args) {

		System.out.println("\n ======= JUEGO NÚMERO SECRETO ========");

		try {

			//Mat.random()*numero  + numero minimo
			//numero maximo = numero + numero minimo
			//numero maximo = 99 + 1 
			//numero maximo = 100
			int numAleat= (int)(Math.random()*99 + 1);
			System.out.println(numAleat);
			
			
			System.out.println("\n-- Ingresar un Número --");
			
			Scanner sc = new Scanner(System.in);

			int numInput = sc.nextInt();
			
			//Si no declaramos un for y trabajamos la logica de comprobar si es mayor
			//o menor solo con el while no 
			//se vuelve a repetir una vez ejecutado este, entonces iteramos un numero
			//alto de veces y cortamos cuando se lo indiquemos
			
			//SIEMPRE EL FOR VA A SER MAS EFICIENTE QUE UN WHILE, PERO SI DENTRO
			//DEL FOR TENEMOS MAS CANTIDAD DE BUCLES NO SERA TAN EFICIENTE COMO
			//UN WHILE GENERICO
			
			for(int i=0 ; i < 200 ; i++ ) {

				while (numInput > numAleat) {
					
					System.out.println("\n-----------------------------");
					System.out.println("--EL NUMERO SECRETO ES MENOR--");
					System.out.println("-------------------------------");
					
					System.out.println("\n-- INGRESAR OTRO NÚMERO --");
					numInput = sc.nextInt();
					
					if(numInput == -1) return;
					
				}
				
				while (numInput < numAleat) {

					System.out.println("\n--------------------------------");
					System.out.println("--EL NUMERO SECRETO ES MAYOR--");
					System.out.println("---------------------------------");
					
					System.out.println("\n-- INGRESAR OTRO NÚMERO --");
					numInput = sc.nextInt();
					
					if(numInput == -1) return;
					
				}
				
				if(numInput == numAleat) {
					System.out.println("\n------------------------------");
					System.out.println("--HAS ACERTADO, FELICIDADES--");
					System.out.println("------------------------------");
					System.out.println("\n-- El numero secreto es "+numAleat);
					
					return;
					
					
				}
				

				
				
			}
						
		} 
		catch (Exception e) {e.printStackTrace();}
		
		finally {System.out.println("\n -- Programa Finalizado --");}

	}


}
