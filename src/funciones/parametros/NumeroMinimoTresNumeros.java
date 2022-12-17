package funciones.parametros;


//Escribir un metodo para encontrar el numero mas pequeño entre tres numeros de 
//entrada

//https://www.w3resource.com/java-exercises/method/index.php

public class NumeroMinimoTresNumeros {
	
	public static void main(String[] args) {
		
		double num01=3.1;
		int num02=52222;
		double num03=33.3;
		
		
		
		System.out.println("\n=======NUMERO MINIMO CON BOOLEANS =======");
		NumeroMinimoTresNumeros obj = new NumeroMinimoTresNumeros();
		
		obj.numMin(num01, num02, num03);
		
		System.out.println("\n=======NUMERO MINIMO CON MATH =======");
		System.out.println( NumeroMinimoTresNumeros.numMinMath(num01, num02, num03));
		
		
	}

	

public void numMin(double num01, double num02, double num03) {
	

	double checkFirstStep = (num01 < num02) ? num01 : num02;
	
	double checkSecondStep = (checkFirstStep > num03 ) ? num03 : checkFirstStep;
	
	
	System.out.println("El Número más pequeño entre "+num01+", "+num02+", "+num03
			+" es "+checkSecondStep); 
}


public static double numMinMath(double num01, double num02, double num03) {
	

	double numMin = Math.min(Math.min(num01, num02), num03);
	
	return numMin; 
}


}


