package strings;

/*
 * Escriba un programa Java para comparar dos cadenas lexicográficamente, 
 * ignorando las diferencias de mayúsculas y minúsculas.
 * 
 * */

public class CompararCadenasLexicograficasIgnoreCaseFive {
	
	public static void main(String[] args) {
		
		String cadena01 = "cadena lexicografica. Comparacion de Cadenas";
		String cadena02 = "cadena lexicografica. ComparacION DE CADENAS";
		String cadena03 = "Cadena LExicografica. Comp. de Cad.";

		
		// =====================================================================================

		System.out.println("\n========= Comparacion con metodo equalsIgnoreCase =============");

		boolean compCadenas = (cadena01.equalsIgnoreCase(cadena02)) ? true : false;

		if (compCadenas) {
			System.out.println("Cadenas Lexicograficamente Iguales");
		} else {
			System.out.println("Cadenas Lexicograficamente NO Iguales");
		}

		// =====================================================================================
		
		
		System.out.println("\n========= Comparacion caracter por caracter (eficiente)===============");

		boolean sizeCadenasCheck02 = (cadena01.length() == cadena02.length()) ? true : false;

		boolean charCadenasCheck02 = true;

		int iterador = 0;

		while ((sizeCadenasCheck02) && (charCadenasCheck02) && (iterador < cadena01.length())) {

			//Podemos trabajar cada cadena en minuscula y comprobar la igualdad de sus caracteres
			charCadenasCheck02 = (cadena01.toLowerCase().charAt(iterador) == cadena02.toLowerCase().charAt(iterador)) ? true : false;

			if (!(charCadenasCheck02)) {
				System.out.println("Cadenas Lexicograficamente NO Iguales");
				return;
			}
			
			iterador++;

		}
		System.out.println("Cadenas Lexicograficamente Iguales");

	}
	// =====================================================================================
		
	}
