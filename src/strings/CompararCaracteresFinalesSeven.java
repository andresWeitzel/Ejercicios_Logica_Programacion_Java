package strings;


/*
 *Comparar si una cadena dada finaliza con el contenido de otra cadena. 
 * 
 * */
public class CompararCaracteresFinalesSeven {

	public static void main(String[] args) {
		
		
		
		
		// =====================================================================================

		System.out.println("\n========= Comparacion con metodo endsWith =============");

		String cadenaCompare="empos";
		String cadenaBase="La Novela más famosa de todos los tiempos";
		
		boolean checkCadenas=false;
		
		
		checkCadenas=(cadenaBase.endsWith(cadenaCompare))?true:false;
		

		System.out.println("El texto "+cadenaBase+" contiene la cadena "
		+cadenaCompare+" ?"+ checkCadenas);
		
		
		// =====================================================================================

		System.out.println("\n========= Comparacion con for =============");

		String cadenaCompare02="empos";
		String cadenaBase02="La Novela más famosa de todos los tiempos";
		
		String aux02="";
		int indice02=5;
		
		boolean checkCadenas02=false;
		
		
		
		for (int i=0; i < cadenaBase02.length(); i++) {
			
			
			if(i >= (cadenaBase02.length() - 5) && (i < cadenaBase02.length())) {
				
				aux02=aux02 + cadenaBase02.charAt(cadenaBase02.length() - indice02);
				
				indice02=indice02-1;
			}
			
		}
		
		//1er debbug
		//System.out.println(aux);
		
		checkCadenas02=(cadenaCompare02.contentEquals(aux02))?true:false;
		

		System.out.println("El texto "+cadenaBase02+" contiene la cadena "
		+cadenaCompare02+" ?"+ checkCadenas02);
		
		
	}
	
}
