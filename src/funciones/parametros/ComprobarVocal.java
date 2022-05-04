package funciones.parametros;

/*
 * CREAR UNA FUNCION QUE, MEDIANTE UN BOOLEANO, INDIQUE SI EL CARACTER QUE SE 
 * PASA COMO PARAMETRO DE ENTRADA CORRESPONDE A UNA VOCAL
 * 
 * */

public class ComprobarVocal {
	
public static void main(String[] args) {
		
		try {
			
			
			System.out.println("Es vocal : "+comprobarVocal('U'));
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			System.out.println("\n== Programa Finalizado ==");
		}
		
	}
	
	public static boolean comprobarVocal(char caracter) {
		
		boolean comprobar = (
				caracter == 'a' || caracter == 'A'
				|| caracter == 'e' || caracter == 'E'
				|| caracter == 'i' || caracter == 'I'
				|| caracter == 'o' || caracter == 'O'
				|| caracter == 'u' || caracter == 'U'
				? true : false
				);
		
		return comprobar;
		
	}

}
