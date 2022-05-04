package arrays.unidimensionales.funciones;

/*
 * SE DESEA CREAR UNA FUNCION QUE EN SUS PARAMETROS SE LE PASE EL INDICE DEL 
 * ELEMENTO QUE SE DESEA ELIMINAR. A PARTIR DE DICHO INDICE SE COMENZARAN A 
 * ELIMINAR LOS ELEMENTOS DE UN ARRAY.
 *  
 * SE DEBERA TENER UN ARRAY CON 100 VALORES ALEATORIOS EN EL.
 * 
 * LA FUNCION SE SEGUIRA EJECUTANDO Y ELIMINARA LOS ELEMENTOS HASTA QUE EL 
 * INDICE INTRODUCIDO SEA NEGATIVO O HASTA QUE NO EXISTAN 
 * MAS ELEMENTOS QUE ELIMINAR. ES INDISPENSABLE CONTROLAR QUE EL INDICE LEIDO
 * CORRESPONDE A UN DATO VALIDO
 * 
 * SE DEVOLVERA UN ARRAY CON EL CONJUNTO DE NUMEROS ANTES DE LA ELIMINACION Y 
 * LUEGO DE LA MISMA
 * 
 * */
public class ArrayEliminarNumeros {
	public static void main(String[] args) {

		arrayNumerosEliminar(10);

	}

	public static void arrayNumerosEliminar(int indice) {

		// ================ ARRAY INICIAL ======================

		double arrayNumeros[] = new double[100];

		System.out.println("\n == ARRAY INICIAL ==");
		for (int i = 0; i < arrayNumeros.length; i++) {

			// Guardamos y mostramos
			System.out.println(arrayNumeros[i] = i + 1);
		}

		// ================ PROCESAMIENTO ARRAY ======================

	
		System.out.println("\n == PROCESAMIENTO DEL ARRAY ==");

		// variable para probar arrayCompleto
		int j = 0;

		// Guardamos la longitud y los elementos que no seran eliminados
		// Ademas la utilizamos como condicion de parada
		int longitudArray = arrayNumeros.length;

		// Comprobamos indice ingresado y que hayan elementos
		while ((indice >= 0) && (longitudArray != 0)) {

			//Comprobamos que haya elementos
			if (indice < longitudArray) {

				for (int i = indice; i < arrayNumeros.length; i++) {

					// Reemplazamos elemento a elemento desde el indice pasado siempre
					// con el ultimo elemento del array
					arrayNumeros[i] = arrayNumeros[longitudArray - 1];

					longitudArray--;

					// Mostramos el array desde el indice inicial con
					// los reemplazos realizados
					System.out.println(arrayNumeros[j]);
					j++;

				}

			}else {
				//No tenemos elementos
				return;
			}
		}

		// ================ ARRAY PROCESADO ======================

		// Creamos el nuevo array con la longitud final procesada
		double arrayNumerosProcesados[] = new double[longitudArray];

		System.out.println("\n == ARRAY PROCESADO ==");
		for (int i = 0; i < arrayNumerosProcesados.length; i++) {

			// Agregamos los elementos que no fueron reemplazados
			arrayNumerosProcesados[i] = arrayNumeros[i];

			// Imprimimos
			System.out.println(arrayNumerosProcesados[i]);
			
			
			
			//INCOMPLETO
		}

	}

}
