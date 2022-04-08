package iniciales.scanner;

import java.util.Locale;
import java.util.Scanner;

/*
 * UN ECONOMISTA NOS HA ENCARGADO QUE DISEÑEMOS UN PROGRAMA QUE REALICE CALCULOS
 * CON EL IVA. LA APLICACION DEBE SOLICITAR LA BASE IMPONIBLE Y EL IVA A APLICAR
 * DEBEMOS MOSTRAR EN PANTALLA EL IMPORTE CORRESPONDIENTE AL IVA Y AL TOTAL.
 * 
 * */
public class CalculoIVA {
	
	public static void main(String[] args) {
		
		//Si no se tiene nocion de economia es complicado discernir el significado
		//de lo que se pide, dejo una pag para aclarar dudas https://sumup.es/facturas/glosario/base-imponible/
		
		//Base imponible-->Subtotal sin IVA de una factura
		//El iva es el agregado del subtotal y se convierte en total de la factura
		
		try {
			Scanner sc=new Scanner(System.in);
			sc.useLocale(Locale.US);
			
			
			System.out.println("\n== INGRESAR BASE IMPONIBLE(SUBTOTAL SIN IVA) ==");
			double baseImponible=sc.nextDouble();
			
			
			System.out.println("\n== INGRESAR IVA FORMATO DECIMAL ==");
			double iva = sc.nextDouble();
			
			double ivaAplicado = (iva * baseImponible) / 100;
			
			double total = baseImponible + ivaAplicado;
			//==============================================================
			
			System.out.println("\n======================");
			System.out.println("==== CALCULO PRECIO ====");
			System.out.println("======================\n");
			
			System.out.println("\n == BASE IMPONIBLE INGRESADO / SUBTOTAL : "+baseImponible);
			System.out.println("\n == IVA PORCENTUAL : "+iva+"%");
			System.out.println("\n == CUOTA TRIBUTARIA (IVA APLICADO) : "+ivaAplicado);
			System.out.println("\n == TOTAL CON IVA : "+total);
			
			
			
			
		} catch (Exception e) {
			
			e.printStackTrace();
		}
		
	
		
		
	}

}
