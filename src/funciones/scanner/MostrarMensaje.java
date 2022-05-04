package funciones.scanner;

import java.util.Scanner;

/*
 * DISEÑAR UNA FUNCION LLAMADA eco() A LA QUE SE LE PASE COMO PARAMETRO UN NUMERO
 * N POR CONSOLA, Y MUESTRE POR PANTALLA N VECES EL MENSAJE "Eco..."
 * 
 * */
public class MostrarMensaje {
	public static void main(String[] args) {
		
		try {
			
			System.out.println("\n==Ingrese un Numero ==");
			Scanner sc=new Scanner(System.in);
			
			int numInput=sc.nextInt();
			
			eco(numInput);
			
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			System.out.println("\n== Programa Finalizado ==");
		}
		
		
	}
	
	//Creamos una funcion estatica para no crear un objeto de la clase que la
	//implemente y de tipo void para que no devuelva nada. Ademas el modificardor
	//de acceso de la funcion es publico, podemos acceder desde fuera de la clase
	
public static void eco(int numInput) {
	
	for(int i=0 ; i < numInput ; i++ ) {
		System.out.println("Eco...");
	}
	
	
}
	
	
}
