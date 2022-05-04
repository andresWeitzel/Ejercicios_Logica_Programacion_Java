package funciones.parametros;

/*
 * DISEÑAR UNA FUNCION QUE NOS INDIQUE SI EL NUMERO PASADO COMO PARAMETRO ES
 * PRIMO
 * */
public class NumeroPrimo {
public static void main(String[] args) {
		
		try {
			
			
			comprobarPrimo(12);
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			System.out.println("\n== Programa Finalizado ==");
		}
		
	}
	
/*Recordemos que un Numero Primo es aquel que SOLO se puede dividir sobre si mismo
 * y sobre 1. Debe ser mayor que 1*/
	public static void comprobarPrimo(int num01) {
		
		//Comprobamos que no sea menor a 1
		boolean numMenor = (num01 < 1) ? true : false;
		
		//Probamos todos los numeros comprendidos entre 2 y el num ingresado
		boolean esPrimo = true;
		for(int i=2; i<=num01 ; i++){
		
		esPrimo = (((num01 % i)==0) ? false : true);
		
		if(esPrimo == false) 
			esPrimo = false;
			break;
		}
		
		//Debe cumplir las condiciones que le pasamos
		boolean comprobarPrimo = ((numMenor == false) && (esPrimo == true));
		
	
		System.out.println("\n-- El Numero "+num01+" es Primo? "+comprobarPrimo+" --"); 
		
	}
	

}
