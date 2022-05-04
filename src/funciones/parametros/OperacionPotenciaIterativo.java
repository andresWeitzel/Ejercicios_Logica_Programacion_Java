package funciones.parametros;

/*
 * 
 * DISEÑAR UNA FUNCION QUE CALCULE A^N , DONDE "A" ES REAL Y "N" ENTERO NO NEGATIVO 
 * DISEÑAR DICHA FUNCION DE FORMA ITERATIVA 
 * 
 * DATO ADICIONAL : EL SIGNO "^" NOS INDICA UNA OPERACION DE POTENCIA (MULTIPLICACION
 * DE FACTORES IGUALES). EN EL CASO DE REALIZAR ESTA OPERACION EN UNA CALCULADORA
 * EN ALGUNAS EL SIGNO ES "xY", en otras "xpara", y "^".   
 * */
public class OperacionPotenciaIterativo {
	
	public static void main(String[] args) {
		
		calculoPotencia(2,3);
		
	}
	
	public static void calculoPotencia(double numBase , int exp) {
		
		//Si nos indican que es de forma iterativa entonces multiplicamos
		//por si mismo cuantas veces se tenga el exponente con un for
		
		//Atenti a la logica planteada, en el primer calculo (numero^1) siempre da
		//el mismo numero, entonces inicializamos la variable en 1, ademas si lo 
		//inicializamos en cero siempre sera cero el resultado
	
		double resultado=1;
	
		for(int i=1 ; i <= exp ; i++) {
			
			// 1 = 1 * 5 --> 5
			// 1 = 5 * 5 --> 25
			// ................
			resultado = resultado * exp;
			
		}
		
		System.out.println("El resultado de la operacion de potenciación "
		+numBase+" ^ "+exp+" es "+resultado);
		
		
		//IMCOMPLETO, REVISAR LOGICA
		
		
	}

}
