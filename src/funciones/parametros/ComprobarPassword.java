package funciones.parametros;


/*
 * ‎Escriba un método Java para comprobar si una cadena es una contraseña válida. 
 *  Reglas‎ de contraseña:‎
‎ Una contraseña debe tener al menos diez caracteres. ‎
‎ Una contraseña consta solo de letras y dígitos. 
 Una contraseña no puede contener la letra Ñ .‎
‎ Contraseñas no permitidas mayusculas, minusculas: admin, root, gestion .‎
 * */
public class ComprobarPassword {
	
	public static void main(String[] args) {
		
		
		String passwd="aaaaaaaaaaa";
		
		ComprobarPassword.checkPassword(passwd);
		
	}
	
	public static void checkPassword(String password) {
		
		int passwSize=password.length();
		
		
		boolean checkSize = (passwSize < 10 || passwSize <= 0) ? false : true;
		
		//El patron aplica a tener caracteres y digitos, no es necesario que esten ambos
		boolean checkLetrasDigits = (password.matches("[a-zA-z0-9]*")) ? true : false;
		
		boolean checkLetra = (password.contains("Ñ")) ? false : true;
		
		boolean checkPassword = (password.equalsIgnoreCase("admin") 
							||	password.equalsIgnoreCase("root")
							||  password.equalsIgnoreCase("gestion")
							) ? false : true;
		
		
		
		if(checkSize && checkLetrasDigits && checkLetra && checkPassword ) {
			System.out.println("Password Válido");
		}else {
			System.out.println("Password Inválido");
		}
		
		
		
	} 

}
