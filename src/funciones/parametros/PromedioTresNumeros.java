package funciones.parametros;


/*
 *Escribir un metodos que calcule el promedio de tres numeros 
 * */

public class PromedioTresNumeros {
	
	
	public static void main(String[] args) {
		
		double n1=44;
		double n2=93.8;
		double n3=00289.99;
		
		
		
		System.out.println("\n======= PROMEDIO CON SUMAS =======");
		PromedioTresNumeros objPromNums = new PromedioTresNumeros();
		
		objPromNums.promNums(n1, n2, n3);
		
		System.out.println("\n======= PROMEDIO CON MATH =======");
		
		
		
		
	}
	
	
	
	public void promNums(double n1, double n2, double n3) {
		
		double promNums = (n1+n2+n3) / 3 ;
		
		System.out.println("Num 01: "+n1);
		System.out.println("Num 02: "+n2);
		System.out.println("Num 03: "+n3);
		
		System.out.println("El Promedio entre dichos números es "+promNums);
		
		//Otra forma factible es guardar los valores en un array y de esa forma
		//trabajamos con su longitud 
	}
	
	
	
	//No hay metodo de la clase math para calcular el promedio
}
