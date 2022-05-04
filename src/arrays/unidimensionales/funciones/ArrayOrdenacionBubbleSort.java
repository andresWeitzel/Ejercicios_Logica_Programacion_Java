package arrays.unidimensionales.funciones;

import java.util.Arrays;
import java.util.List;

/*
 * DISEÑAR UNA APLICACION PARA GESTIONAR UN 
 * CAMPEONATO DE PROGRAMACION, EN DONDE SE 
 * INTRODUCEN LAS PUNTUACIONES ENTERAS OBTENIDAS
 * POR 5 PROGRAMADORES A TRAVES DE LOS PARAMETROS 
 * DE UNA FUNCION. 
 * 
 * SE PODRAN AGREGAR 2 PUNTUACIONES ADICIONALES
 * CASO QUE SE DESEE DE PROGRAMADORES DE RESERVA 
 * EN COMPITICION
 * 
 * LA APLICACION DEBERA MOSTRAR DICHAS PUNTUACIONES 
 * ORDENADAS DE TODOS LOS PROGRAMADORES.
 * 
 * */
public class ArrayOrdenacionBubbleSort {

	public static void main(String[] args) {

		System.out.println(puntuacionesProgramadores(22, 323, 33, 1, 32));
		
		System.out.println(puntuacionesProgramadores(1212,726,992,8272,22,1,2));

	}

	public static String puntuacionesProgramadores(int punt01, int punt02, int punt03, int punt04, int punt05) {

		int arrayPunt[] = { punt01, punt02, punt03, punt04, punt05 };

		int longitudArray = arrayPunt.length;
		int auxiliar = 0;

		boolean arrayLleno = (longitudArray > 0) ? true : false;

		if (arrayLleno) {

			//Aplicamos el Método Bubble Sort
			for (int j = 0; j < (longitudArray - 1); j++) {

				for (int i = 0; i < (longitudArray - 1); i++) {

					if (arrayPunt[i] > arrayPunt[i + 1]) {

						auxiliar = arrayPunt[i];

						arrayPunt[i] = arrayPunt[i + 1];

						arrayPunt[i + 1] = auxiliar;

					}
				}
			}

		}

		return Arrays.toString(arrayPunt);

	}
	
	public static String puntuacionesProgramadores(int punt01
			, int punt02, int punt03, int punt04, int punt05 
			, int punt06 , int punt07) {

		int arrayPunt[] = { punt01, punt02, punt03, punt04, punt05 
				, punt06 , punt07 };

		int longitudArray = arrayPunt.length;
		int auxiliar = 0;

		boolean arrayLleno = (longitudArray > 0) ? true : false;

		if (arrayLleno) {

			//Aplicamos el Método Bubble Sort
			for (int j = 0; j < (longitudArray - 1); j++) {

				for (int i = 0; i < (longitudArray - 1); i++) {

					if (arrayPunt[i] > arrayPunt[i + 1]) {

						auxiliar = arrayPunt[i];

						arrayPunt[i] = arrayPunt[i + 1];

						arrayPunt[i + 1] = auxiliar;

					}
				}
			}

		}

		return Arrays.toString(arrayPunt);

	}

}
