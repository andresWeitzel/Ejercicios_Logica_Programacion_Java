package condicionales.scanner;

import java.util.Locale;
import java.util.Scanner;

/*
 * DISEÑAR UNA APLICACION QUE SOLICITE AL USUARIO UN NUMERO
 * E INDICAR SI ES IMPAR O IMPAR
 * 
 * */

public class NumeroParImpar {
	
	public static void main(String[] args) {
		//Un Numero Par SIEMPRE es divisible por 2, y su resto SIEMPRE
		//SERA CERO.
		//EN PROGRAMACION EXISTE EL MODULO(%) DE UN NUMERO. EL MODULO DE 
		//UNA OPERACION ES OBTENER EL RESIDUO O RESTO PARA DOS NUMEROS QUE SE
		//DIVIDEN..
		//EJ--> 4 % 2 = resto:0
		// 4 modulo 2 nos da resto cero
		
		try {
			
			Scanner sc = new Scanner(System.in);
			sc.useLocale(Locale.US);
			
			System.out.println("\n==INGRESAR NÚMERO==");
			int numInput =(int)( sc.nextDouble());
			
			if((numInput % 2)==0) {
				System.out.println("\n== El Número "+numInput+" es PAR!");
				
			}else{
				System.out.println("\n== El Número "+numInput+" es IMPAR!");
				
			}
			
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			System.out.println("\n==Programa Finalizado==");
		}
		
	}

}
