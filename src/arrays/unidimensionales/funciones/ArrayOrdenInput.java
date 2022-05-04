package arrays.unidimensionales.funciones;

/*
 * SE DESEA CREAR UNA FUNCION QUE NOS DEVUELVA 3 NUMEROS INGRESADOS 
 * POR PARAMETRO ORDENADOS SEGUN EL ORDEN QUE SE HAN INTRODUCIDOS.
 * ALMACENAR LOS NUMEROS DECIMALES EN UN ARRAY
 * LA FUNCION DEBERA MOSTRARNOS UNA TABLA CON EL INDICE Y VALOR
 * 
 * */
public class ArrayOrdenInput {
	
	public static void main(String[] args) {
		
		double n01,n02,n03;
		n01=10;
		n02=20;
		n03=30;
		
		arrayNumeros(n01,n02,n03);
		
	}
	
	public static void arrayNumeros (double n01, double n02, double n03) {
		
		double arrayNumeros[] = new double[3];
		
		arrayNumeros[0]=n01;
		arrayNumeros[1]=n02;
		arrayNumeros[2]=n03;
		
		System.out.println("\n==== TABLA NÚMEROS =====");
		System.out.println("--INDICE | VALOR--");
		System.out.println("   0     |"+arrayNumeros[0]);
		System.out.println("   1     |"+arrayNumeros[1]);
		System.out.println("   2     |"+arrayNumeros[2]);
		
		
		
	}

}
