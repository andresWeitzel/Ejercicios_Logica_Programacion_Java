package funciones.parametros;

/*
 * 
 * Obtener el caracter medio de una cadena dada. Si la longitud de la cadena
 * es inpar, existirá un caracter intermedio, en caso contrario avisar que no
 * existe un caracter intermedio.
 * 
 * 
 * */

public class CaracterMedio {
	
	public static void main(String[] args) {
		
		String cadena = "Arbol"; 
		
		
		CaracterMedio obj = new CaracterMedio();
		
		
		obj.caracterInt(cadena);
		
		
		
	}
	
	

public void caracterInt(String cadenaInput) {

	String caracter = "";
	
	boolean checkParCadenaInput = ((cadenaInput.length() % 2) == 0) ? true : false;
	boolean existCaractMedio=false;
	
	if(!checkParCadenaInput) {
		caracter = String.valueOf(cadenaInput.charAt(cadenaInput.length() / 2 ));
		existCaractMedio=true;
	}else {
		existCaractMedio=false;
	}

	if(existCaractMedio) {
		System.out.println("El Caracter Medio de la Cadena "+cadenaInput+" es "+ caracter );
	}else {
		System.out.println("No existe Caracter Medio");
	}
	
	
	
}


}
