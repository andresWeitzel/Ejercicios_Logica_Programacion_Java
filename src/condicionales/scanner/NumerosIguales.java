package condicionales.scanner;

import java.util.Locale;
import java.util.Scanner;

/*
 * PEDIR DOS NUMEROS ENTEROS Y COMPROBAR SI SON IGUALES
 * 
 * */
public class NumerosIguales {
	
	public static void main(String[] args) {
		
		try {
			
			Scanner sc = new Scanner(System.in);
			sc.useLocale(Locale.US);
			
			System.out.println("\n==INGRESAR PRIMER NÚMERO==");
			double numInput01 =sc.nextDouble();
			
			System.out.println("\n==INGRESAR SEGUNDO NÚMERO==");
			double numInput02 = sc.nextDouble();
			
			if(numInput01 == numInput02) {
				System.out.println("\n ==Numeros Iguales ==");
			}else {
				System.out.println("\n ==Numeros DesIguales ==");
			}
			
			
		} catch (Exception e) {
e.printStackTrace();
		}finally {
			System.out.println("\n--Programa Finalizado--");
		}
		
	}

}
