package condicionales.scanner;

import java.util.Locale;
import java.util.Scanner;

/*
 * PEDIR UN NUMERO ENTRE 0 Y 999 Y DECIR SI ES
 * CAPICUA/PALINDROMICO
 * 
 * */
public class NumeroPalindromico {
	
	public static void main(String[] args) {
		
		//Un Numero Palindromico es aquel que se puede leer
		//desde dercha a izquierda igual que viceversa
		//Ej-->777, 2020/02/02 , etc
		
		//VAMOS A USAR EL MODULO PARA SABER EL NRO DE UNIDADES, DECENAS, ETC QUE
		//TIENE EL NUMERO DE ENTRADA (RESTO). EJ-->EL MODULO 10 DE 777 NOS 
		//DEVUELVE LA CANTIDAD DE UNIDADES QUE ES 7.  
		
		// SI DIVIDIMOS CUALQUIER NUMERO SOBRE 10 QUITAMOS UNIDADES..
		//EJ--> 789/10 = 78.9 ....  78.9/10 = 7.89 ....etc
		//DE ESTA FORMA APLICANDO EL MODULO POR CADA UNIDAD SACADA OBTENEMOS EL 
		//NRO DE CADA UNIDAD, CENTENA, DECENA, ETC
		
		
		for(int i=0 ; i < 3 ;) {
			System.out.println(i);
			 i++;
		}
		
		try {
			
			Scanner sc = new Scanner(System.in);
			sc.useLocale(Locale.US);
			
			System.out.println("\n==INGRESAR NÚMERO==");
		
			int numInput =(int)(sc.nextDouble());
			
			//Vamos a cambiar el valor del numero entonces mantenemos el original
			int numInputProcesar = numInput;
			
			//----------------UNIDADES ---------------------
			
			//Obtenemos el nro de unidades
			//Ej-> 789 % 10 = 3 
			int unidades = numInputProcesar % 10;        
			
			//Una vez que tenemos el nro de unidades sacamos una unidad
			//para quedarnos con las decenas del numero
			//Ej-> 789/10 = 78.9 --> 79
			numInputProcesar = numInputProcesar / 10;
		
			//---------------- DECENAS ---------------------
			
			//Obtenemos la cantidad de decenas
			//Ej-> 79 % 10 = 9 --> Numero redondeado, nos da 9, correspondiente
			//a 9 decenas del nro original(789 el 8 se redondeo a 9)
			int decenas = numInputProcesar % 10;
			
			//Quitamos una unidad y nos quedamos con las centenas
			//Ej-> 79/10 = 7.9
			numInputProcesar = numInputProcesar / 10;
			
			
			
			//---------------- CENTENAS ---------------------
			
			//Obtenemos la cantidad de decenas
			//Ej-> 8 % 10 = 8 
			//Redondeado del nro original(789 el 7 se redondeo a 8)
			int centenas = numInputProcesar % 10;
			
			//SI TENEMOS UN NUMERO MAS GRANDE SEGUIMOS CON MILLARES,ETC
			
			
			//---------------- OPERACIONES ---------------------
			
			//La logica de este ejercicio es comparar las unidades separadas
			//y la cantidad de cifras
			
			//3 CIFRAS..si tenemos 3 cifras la decena no nos interesa comparar,
			//numero del medio..ej--> 797 343 222
			if((centenas != 0) && (unidades == centenas) ) {
				System.out.println("\n El Número " +numInput+" es Palindromico");
				
			//2 CIFRAS ..Si tenemos 2 cifras la centena no nos interesa comparar	
			}else if((centenas == 0) && (decenas != 0) && (unidades == decenas)) {
				System.out.println("\n El Número " +numInput+" es Palindromico");
			
			//Numero de 1 cifra no es palindromico
			}else {
				System.out.println("\n El Número " +numInput+" no es Palindromico");
			}
			
			
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			System.out.println("\n--Programa Finalizado--");
		}
	}
		
	}
