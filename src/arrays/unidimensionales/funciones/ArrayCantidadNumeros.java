package arrays.unidimensionales.funciones;

/*
 * SE DESEA CREAR UNA FUNCION EN LA CUAL EN SU PARAMETRO SE LE PASE 
 * LA CANTIDAD DE NUMEROS QUE DEVOLVERA LA MISMA. MOSTRAR DICHOS
 * NUMEROS EN CONSOLA Y ORDENADOS
 * 
 * 
 * */

public class ArrayCantidadNumeros {
	
	public static void main(String[] args) {
		
		
		arrayNumeros(100);
		
	}
	
	public static void arrayNumeros(int cantidadNum) {
		
		double arrayNumeros[] = new double[cantidadNum];
		
		
		//Guardamos los valores y los mostramos por consola
		for(int i=0 ; i < cantidadNum ; i++)
		{
			//Primera posicion de un array en el Cero, su valor lo 
			//inicamos en Uno
			arrayNumeros[i] = i+1;
			
			//Mostramos desde el uno
			System.out.println(i+1);
			
		}		
	}

}
