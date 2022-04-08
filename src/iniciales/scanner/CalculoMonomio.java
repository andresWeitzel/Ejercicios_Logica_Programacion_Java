package iniciales.scanner;

import java.util.Locale;
import java.util.Scanner;

/*
 * DADO EL MONOMIO  3x^2 . SE DESEA CREAR UN PROGRAMA QUE PIDA EL COEFICIENTE
 * DEL MONOMIO, TIPO DE VARIABLE (X O Y) Y EL EXPONENTE PARA PODER MOSTRAR DICHO
 * MONOMIO POR CONSOLA
 * 
 * Un monomio es una expresion que solo tiene un termino
 * 
 * */
public class CalculoMonomio {
	
	public static void main(String[] args) {
		
		
		try {
			Scanner sc=new Scanner(System.in);
			sc.useLocale(Locale.US);
			
			Scanner scString=new Scanner(System.in);
			
			
			System.out.println("\n== MONOMIOS ==");
			
			System.out.println("\n==Ingresar el Coeficiente del Monomio ==");
			double coeficiente = sc.nextDouble(); 
			
			
			System.out.println("\n==Ingresar la Variable del Monomio(x o y) ==");
			String variable = scString.nextLine();
			
			System.out.println("\n==Ingresar el Exponente del Monomio(solo Número) ==");
			int exponente = sc.nextInt(); 
			
			
			System.out.println("\n MODELO DEL MONOMIO --> "
			+coeficiente+variable+"^"+exponente);
			
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			
		}
	}

}
