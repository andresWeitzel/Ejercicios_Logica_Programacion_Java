package iniciales.scanner;

import java.util.Locale;
import java.util.Scanner;

public class RedondeoDecimalEnteroCompleted {
	
	/*
	 * Se desea un programa que pida como entrada
	 * un numero decimal y lo muestre redondeado
	 * al entero mas proximo
	 * */
	public static void main(String[] args) {
		
		
		try {
			
			System.out.println("\n===== INGRESAR UN NUMERO DECIMAL ======");
			
			Scanner sc = new Scanner(System.in);
			
			//3.4 7.8 - 5,6 7,8
			//Cambiamos el estandar para su uso de puntos y no de comas en decimales
			sc.useLocale(Locale.US);
			
			
			double numInput = sc.nextDouble();
			
			
			//Sabemos que debemos aplicar un cast
			//pero tambien tendremos que aplicar un
			//factor de conversion para redondeos, ese
			//factor es el 0.5 ya que nos aseguramos de tener 
			//un redondeo aceptable segun los digitos despues
			//del punto o coma
			 
			int numRedondeo = (int)(numInput + 0.5);
			
			
			
			System.out.println("\n El Número "+numInput+" redondeado al Entero más"
					+ "próximo es "+numRedondeo);
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}finally {System.out.println("\n== Programa Finalizado ==");}
		
		
	}

}
