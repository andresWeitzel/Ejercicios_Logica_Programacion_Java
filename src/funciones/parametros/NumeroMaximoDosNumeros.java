package funciones.parametros;

/*
 * 
 * DISEÑAR UNA FUNCION QUE RECIBA COMO PARAMETROS DOS NUMEROS ENTEROS Y QUE 
 * DEVUELVA EL MAXIMO/MAYOR DE ELLOS 
 * 
 * */
public class NumeroMaximoDosNumeros {
	
	public static void main(String[] args) {
		
		try {
			
			//En caso que sean iguales hay que evaluar que condicion se desea
			//mostrar, el algoritmo cambiaria
			numeroMayor(10,100);
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			System.out.println("\n== Programa Finalizado ==");
		}
		
	}
	
	public static void numeroMayor(int num01, int num02) {
		
		int mayor = (num01 > num02) ? num01 : num02;
		
		System.out.println("\n El Número Mayor es "+mayor);;
		
	}

}
