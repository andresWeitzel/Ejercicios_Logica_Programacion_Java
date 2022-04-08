package condicionales.scanner;

import java.util.Locale;
import java.util.Scanner;

/*
 * SOLICITAR DOS NUMEROS DISTINTOS 
 * Y MOSTRAR CUAL ES EL MAYOR DE ELLOS
 * 
 * */
public class NumeroMayor {
	
	public static void main(String[] args) {
		
		

		try {
			
			Scanner sc = new Scanner(System.in);
			sc.useLocale(Locale.US);
			
			System.out.println("\n==INGRESAR PRIMER N�MERO==");
			double numInput01 =sc.nextDouble();
			
			System.out.println("\n==INGRESAR SEGUNDO N�MERO==");
			double numInput02 = sc.nextDouble();
			
			if(numInput01 > numInput02) {
				System.out.println("\nEl N�mero "+numInput01
						+" es mayor que "+numInput02);
			}else {
				System.out.println("\nEl N�mero "+numInput02
						+" es mayor que "+numInput01);
			}
			
			
		} catch (Exception e) {
e.printStackTrace();
		}finally {
			System.out.println("\n--Programa Finalizado--");
		}
	}

}
