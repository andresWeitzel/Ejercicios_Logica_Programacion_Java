package iniciales.scanner;

import java.util.Locale;
import java.util.Scanner;

/*
 * SE DESEA CALCULAR LA MEDIA ARITMETICA DE TRES NOTAS QUE EL 
 * USUARIO INGRESE, DICHAS NOTAS PUEDEN SER DE TIPO DECIMAL 
 * O ENTERAS. SE DEBERA MOSTRAR POR CONSOLA LA PARTE ENTERA DE
 * LA MEDIA 
 * */
public class MediaAritmeticaParteEntera {

	public static void main(String[] args) {
		

		try {
			
			Scanner sc = new Scanner(System.in);
			//Cambiamos el estandar para uso de puntos y no de comas en decimales
			sc.useLocale(Locale.US);
			
			System.out.println("\n--Ingresar Primera Nota--");
			
			double primeraNota = sc.nextDouble();
			
			System.out.println("\n--Ingresar Segunda Nota--");
			
			double segundaNota = sc.nextDouble();
			

			System.out.println("\n--Ingresar Tercera Nota--");
			
			double terceraNota = sc.nextDouble();
			
			
			//Y SI SE TIENE 50 NOTAS?? GUARDAR UNA NOTA EN CADA VARIABLE
			//ES POCO EFICIENTE, PARA ESO EXISTEN LAS ESTRUCTURAS DE DATOS
			//EJERCICIOS QUE VAMOS A VER MAS ADELANTE
			
			//SIN ESTRUCTURAS DE DATOS NO PODEMOS SEPARAR LA PARTE ENTERA DE UN 
			//VALOR DECIMAL DE FORMA SENCILLA, ENTONCES UNA SOLUCION VIABLE ES
			//TENIENDO DATOS ENTEROS/DECIMALES LA VARIABLE FINAL LA CONVERTIMOS
			//A ENTERA Y LISTO
			
			 
			//CASTEAMOS(CONVERTIMOS) VALORES DECIMALES A ENTEROS
			int mediaAritmetica = (int)(primeraNota + segundaNota + terceraNota) / 3;
			
			//TAMBIEN PODEMOS PARSEAR(CONVERTIR) DECIMALES CON FORMATO STRING A ENTEROS
			//OJO QUE EL PARSEO SE TRABAJA GENERALMENTE CON STRINGS
			//SE USA PARA COMPARACIONES DE DATOS CONVIRTIENDO EL STRING
			//EN OTRO DATO(ENTERO, DECIMAL, ETC), SI NO SE TIENE EL FORMATO
			//NUMERICO ADECUADO SURJE UN ERROR
		
			
			System.out.println("\n--La Media Aritmetica ENTERA entre "
			+primeraNota+","+segundaNota+" y "+terceraNota+" es "+mediaAritmetica+" ==");
	
			
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
