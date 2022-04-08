package condicionales.scanner;

import java.util.Locale;
import java.util.Scanner;


/*
 * IMPLEMENTAR UN PROGRAMA QUE PIDA POR TECLADO UN NUMERO DECIMAL E INDIQUE SI 
 * ES UN NUMERO CASI CERO, QUE SON AQUELLOS, POSITIVOS O NEGATIVOS, QUE SE 
 * ACERCAN A 0 POR MENOS DE 1 UNIDAD. TOMAREMOS TODOS AQUELLOS POSITIVOS O 
 * NEGATIVOS QUE ESTEN DENTRO DEL RANGO DE LA UNIDAD. LOS NUMEROS QUE NO SEAN CASI
 * CEROS SE CONSIDERAN COMO EJ 12.3, EL 0 O EL -1, ETC 
 * 
 * */
public class NumeroCasiCero {
	
public static void main(String[] args) {
		
		

		try {
			
			Scanner sc = new Scanner(System.in);
			sc.useLocale(Locale.US);
			
			System.out.println("\n==INGRESAR UN NÚMERO==");
			double numInput01 =sc.nextDouble();
			
			
			if((numInput01 >= -0.99) && (numInput01 <= 0.99) ) {
				System.out.println("\nEl Número "+numInput01
						+" es un Número que es Casi Cero");
				
			}else if(numInput01 == 0.0){
				System.out.println("\nEl Número "+numInput01
						+" es un Número que no es Casi Cero");
				
			}else {
				System.out.println("\nEl Número "+numInput01
						+" es un Número que no es Casi Cero");
			}
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			System.out.println("\n--Programa Finalizado--");
		}
	}

}
