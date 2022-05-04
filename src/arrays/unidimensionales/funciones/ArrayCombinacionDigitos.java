package arrays.unidimensionales.funciones;

import java.util.Arrays;

/*
 * DESARROLLAR EL JUEGO DE LA CAMARA SECRETA, QUE CONSISTE 
 * EN ABRIR UNA CAMARA MEDIANTE SU COMBINACION SECRETA, QUE ESTA
 * FORMADO POR UNA COMBINACION DE DIGITOS DEL 1 AL 5 Y CON VALORES ENTRE 
 * 0 Y 9 PARA CADA DIGITO(EJ COMBINACION: 1 5 8 3 6). EL JUGADOR
 * ESPECIFICARA LA COMBINACION DE LOS 5 DIGITOS. LA APLICACION GENERA DE FORMA
 * ALEATORIA, UNA COMBINACION SECRETA QUE EL USUARIO TENDRA QUE ACERTAR.
 *  
 *  EN CADA INTENTO SE MUESTRA COMO PISTA, PARA CADA DIGITO DE LA COMBINACION
 *  INTRODUCIDA POR EL JUGADOR, SI ES MAYOR, MENOR O IGUAL QUE EL CORRESPONDIENTE 
 *  EN LA COMBINACION SECRETA
 * 
 * */
public class ArrayCombinacionDigitos {
	
	public static void main(String[] args) {
	
		int dig01Usuario = 1;
		int dig02Usuario = 2;
		int dig03Usuario = 7;
		int dig04Usuario = 3;
		int dig05Usuario = 9;
		
		generaror(dig01Usuario, dig02Usuario, dig03Usuario, dig04Usuario, dig05Usuario);
		
	} 
	
	public static void generaror(int dig01 , int dig02 , int dig03 , int dig04, int dig05) {
		
		//Guardamos los valores del usuario
		
		int arrayDigitos[] = { dig01 , dig02 , dig03 , dig04 ,dig05};
		
		
		
		boolean digValidados = (dig01 >= 0 && dig01 <= 9) 
							&& (dig02 >= 0 && dig02 <= 9)
							&& (dig03 >= 0 && dig03 <= 9)
							&& (dig04 >= 0 && dig04 <= 9)
							&& (dig05 >= 0 && dig05 <= 9) ? true : false;
		
		if(digValidados) {
			
			int arrayCombinacion[] = new int[5];
			
			for(int i=0 ; i < 5 ; i++) {
			
				arrayCombinacion[i]= (int)(Math.random()*9 + 0);
				
				
				
			}
			System.out.println("\n ==================================");
			System.out.println(" == JUEGO DE LA CAMARA SECRETA ==");
			System.out.println("==Combinación Secreta : "+Arrays.toString(arrayCombinacion)+"==");
			System.out.println("==================================\n");
			
			System.out.println("\n =========== NÚMEROS INGRESADOS ==============");
			
			System.out.println(Arrays.toString(arrayDigitos));
			
			System.out.println("\n =========== COMPROBACIÓN COMBINACIÓN SECRETA ==============");
			
		
			boolean dig01Comprobado = (dig01 == arrayCombinacion[0]) ? true : false;
			
			boolean dig02Comprobado = (dig02 == arrayCombinacion[1]) ? true : false;
			
			boolean dig03Comprobado = (dig03 == arrayCombinacion[2]) ? true : false;
			
			boolean dig04Comprobado = (dig04 == arrayCombinacion[3]) ? true : false;
			
			boolean dig05Comprobado = (dig05 == arrayCombinacion[4]) ? true : false;
			
			System.out.println("\n * Primer Digito Correcto? -- "+dig01Comprobado);
			System.out.println("\n * Segundo Digito Correcto? -- "+dig02Comprobado);
			System.out.println("\n * Tercer Digito Correcto? -- "+dig03Comprobado);
			System.out.println("\n * Cuarto Digito Correcto? -- "+dig04Comprobado);
			System.out.println("\n * Quinto Digito Correcto? -- "+dig05Comprobado);
			
			boolean arrayDigComprobados[] = {dig01Comprobado,dig02Comprobado
					,dig03Comprobado,dig04Comprobado,dig05Comprobado};
			
			int cantidadAcertada = 0;
			
			for(int i=0 ; i < 5 ; i++) {
			
				if(arrayDigComprobados[i]) {
					cantidadAcertada ++;
				}
			}
			
			
			
			System.out.println("\n-- Cantidad de Digitos Correctos : "+cantidadAcertada+"/5");
			
			System.out.println("\n-- Combinación Correcta? -- "+Arrays.equals(arrayDigitos, arrayCombinacion));
			
			
			
			
		}
		
	}
	
	
	
	

}
