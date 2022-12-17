package api.collection.arraylist;

import java.util.ArrayList;
import java.util.List;

/*
 * CREAR UNA COLECCION DE 20 NUMEROS ENTEROS ALEATORIOS DISTINTOS MENORES QUE 100,
 * GUARDARLOS POR ORDEN DECRECIENTE A MEDIDA QUE SE VAYAN GENERANDO Y MOSTRAR LA 
 * COLECCION POR PANTALLA 
 * */

public class NumerosAleatoriosOrdenados02 {
	
	public static void main(String[] args) {
		
		
		List<Integer> listaNums = new ArrayList<Integer>();
		
		int sizeListaNums;
		
		int elemAnterior;
		int elemSiguiente;
		int elemActual;

		int aux=0;
		
		

		for(int i=0 ; i < 30 ; i++ ) {
			
			int numAleat = (int)(Math.random()*99 + 0);
			
			sizeListaNums=listaNums.size();
			
			elemAnterior=listaNums.get(i-1);
			elemSiguiente=listaNums.get(i+1);
			elemActual=listaNums.get(i);
			
			
			
			if((!(listaNums.contains(numAleat))) && (sizeListaNums <= 19)) {
				
				if(sizeListaNums <= 0) {
					listaNums.add(numAleat);
				}
				else if(elemActual < numAleat) {
					
					aux = elemActual;
					
					listaNums.add(i,numAleat);
					
					listaNums.add(i + 1, aux);
					
				}else {
					listaNums.add(numAleat);
				}
				
				System.out.println(sizeListaNums);
				
			}
			
		}
		
		
		listaNums.forEach(System.out::println);
		
		
		
		
		
	}

}
