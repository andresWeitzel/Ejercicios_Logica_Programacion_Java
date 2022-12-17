package strings;


/*
 * Escriba un programa Java para crear un nuevo String con el contenido 
 * de una matriz de caracteres
 * 
 * */
public class AgregarContenidoCadenaArrayThree {
	
	public static void main(String[] args) {
		
		char matrizCaracts[] = {'d','e','a','o'};
		
		String cadena = String.copyValueOf(matrizCaracts);
		
		System.out.println(cadena);
		
	}

}
