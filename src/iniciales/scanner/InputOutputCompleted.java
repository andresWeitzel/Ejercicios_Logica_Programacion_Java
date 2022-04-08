package iniciales.scanner;

import java.util.Scanner;

/*
 * SE PIDE UN NÚMERO AL USUARIO POR CONSOLA Y SE DEBERA MOSTRAR
 * EL MISMO EN LA SALIDA DE LA CONSOLA
 * 
 * NO ES NECESARIO PROCESAR EL DATO DE ENTRADA
 * 
 * */

public class InputOutputCompleted {
	
	
	public static void main(String[] args) {
		
		
		
		try {
			System.out.println("\n == INGRESAR UN NÚMERO ENTERO ==");
			
			Scanner scanner = new Scanner(System.in);
			
			
			int numInput = scanner.nextInt();
			
			System.out.println("\n Número Ingresado "+numInput);
			
		
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		finally {
			
			
			System.out.println("\n == PROGRAMA FINALIZADO ==");

		
		}
		
		
		
		
		
		
		
	}
	
	


}
