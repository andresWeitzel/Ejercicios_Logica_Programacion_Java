package arrays.unidimensionales.funciones;



/*
 * SE DESEA INGRESAR 4 NUMEROS DE FORMA PARAMETRICA EN UNA FUNCION
 * Y LA MISMA DEBERA DEVOLVER DICHOS NUMEROS DE FORMA INVERSA. LA
 * FUNCION DEBERA ALMACENAR DICHOS NUMEROS EN UN ARRAY.
 * 
 * */

public class ArrayOrdenInversoInput {

	public static void main(String[] args) {
		
		arrayNumsInvertidos(1,2,3,4);
		
	}
	
	public static void arrayNumsInvertidos(double n01, double n02, double n03, double n04) {
		
		double arrayInput[] = new double[4]; 
		
		arrayInput[0]=n01;
		arrayInput[1]=n02;
		arrayInput[2]=n03;
		arrayInput[3]=n04;
		
		System.out.println(arrayInput[3]);
		System.out.println(arrayInput[2]);
		System.out.println(arrayInput[1]);
		System.out.println(arrayInput[0]);
		
	}  

}
