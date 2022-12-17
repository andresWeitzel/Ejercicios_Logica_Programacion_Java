package api.collection.arraylist;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

/*
 * CREAR UNA COLECCION DE 20 NUMEROS ENTEROS ALEATORIOS MENORES QUE 100, Y 
 * GUARDARLOS EN EL ORDEN EN QUE SE VAYAN GENERANDO, MOSTRAR POR PANTALLA DICHA
 *  LISTA UNA VEZ CREADA.
 *  ORDENARLA EN SENTIDO CRECIENTE Y VOLVERLA A MOSTRAR POR PANTALLA. 
 *  
 *  ORDENARLA EN SENTIDO DECRECIENTE Y VOLVERLA A MOSTRAR POR PANTALLA. 
 *  
 * 
 * */


public class NumerosAleatoriosOrdenados {
	

	
	public static void main(String[] args) {
		
		
		List<Integer> listaNums = new ArrayList<>();
		
		System.out.println("\n===  Generamos Elementos  ===");
		for(int i=0; i < 20 ; i++) {
		
			listaNums.add((int)(Math.random()*100 + 1) );
		}
		
		System.out.println("\n=== Recorremos la Lista con los Elementos Generados ===");
		listaNums.forEach(System.out::println);
		
		System.out.println("\n=== Ordenamos la Lista (Crecientemente) e imprimimos ===");
		listaNums.stream().sorted(Comparator.naturalOrder()).forEach(System.out::println);;
		
		System.out.println("\n=== Ordenamos la Lista (Decrecientemente) e imprimimos ===");
		listaNums.stream().sorted(Comparator.reverseOrder()).forEach(System.out::println);;
		
		
	}

}
