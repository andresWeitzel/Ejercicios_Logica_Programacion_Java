package condicionales.scanner;

import java.util.Locale;
import java.util.Scanner;


/*
 * SOLICITAR TRES NUMEROS 
 * Y MOSTRAR...
 * - CUAL ES EL MAYOR DE ELLOS
 * - DE FORMA ORDENADA CRECIENTEMENTE
 * - SI HAY NUMEROS IGUALES 
 *  
 * 
 * */
public class NumeroMayorCompletoOrdenamiento {
	public static void main(String[] args) {
		
		

		try {
			
			Scanner sc = new Scanner(System.in);
			sc.useLocale(Locale.US);
			
			System.out.println("\n==INGRESAR PRIMER NÚMERO==");
			double numInput01 =sc.nextDouble();
			
			System.out.println("\n==INGRESAR SEGUNDO NÚMERO==");
			double numInput02 = sc.nextDouble();
			
			System.out.println("\n==INGRESAR TERCER NÚMERO==");
			double numInput03 = sc.nextDouble();
			
			//---------------------------------------------------------------
			
			//Comprobamos el segundo numero sea menor que los otros
			if((numInput01 > numInput02) && (numInput03 > numInput02)) {
				
				//Primero Comprobamos los Numeros Iguales
				if(numInput01 == numInput02) {
					System.out.println("Los Números "
							+numInput01+" y "+numInput02+" son iguales");
					
				}else if(numInput01 == numInput03) {
					System.out.println("Los Números "
							+numInput01+" y "+numInput03+" son iguales");
					
				}else if(numInput02 == numInput03) {
					System.out.println("Los Números "
							+numInput02+" y "+numInput03+" son iguales");
					
				}
				
				//Ya sabemos que el primer y tercer numero es mas grande
				//que el segundo.Comprobamos el primer y tercero
				if(numInput01 > numInput03) {
					System.out.println("El Número más grande es "
							+numInput01);
					
					System.out.println("Ordenamiento Menor a Mayor:["+numInput02+" < "
					+numInput03+" < "+numInput01+"]");
					
				}else {
					System.out.println("El Número más grande es "
							+numInput03);
					
					System.out.println("Ordenamiento Menor a Mayor:["+numInput02+" < "
							+numInput01+" < "+numInput03+"]");
							
				}
				
			//---------------------------------------------------------------
				
			//Comprobamos que el tercer numero sea menor que los otros	
			}else if((numInput01 > numInput03) && (numInput02 > numInput03)) {
				
				//Primero Comprobamos los Numeros Iguales
				if(numInput01 == numInput02) {
					System.out.println("Los Números "
							+numInput01+" y "+numInput02+" son iguales");
					
				}else if(numInput01 == numInput03) {
					System.out.println("Los Números "
							+numInput01+" y "+numInput03+" son iguales");
					
				}else if(numInput02 == numInput03) {
					System.out.println("Los Números "
							+numInput02+" y "+numInput03+" son iguales");
					
				}
				
				
				
				//Ya sabemos que el primer y segundo numero es mas grande
				//que el tercero. Comprobamos el primer y segundo
				if(numInput01 > numInput02) {
					System.out.println("El Número más grande es "
							+numInput01);
					
					System.out.println("Ordenamiento Menor a Mayor:["+numInput03+" < "
							+numInput02+" < "+numInput01+"]");
						
					
				}else {
					System.out.println("El Número más grande es "
							+numInput02);
					
					System.out.println("Ordenamiento Menor a Mayor:["+numInput03+" < "
							+numInput01+" < "+numInput02+"]");
						
					
					
				}
				
			//---------------------------------------------------------------
					
			//Comprobamos que el primer numero sea menor que los otros
			}else if((numInput03 > numInput01) && (numInput02 > numInput01)) {
				
				
				//Primero Comprobamos los Numeros Iguales
				if(numInput01 == numInput02) {
					System.out.println("Los Números "
							+numInput01+" y "+numInput02+" son iguales");
					
				}else if(numInput01 == numInput03) {
					System.out.println("Los Números "
							+numInput01+" y "+numInput03+" son iguales");
					
				}else if(numInput02 == numInput03) {
					System.out.println("Los Números "
							+numInput02+" y "+numInput03+" son iguales");
					
				}
				
				
				//Ya sabemos que el tercer y segundo numero es mas grande
				//que el primero. Comprobamos el tercer y segundo
				if(numInput03 > numInput02) {
					System.out.println("El Número más grande es "
							+numInput03);
					
					System.out.println("Ordenamiento Menor a Mayor:["+numInput01+" < "
							+numInput02+" < "+numInput03+"]");
						
					
				}else {
					System.out.println("El Número más grande es "
							+numInput02);
					
					System.out.println("Ordenamiento Menor a Mayor:["+numInput01+" < "
							+numInput03+" < "+numInput02+"]");
						
				}
				
				
			}
			
			
			//---------------------------------------------------------------
			
			
			else {
				System.out.println("\n--No se puede comprobar dichos numeros--");
			}
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			System.out.println("\n--Programa Finalizado--");
		}
	}

}
