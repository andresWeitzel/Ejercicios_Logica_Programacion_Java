package iniciales.geometria;

public class AreaPerimetroCuadrado {
	//https://www.w3resource.com/java-exercises/basic/index.php
	public static void main(String[] args) {
		
		//https://yosoytuprofe.20minutos.es/2019/09/06/como-calcular-el-area-y-el-perimetro-de-un-cuadrado/
	
		
	
	double base=22d;
	double altura=33d;
	
	
	System.out.println("\n=== DATOS DEL CUADRADO == ");
	System.out.println("Base: "+base+" m");
	System.out.println("Altura: "+altura+" m");
	
	System.out.println("\n=== AREA DEL CUADRADO == ");
	//El area es Base x Altura o LADO x LADO
	
	double area=base*altura;
	
	System.out.println(area+" m^2");
	
	System.out.println("\n=== PERIMETRO DEL CUADRADO == ");
	//El perimetro es la suma de todos sus lados
	double perimetro=(base*2)+(altura*2);
	
	System.out.println(perimetro+" m^2");
		
	}

}
