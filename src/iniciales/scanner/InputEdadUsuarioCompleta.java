package iniciales.scanner;

import java.util.Scanner;

/*
 * ESCRIBIR UNA APLICACION QUE PIDA EL AÑO ACTUAL Y EL
 * DE NACIMIENTO AL USUARIO. DEBE CALCULAR SU EDAD, SUPONIENDO
 * QUE EN EL AÑO EN CURSO EL USUARIO YA HA CUMPLIDO AÑOS.
 * */
public class InputEdadUsuarioCompleta {
	
	public static void main(String[] args) {
		
		
		
		
		try {
			
			Scanner sc = new Scanner(System.in);
			
			System.out.println("\n == INGRESE AÑO ACTUAL ==");
			int anioActual = sc.nextInt();
			
			System.out.println("\n == INGRESE AÑO DE NACIMIENTO ==");
			int anioNac = sc.nextInt();
			
			int edad=anioActual - anioNac;
			
			System.out.println("\n == Su edad es de "+edad+" años ==");
			
		
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
