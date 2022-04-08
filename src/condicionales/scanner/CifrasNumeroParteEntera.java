package condicionales.scanner;

import java.util.Locale;
import java.util.Scanner;

/*
 * ESCRIBIR UNA APLICACION QUE INDIQUE CUANTAS CIFRAS TIENE UN NUMERO
 * ENTERO O DECIMAL INTRODUCIDO POR TECLADO, QUE ESTARA COMPRENDIDO ENTRE 0 99.999
 * CASO QUE SEA DECIMAL SOLAMENTE CONTABILIZAR LA PARTE ENTERA
 * 
 * */
public class CifrasNumeroParteEntera {
public static void main(String[] args) {
		
		

		try {
			
			Scanner sc = new Scanner(System.in);
			sc.useLocale(Locale.US);
			
			System.out.println("\n==INGRESAR NÚMERO==");
			
			//Como es posible que se ingrese un decimal y hay que contar
			//sus cifras de la parte entero casteamos y esperamos un decimal de 
			//entrada
			int numInput01 =(int)(sc.nextDouble());
		
			
			
			if(numInput01 < 10) {
				System.out.println("\nEl Número "+numInput01
						+" tiene 1 cifra");
				
			}else if(numInput01 < 100){
				System.out.println("\nEl Número "+numInput01
						+" tiene 2 cifras");
				
			}else if(numInput01 < 1000){
				System.out.println("\nEl Número "+numInput01
						+" tiene 3 cifras");
				
			}else if(numInput01 < 10000){
				System.out.println("\nEl Número "+numInput01
						+" tiene 4 cifras");
			
			}else if(numInput01 < 100000){
				System.out.println("\nEl Número "+numInput01
						+" tiene 5 cifras");
			}else {
				System.out.println("\n Número Ingresado fuera de Rango");
			}
			
			
		} catch (Exception e) {
e.printStackTrace();
		}finally {
			System.out.println("\n--Programa Finalizado--");
		}
	}

}
