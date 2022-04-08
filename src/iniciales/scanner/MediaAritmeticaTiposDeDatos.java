package iniciales.scanner;

import java.util.Locale;
import java.util.Scanner;

/*
 * SE DESEA CALCULAR LA MEDIA ARITMETICA DE DOS NOTAS QUE EL 
 * USUARIO INGRESE, DICHAS NOTAS PUEDEN SER DE TIPO DECIMAL 
 * O ENTERAS 
 * */
public class MediaAritmeticaTiposDeDatos {
	
	public static void main(String[] args) {
		
		try {
			
			Scanner sc= new Scanner(System.in);
			//Cambiamos el estandar para uso de puntos y no de comas en decimales
			sc.useLocale(Locale.US);
			
			
			/*
			 * Trabajando los datos en formato String nos ahorramos
			 * comprobar el tipo de dato implementado pero debemos
			 * tener cuidado ya que si consideramos un numero puede
			 * ser que en la entrada no lo sea, hay que comprobar eso
			 * LA FORMA MAS FACIL ES USAR STRING Y SE CONVIERTE TODO 
			 * A DECIMAL, EN NUESTRO CASO VAMOS A TRABAJAR CON VARIOS 
			 * TIPOS DE DATOS PARA IMPLEMENTAR LOGICA
			 * */
			
			//--------------------------------------------------------
			System.out.println("\n== Ingrese la Primera Nota ==");
			
			String primeraNota = sc.next();
		
			//System.out.println(primeraNota);
			
			
			int comprobacionPrimeraNota = 0;
			int primeraNotaEntero = 0;
			double primeraNotaDecimal = 0;
			
			//Realizamos algunas comprobaciones
			if(primeraNota.contains(".")) {
				
				primeraNotaDecimal = Double.valueOf(primeraNota);
				
				//Cero tipo Double
				comprobacionPrimeraNota = 0;
				
				
			}else if(primeraNota.isEmpty()){
				
				System.out.println("No se puede no ingresar una Nota!!");
				
				return;
			
			}else {
				
				
				primeraNotaEntero = Integer.valueOf(primeraNota);

				//Uno tipo Entero
				comprobacionPrimeraNota = 1;
				
			}
			
			//--------------------------------------------------------
			System.out.println("\n== Ingrese la Segunda Nota ==");
			
			String segundaNota = sc.next();
			
			//System.out.println(segundaNota);
			

			int comprobacionSegundaNota = 0;
			int segundaNotaEntero = 0;
			double segundaNotaDecimal = 0;
			
			
			
			//Realizamos algunas comprobaciones
			if(segundaNota.contains(".")) {
				
				segundaNotaDecimal = Double.valueOf(segundaNota);
				
				//Cero tipo Double
				comprobacionSegundaNota = 0;
				
				
			}else if(segundaNota.isEmpty()){
				
				System.out.println("No se puede no ingresar una Nota!!");
				
				return;
			
			}else {
				
				
				segundaNotaEntero = Integer.valueOf(segundaNota);

				//Uno tipo Entero
				comprobacionSegundaNota = 1;
				
			}
			
			
			//--------------------------------------------------------
			
			
	
			
			//Caemos que ambos sean decimales
			if(comprobacionPrimeraNota == 0
			&& comprobacionSegundaNota == 0) 
			{
			
				double mediaAritDecimal = 
						((primeraNotaDecimal + segundaNotaDecimal)/2);
				
			
				System.out.println("\n == El Promedio entre "
						+primeraNotaDecimal 
						+ " y "
						+segundaNotaDecimal
						+" es "
						+mediaAritDecimal);
						
			//Caemos que ambos sean enteros	
			}else if(comprobacionPrimeraNota == 1
					&& comprobacionSegundaNota == 1) 
			{
					
						int mediaAritEntero = 
								((primeraNotaEntero + segundaNotaEntero)/2);
						
					
						System.out.println("\n == El Promedio entre "
								+primeraNotaEntero 
								+ " y "
								+segundaNotaEntero
								+" es "
								+mediaAritEntero);
						
						
			//Caemos en un caso mixto, hay un entero y decimal o viceversa
			//Trabajamos como String
			//caso contrario excepcion			
			}else {
				
				if(primeraNotaEntero != 0 && segundaNotaDecimal != 0.0) {
					
					double mediaAritDecimal = 
							((Double.valueOf(primeraNotaEntero) + segundaNotaDecimal)/2);
					
					System.out.println("\n == El Promedio entre "
							+primeraNotaEntero 
							+ " y "
							+segundaNotaDecimal
							+" es "
							+mediaAritDecimal);
					
				}else if(segundaNotaEntero != 0 && primeraNotaDecimal != 0.0) {
					
					double mediaAritDecimal = 
							((Double.valueOf(segundaNotaEntero) + primeraNotaDecimal)/2);
					
					System.out.println("\n == El Promedio entre "
							+segundaNotaEntero 
							+ " y "
							+primeraNotaDecimal
							+" es "
							+mediaAritDecimal);
					
				}else {
					System.out.println("Se deben ingresar Números!");
				}
				
			}
			
			
	
		} catch (Exception e) {
			e.printStackTrace();
		}
		finally {
			//POR LO GENERAL EL FINALLY LO TRABAJAMOS CON ARCHIVOS
			//O USO DE RECURSOS DEL SISTEMA PARA QUE NO QUEDEN ABIERTOS 

			
			System.out.println("\n----Programa Finalizado------");
		}
		
		
		
		
	}

}
