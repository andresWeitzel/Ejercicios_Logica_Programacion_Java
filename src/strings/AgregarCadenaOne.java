package strings;

/*
 * Escriba un programa Java para concatenar una cadena dada al final de otra cadena
 * 
 * 
 * */

public class AgregarCadenaOne {

	public static void main(String[] args) {

		String cadena01 = "El desarrollo de software es el proceso de concebir,"
				+ " especificar, diseñar, programar, documentar, probar y corregir errores";
		String cadena02 = " involucrados en la creación y mantenimiento de aplicaciones, "
				+ "marcos u otros componentes de software.";

		// =====================================================================================

		System.out.println("\n========= Agregación con metodo concat =============");

		String cadenaFinal = cadena01.concat(cadena02);
		
		System.out.println(cadenaFinal);

		// =====================================================================================

		System.out.println("\n========= Agregación caracter a caracter =============");

	
		int sizeCadena01=cadena01.length();
		int sizeCadena02=cadena02.length();
		int sizeTotal = (sizeCadena01+sizeCadena02);
		
		String arrayCadena[] = new String[sizeTotal];
		
		for(int i=0; i < sizeCadena01; i++ ) {
				arrayCadena[i] = String.valueOf(cadena01.charAt(i)); 

		}
		//La logica del for no cambia, solo agregamos valores al indice total del 
		//ultimo indice usado de la primera cadena
		for(int i=0; i < sizeCadena02; i++ ) {
			arrayCadena[sizeCadena01 + i] = String.valueOf(cadena02.charAt(i)); 

	}
		
		System.out.println("\n=== Secuencias de Strings por caracteres ==");
		for (int i=0; i < (sizeTotal) ; i++) {
			System.out.println(arrayCadena[i]);
		}
		
		
		
	
		
			
		
		
	}

}
