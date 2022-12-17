package strings;

/*
 * 
 *https://www.w3resource.com/java-exercises/string/index.php
 * 
 * Escribe un programa Java para comparar dos cadenas lexicográficamente. Dos cadenas 
 * son lexicográficamente iguales si tienen la misma longitud y contienen los mismos 
 * caracteres en las mismas posiciones.
 * 
 * */

public class CompararCadenasLexicograficasFour {
	public static void main(String[] args) {

		String cadena01 = "cadena lexicografica";
		String cadena02 = "cadena lexicografica";
		String cadena03 = "Cadena LExicografica";

		// =====================================================================================

		System.out.println("\n========= Comparacion con metodo contentEquals =============");

		boolean compCadenas = (cadena01.contentEquals(cadena02)) ? true : false;

		if (compCadenas) {
			System.out.println("Cadenas Lexicograficamente Iguales");
		} else {
			System.out.println("Cadenas Lexicograficamente NO Iguales");
		}

		// =====================================================================================

		System.out.println("\n========= Comparacion caracter por caracter ===============");

		//La logitud es una condicion de comprobacion, no nos debemos limitar solo a esta
		//porque se puede tener como en este caso cadenas con mismas loingitudes pero caracteres diferentes
		boolean sizeCadenasCheck = (cadena01.length() == cadena02.length()) ? true : false;

		if (sizeCadenasCheck) {
			for (int i = 0; i < cadena01.length(); i++) {

				boolean charCadenasCheck = (cadena01.charAt(i) == cadena02.charAt(i)) ? true : false;

				if (!(charCadenasCheck)) {
					System.out.println("Cadenas Lexicograficamente NO Iguales");
					return;
				}

			}
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

			charCadenasCheck02 = (cadena01.charAt(iterador) == cadena02.charAt(iterador)) ? true : false;

			if (!(charCadenasCheck02)) {
				System.out.println("Cadenas Lexicograficamente NO Iguales");
				return;
			}
			
			iterador++;

		}
		System.out.println("Cadenas Lexicograficamente Iguales");

	}

}
