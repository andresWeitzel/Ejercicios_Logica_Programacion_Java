package arrays.unidimensionales.funciones;


/*
 * https://www.w3resource.com/java-exercises/array/index.php
 * 
 * 
 * Escriba un programa java para imprimir una grilla de guiones cuyas columnas
 * sean 8 y filas 10. 
 * 
 * 
 * */

public class ArrayImprimirDatosDos {
	
	public static void main(String[] args) {
		
		
		
		ArrayImprimirDatosDos.printGrid();
	}
	
	
	static void printGrid() {
		
		String arrayGrilla[][] = new String[10][8];
		
		
		for (int i=0; i < (arrayGrilla.length)-1 ; i++ ) {
	
			for(int j=0; j < (arrayGrilla.length)-2 ; j++) {
				
				if(i < arrayGrilla.length) {
					
					arrayGrilla[i][j] = "-";
					
					System.out.println(arrayGrilla[i][j]);
				}
				
				//REVISAR EJERCICIOS DE ARRAYS
			}
		}
	}

}
