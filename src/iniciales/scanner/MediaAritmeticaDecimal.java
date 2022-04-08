package iniciales.scanner;

import java.util.Locale;
import java.util.Scanner;

/*
 * SE DESEA CALCULAR LA MEDIA ARITMETICA DE DOS NOTAS QUE EL 
 * USUARIO INGRESE, DICHAS NOTAS PUEDEN SER DE TIPO DECIMAL 
 * O ENTERAS 
 * */
public class MediaAritmeticaDecimal {
	
	public static void main(String[] args) {
		
		//Podriamos analizar los tipos de datos por separado, pero trabajandolo
		//como double nos ahorramos ese paso
		
		
		try {
			
			Scanner sc = new Scanner(System.in);
			
			//Cambiamos el estandar para uso de puntos y no de comas en decimales
			sc.useLocale(Locale.US);
			
			System.out.println("\n--Ingresar Primera Nota--");
			
			double primeraNota = sc.nextDouble();
			
			System.out.println("\n--Ingresar Segunda Nota--");
			
			double segundaNota = sc.nextDouble();
			
			
			double mediaAritmetica = (primeraNota + segundaNota) / 2;
			
			
			System.out.println("\n--La Media Aritmetica entre "
			+primeraNota+" y "+segundaNota+" es "+mediaAritmetica+" ==");

			
		} catch (Exception e) {
			e.printStackTrace();
		}
		finally {
			//POR LO GENERAL EL FINALLY LO TRABAJAMOS CON ARCHIVOS
			//O USO DE RECURSOS DEL SISTEMA PARA QUE NO QUEDEN ABIERTOS 

			
			System.out.println("\n----Programa Finalizado------");
		}
		
	}

}
