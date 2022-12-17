package funciones.parametros;


//https://www.w3resource.com/java-exercises/method/index.php
/*
 * ‎Escriba un método Java para comprobar si varias cadenas son contraseñas válidas. 
 *  Reglas‎ de contraseña:‎
‎
Minimo 8 caracteres
Maximo 15
Al menos una letra mayúscula
Al menos una letra minucula
Al menos un dígito
No espacios en blanco
Al menos 1 caracter especial
No puede contener la letra Ñ .

Contraseñas no permitidas (combinacion mayusculas y minusculas):
 admin, root, gestion .‎
 * */

public class ComprobarPasswords {
	
	
	
	public static void main(String[] args) {
		
		String passwords[]= new String[]{
			"123EERT",
			"ROOT",
			"ssssssasdsds",
			"ssssssahGGGD",
			"ssssss///aSDSAD",
			"%33jsoa88"
		};
		
		ComprobarPasswords.checkPasswords(passwords);
		
		
	}
	
	
	
	public static void checkPasswords(String passwords[]) {
		
		int passwordsSize=passwords.length;
		
		int passwdSize=0;
		
		String passwdActual="";
		
		boolean checkPasswdMinSize=false;
		boolean checkPasswdMaxSize=false;
		boolean checkMayusc=false;
		boolean checkMinusc=false;
		boolean checkLetrasDigits=false;
		boolean checkLetra=false;
		boolean checkPassword=false;
		
		for(int i=0; i<passwordsSize; i++) {
			
			passwdSize=passwords[i].length();
			
			passwdActual=passwords[i];
			
			
			//TAMAÑOS
			checkPasswdMinSize = (passwdSize < 8 || passwdSize <= 0) ? false : true;
			checkPasswdMaxSize = (passwdSize > 15 || passwdSize <= 0) ? false : true;
			
			//MAYUSCULAS Y MINUSCULAS
			checkMayusc = (passwdActual.matches("/^[^A-Z]*[A-Z][^A-Z]*$/")) ? true : false;
			
			
			//checkLetrasDigits = (passwdActual.matches("^[a-zA-Z0-9_.-]*$")) ? true : false;
			
			/*
			 checkLetra = (password.contains("Ñ")) ? false : true;
			
			 checkPassword = (password.equalsIgnoreCase("admin") 
								||	password.equalsIgnoreCase("root")
								||  password.equalsIgnoreCase("gestion")
								) ? false : true;
			
			*/
			
			if (checkPasswdMinSize 
				&& checkPasswdMaxSize 
				&& checkMayusc
				//&& checkLetrasDigits
				) {
				
				System.out.println("\nEl Password '"+passwords[i]+"' es Válido");
			}else {
				System.out.println("\nEl Password '"+passwords[i]+"' es Inválido");
			}
			
			
		}
		
		//Solucion --> ^(?=.*[a-z])(?=.*[A-Z])(?=.*\d)(?=.*[$@$!%*?&])([A-Za-z\d$@$!%*?&]|[^ ]){8,15}$
		//https://es.stackoverflow.com/questions/4300/expresiones-regulares-para-contrase%C3%B1a-en-base-a-una-politica
		
		
		//Convertir todo esta regex en pequeñas regex
		
		
		//http://w3.unpocodetodo.info/utiles/regex.php

		
	} 
	
	

}
