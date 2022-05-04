package funciones.parametros;

/*
 * ESCRIBIR UNA FUNCION QUE DECIDA SI DOS NUMEROS ENTEROS POSITIVOS SON AMIGOS.
 * DOS NUMEROS SON AMIGOS SI LA SUMA DE SUS DIVISORES PROPIOS(DISTINTOS DE ELLOS MISMOS)
 * SON IGUALES
 * 
 * INFO AGREGADA: A VECES LOS ENUNCIADOS NO SON DEL TODO CLARO, RECORDEMOS QUE 
 * DOS NUMEROS SON AMIGOS SI LA SUMA DE LOS DIVISORES DE UNO(SIN SUMAR EL DIVISOR POR
 * SI MISMO) ES IGUAL AL OTRO NUMERO Y VICEVERSA. SI CADA UNO COINCIDE CON LA SUMA DE
 * LOS  DIVISORES  DEL OTRO ENTONCES SON AMIGOS. NO ES VALIDO COMPARAR NUMEROS IGUALES
 * 
 * */

public class NumerosAmigos {

	public static void main(String[] args) {
		
		numerosAmigos(2210,220);

	}

	public static void numerosAmigos(int numInput01, int numInput02) {

		// Sumamos sus divisores internos menos el propio numero
		int sumaDivisoresNumInput01 = 0;
		int sumaDivisoresNumInput02 = 0;

		for (int i = 1; i < numInput01; i++) {

			//Si tiene resto Cero es divisible, acumulamos
			if (numInput01 % i == 0) {

				sumaDivisoresNumInput01 += i;
			}
		}

		for (int i = 1; i < numInput02; i++) {

			if (numInput02 % i == 0) {

				sumaDivisoresNumInput02 += i;
			}
		}
		
		
		if(numInput01 == numInput02) {
			System.out.println( "El Número "+numInput01+" y el Número "+numInput02+" SON Números Iguales!!");	
			
		}else if((numInput01 == sumaDivisoresNumInput02) && (numInput02 == sumaDivisoresNumInput01)) {
			System.out.println( "El Número "+numInput01+" y el Número "+numInput02+" SON Números Amigos!!");
			
		}else {
			System.out.println("El Número "+numInput01+" y el Número "+numInput02+" NO son Números Amigos!!");
			
		}

	}

}
