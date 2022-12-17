package arrays.unidimensionales.funciones;


/*
 * https://www.w3resource.com/java-exercises/array/index.php
 * 
 * 
 * Escriba un programa java para sumar valores de un array de numeros
 * 
 * 
 * */

public class ArraySumarValoresUno {
	
	public static void main(String[] args) {
		
		double valores[] = new double[] {2,2,1,221,1};
		
		ArraySumarValoresUno.sumValues(valores);
		
		
	}
	
	
	static void sumValues(double array[]) {
		
		double sumaTotal=0.0;


		for(int i=0 ; i < array.length ; i++) {
			
				sumaTotal = sumaTotal + array[i];
				
				
				System.out.println(sumaTotal);

		}
		
	}
	
	
	

}
