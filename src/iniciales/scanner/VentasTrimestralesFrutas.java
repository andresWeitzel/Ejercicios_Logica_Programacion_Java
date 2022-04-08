package iniciales.scanner;

import java.util.Locale;
import java.util.Scanner;

/*
 * UN FRUTERO NECESITA CALCULAR LOS BENEFICIOS 
 * ANUALES QUE OBTIENE DE LAS VENTAS DE MANZANAS
 * Y PERAS. POR ESTE MOTIVO, ES NECESARIO DISEÑAR 
 * UNA APLICACION QUE SOLICITE LAS VENTAS(EN KILOS)
 * DE CADA TRIMESTRE PARA CADA FRUTA. LA APLICACION 
 * MOSTRARA EL IMPORTE  TOTAL SABIENDO QUE EL PRECIO
 * DEL KILO DE MANZANAS ESTA FIJADO EN 2.35 EUROS Y 
 * EL KILO DE PERAS ESTA FIJADO EN 1.95 EUROS 
 * 
 * */
public class VentasTrimestralesFrutas {

	public static void main(String[] args) {
		
		//Recomiendo siempre que separemos los datos que nos dan
		
		//Manzanas x Kg --> 2.35 euros
		//Peras x Kg --> 1.95 euros
		
		//Ventas por trimestre por kilos (3 meses)
		//Importe Total: Suma de ventas por trimestre(4 trimestres)
		
		//Objetivo: Calculo del importe total segun ventas de frutas anual
		
		

		try {

			
			Scanner sc=new Scanner(System.in);
			sc.useLocale(Locale.US);

			
			System.out.println("\n==== MANZANAS ====");
			
			double impKgManzanas = 2.35;
			
			System.out.println("\n -- Total de Kilos de Manzanas Vendidas 1er Trimestre-- ");

			double kgManzPrimerTrim = sc.nextDouble();

			System.out.println("\n -- Total de Kilos de Manzanas Vendidas 2do Trimestre-- ");

			double kgManzSegundoTrim = sc.nextDouble();

			System.out.println("\n -- Total de Kilos de Manzanas Vendidas 3er Trimestre-- ");

			double kgManzTercerTrim = sc.nextDouble();
			
			System.out.println("\n -- Total de Kilos de Manzanas Vendidas 4to Trimestre-- ");

			double kgManzCuartoTrim = sc.nextDouble();
			
			
			//Calculamos el importe de cada trimestre
			
			//Primer Trimestre
			double impManzPrimerTrim = kgManzPrimerTrim * impKgManzanas;
			
			//Segundo Trimestre
			double impManzSegundoTrim = kgManzSegundoTrim * impKgManzanas;
			
			//Tercer Trimestre
			double impManzTercerTrim = kgManzTercerTrim * impKgManzanas;
			
			//Cuarto Trimestre
			double impManzCuartoTrim = kgManzCuartoTrim * impKgManzanas;
			
			
			//Importe Total de Manzanas
			
			double impTotalManz = impManzPrimerTrim + impManzSegundoTrim 
					+ impManzTercerTrim + impManzCuartoTrim;
			
			
			//=================================================================
			
			System.out.println("\n==== PERAS ====");
			
			
			double impKgPeras = 1.95;
			
			System.out.println("\n -- Total de Kilos de Peras Vendidas 1er Trimestre-- ");

			double kgPerasPrimerTrim = sc.nextDouble();

			System.out.println("\n -- Total de Kilos de Peras Vendidas 2do Trimestre-- ");

			double kgPerasSegundoTrim = sc.nextDouble();

			System.out.println("\n -- Total de Kilos de Peras Vendidas 3er Trimestre-- ");

			double kgPerasTercerTrim = sc.nextDouble();
			
			System.out.println("\n -- Total de Kilos de Peras Vendidas 4to Trimestre-- ");

			double kgPerasCuartoTrim = sc.nextDouble();
			
			
			//Calculamos el importe de cada trimestre
			
			//Primer Trimestre
			double impPerasPrimerTrim = kgPerasPrimerTrim * impKgPeras;
			
			//Segundo Trimestre
			double impPerasSegundoTrim = kgPerasSegundoTrim * impKgPeras;
			
			//Tercer Trimestre
			double impPerasTercerTrim = kgPerasTercerTrim * impKgPeras;
			
			//Cuarto Trimestre
			double impPerasCuartoTrim = kgPerasCuartoTrim * impKgPeras;
			
			
			//Importe Total de Peras
			
			double impTotalPeras = impPerasPrimerTrim + impPerasSegundoTrim 
					+ impPerasTercerTrim + impPerasCuartoTrim;
			
			
			//=================================================================
			
			//IMPORTE TOTAL ANUAL DE FRUTAS
			
			double impTotalAnualVentas = impTotalManz + impTotalPeras;
			
			
			//Vamos a mostrar una tablita con los datos de ventas
			System.out.println("\n=== TABLA DE VENTAS ====\n");
			
			System.out.println("\n== Primer Trimestre ==");
			System.out.println("--Importe Vendido Manzanas : "+impManzPrimerTrim +" --");
			System.out.println("--Importe Vendido Peras : "+impPerasPrimerTrim +" --");
			
			
			System.out.println("\n== Segundo Trimestre ==");
			System.out.println("--Importe Vendido Manzanas : "+impManzSegundoTrim +" --");
			System.out.println("--Importe Vendido Peras : "+impPerasSegundoTrim +" --");
			
			System.out.println("\n== Tercer Trimestre ==");
			System.out.println("--Importe Vendido Manzanas : "+impManzTercerTrim +" --");
			System.out.println("--Importe Vendido Peras : "+impPerasTercerTrim +" --");
			
			System.out.println("\n== Cuarto Trimestre ==");
			System.out.println("--Importe Vendido Manzanas : "+impManzCuartoTrim +" --");
			System.out.println("--Importe Vendido Peras : "+impPerasCuartoTrim +" --");
			
			System.out.println("\n== IMPORTE ANUAL POR FRUTA ==");
			System.out.println("--Importe Anual Vendido Manzanas : "+impTotalManz +" --");
			System.out.println("--Importe Anual Vendido Peras : "+impTotalPeras +" --");
			
			System.out.println("\n== IMPORTE ANUAL TOTAL ==");
			System.out.println("--Importe Anual Total Vendido : "+impTotalAnualVentas +" --");
			


			
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		finally {
			System.out.println("\n == Programa Finalizado ==");
		}
	}

}
