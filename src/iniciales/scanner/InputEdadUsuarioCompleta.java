package iniciales.scanner;

import java.util.Scanner;

/*
 * ESCRIBIR UNA APLICACION QUE PIDA EL A�O ACTUAL Y EL
 * DE NACIMIENTO AL USUARIO. DEBE CALCULAR SU EDAD, SUPONIENDO
 * QUE EN EL A�O EN CURSO EL USUARIO YA HA CUMPLIDO A�OS.
 * */
public class InputEdadUsuarioCompleta {
	
	public static void main(String[] args) {
		
		
		
		
		try {
			
			Scanner sc = new Scanner(System.in);
			
			System.out.println("\n == INGRESE A�O ACTUAL ==");
			int anioActual = sc.nextInt();
			
			System.out.println("\n == INGRESE A�O DE NACIMIENTO ==");
			int anioNac = sc.nextInt();
			
			int edad=anioActual - anioNac;
			
			System.out.println("\n == Su edad es de "+edad+" a�os ==");
			
		
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
