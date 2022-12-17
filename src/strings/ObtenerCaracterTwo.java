package strings;

/*
 * https://www.w3resource.com/java-exercises/string/index.php
 * 
 * ESCRIBIR UN PROGRAMA PARA OBTENER EL CARACTER EN EL INDICE DADO DENTRO DE 
 * LA CADENA
 * 
 * EJ: 
 * Original String = Java Exercises!                                                                             
The character at position 0 is J                                                                              
The character at position 10 is i
 * 
 * */


public class ObtenerCaracterTwo {
	public static void main(String[] args) {
	
	String cadena = "Ejercicios de Java";
	int sizeCadena = cadena.length();
	
	for(int i=0; i < sizeCadena ; i++) {
		System.out.println("Indice "+i+" --> Caracter "+cadena.charAt(i));
	}
	

	}

}
