package bucles.scanner;

import java.util.Scanner;

/*
 * DISEÑAR UN PROGRAMA QUE MUESTRE, PARA CADA NUMERO INTRODUCIDO POR TECLADO, SI
 * ES PAR, SI ES POSITIVO Y SU CUADRADO. EL PROCESO SE REPETIRA HASTA QUE EL NUMERO
 * INTRODUCIDO POR TECLADO SEA 0. APLICAR CODIGO EFICIENTE Y USAR TERNARIOS
 * 
 * */

public class NumeroParPositivoCuadradoEficiente {
	
	public static void main(String[] args) {
		
		try {
			Scanner sc=new Scanner(System.in);
			
			
			System.out.println("\n Ingresar un Número!");
			
			double numInput=sc.nextDouble();
			
			
			
			while(numInput != 0) {
					
				boolean numParImpar = numInput % 2 == 0 ? true : false;
				boolean numPosNeg = numInput > 0 ? true : false;
					
				System.out.println("\n El Número "+numInput+" es PAR? "+numParImpar);
				
				System.out.println("\n El Número "+numInput+" es POSITIVO? "+numPosNeg);
			
				System.out.println("\n El Cuadrado del Número "+numInput+" es "
				+ numInput*numInput);
				
				//Repetimos el Proceso
				System.out.println("\n--------------------------------");
				System.out.println("\n Ingresar Otro Número !");
				numInput=sc.nextDouble();
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			
			System.out.println("\n Programa Finalizado!");
		}
		
		
	}

}
