package iniciales.scanner;

import java.util.Scanner;

/*
 * DISE�AR UN PROGRAMA QUE PIDA  AL USUARIO SU EDAD Y MOSTRAR LA 
 * QUE TENDRA EL PROXIMO A�O Y LA QUE TUVO HACE 5 A�OS
 * 
 * */
public class InputEdadUsuarioCompleted {
	
	
public static void main(String[] args) {
	
	try {
		
		System.out.println("\n== INGRESE SU EDAD ==");
		
		
		Scanner scanner = new Scanner(System.in);
		
		
		int edad= scanner.nextInt();
		
		 int edadProxima = edad + 1;
		 
		 int edadAnterior = edad - 5;
		 
		 
		 System.out.println("\n == SU EDAD ES : "+edad);
		 
		 System.out.println("\n == SU EDAD EL PROXIMO A�O ES : "+edadProxima);
		 
		 System.out.println("\n == SU EDAD HACE 5 A�OS FUE : "+edadAnterior);
		 

		
	} catch (Exception e) {
		e.printStackTrace();
	
	}finally {
		
		System.out.println("\n == PROGRAMA FINALIZADO ==");
		
	}
}	

	

}
