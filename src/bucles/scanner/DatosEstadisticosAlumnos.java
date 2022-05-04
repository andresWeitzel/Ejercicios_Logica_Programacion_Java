package bucles.scanner;

import java.util.Scanner;

/*
 * 
 * UN CENTRO EDUCATIVO NOS HA PEDIDO QUE DISEÑEMOS UNA APLICACION PARA CALCULAR
 * ALGUNOS DATOS ESTADISTICOS DE LAS EDADES DE LOS ALUMNOS. SE INTRODUCIRAN DATOS
 * HASTA QUE ALGUNO DE ELLOS SEA NEGATIVO.LA APLICACION MOSTRARA LA SUMA DE TODAS
 * LAS EDADES(LA MEDIA) DE CUANTOS ALUMNOS HEMOS INTRODUCIDO LAS EDADES Y CUANTOS 
 * ALUMNOS SON MAYORES DE EDAD.
 * 
 * */
public class DatosEstadisticosAlumnos {

	public static void main(String[] args) {

		System.out.println("\n ======= CENTRO EDUCATIVO ========");

		try {

			System.out.println("\n-- Ingresar una Edad --");
			Scanner sc = new Scanner(System.in);

			int edad = sc.nextInt();
			int mediaEdades = 0;
			int contadorEdades=0;
			int contadorMayoresEdad=0;

			while (edad > 0) {
				
				//Codificacion más eficiente
				if(edad >= 18) contadorMayoresEdad ++;

				// media = media + edad;
				mediaEdades += edad;
				
				
				//Aumentamos el contador para el uso de la media
				//ATENTI aumentamos antes de ingresar una edad, porque
				//si la edad es negativa no se suma
				
				//contadorEdades += 1;
				contadorEdades ++;
				
				System.out.println("\n-- Ingresar otra Edad --");
				edad = sc.nextInt();
				
				

			}
			
			//Como ya tenemos la suma de las edades lo dividimos por el total de edades
			//ingresadas
			mediaEdades = mediaEdades / contadorEdades;
			
			System.out.println("\n -- La media de las Edades Ingresadas es "
			+mediaEdades);
			
			System.out.println("\n -- La cantidad de Mayores de Edad según  las Edades Ingresadas son "
					+contadorMayoresEdad);

		} 
		catch (Exception e) {e.printStackTrace();}
		finally {System.out.println("\n -- Programa Finalizado --");}

	}

}
