package bucles.scanner;

import java.util.Scanner;

/*
 * DISE�AR UN PROGRAMA QUE MUESTRE, PARA CADA NUMERO INTRODUCIDO POR TECLADO, SI
 * ES PAR, SI ES POSITIVO Y SU CUADRADO. EL PROCESO SE REPETIRA HASTA QUE EL NUMERO
 * INTRODUCIDO POR TECLADO SEA 0
 * 
 * */
public class NumeroParPositivoCuadrado {
	
	public static void main(String[] args) {
		
		
		try {
			Scanner sc=new Scanner(System.in);
			
			
			System.out.println("\n Ingresar un N�mero!");
			double numInput=sc.nextDouble();
	
			
			
			while(numInput != 0) {
				
				if((numInput % 2) == 0 ) {
					
					System.out.println("\n El N�mero "+numInput+" es PAR!");
					
				}else {
					System.out.println("\n El N�mero "+numInput+" NO es PAR!");
				}
				
				if(numInput > 0) {
					System.out.println("\n El N�mero "+numInput+" es POSITIVO!");
				}else {
					System.out.println("\n El N�mero "+numInput+" NO es POSITIVO!");
				}
				
				//Ojo que no es valido multiplicarlo por 2, el cuadrado es siempre
				//la multiplicacion sobre su mismo numero
				System.out.println("\n El Cuadrado del N�mero "
				+numInput+" es "+ numInput*numInput);
				
				//Repetimos el Proceso
				System.out.println("\n--------------------------------");
				System.out.println("\n Ingresar Otro N�mero !");
				numInput=sc.nextDouble();
				
			}
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			System.out.println("\n Programa Finalizado!");
		}
		
		
	}

}
