package strings;

/*
 * Escriba un programa Java para probar si una cadena dada contiene la
 *  secuencia especificada de valores de caracteres.
 * 
 * */

public class CompararSecuenciaEspecificaSix {
	
	public static void main(String[] args) {
		
		
		//Texto Nanoparticulas
		
		String secText = "Una nanopartícula (NP) es un materialde composición"
				+ " variable,cuyotamaño está entre 1 y 100 nanómetros (nm) de diámetro."
				+ "El prefijo griego “nano” significa “enano” y en el campo dela ciencia"
				+ " se refiere a estructuras que miden la mil millonésima parte de un "
				+ "metro (1 nm = 1x10-9m) o a la millonésima parte de un milímetro "
				+ "(1 nm = 1x10-6mm) (figura 1). La nanotecnología es la disciplina "
				+ "que estudia la materia a nanoescala  para  comprender  sus "
				+ "propiedadesfísicas  y  químicas, así  como  en  el avance del"
				+ " diseño, síntesis manipulación y aplicaciones de estos materiales"
				+ " [1]. Las NPsson extremadamente pequeñas y para observarlas  "
				+ "se  requieren  microscopios  de  alta  resolución,  como  son "
				+ " el  electrónico de transmisión (TEM) o el  electrónico  de   "
				+ " barrido    (SEM) [1,  2].Las  NPs  se  generande  manera  "
				+ "naturalen el  polvo  de arena de los desiertos, en sustancias"
				+ " químicas formadas por el plancton oceánico, incendios o como "
				+ "resultado deprocesos geológicos(volcanes, fumarolas), etc.[3]."
				+ " En áreas urbanas, se originan principalmente de manera no "
				+ "intencional en procesosde combustión por vehículos de motor y "
				+ "en el desgaste de las llantas o frenos.Aquí,las NPsse  acumulan"
				+ "  en  las  banquetasy  callesencantidades  hasta  diez  veces "
				+ "mayores que las concentraciones naturales (o de fondo)[4]. "
				+ "Otra fuente de NPsno intencional es la construcción.En este "
				+ "caso, existen NPs esféricasde TiO2y Fe3O4(magnetita), "
				+ "nanotubos de carbono y un enriquecimiento especialmente mayor "
				+ "de metales  y  metaloides  (As,  Co,  Cr,  Cu,  Hg,  Fe,  Sn "
				+ " y  Ta)  en  NPs  en  relación  con partículas más grandes[5]"
				+ ".Adicionalmente, algunas características fisicoquímicasde las "
				+ "NPs sonmuy atractivas para la industria.";
		
		
		String secBuscar="metaloides";
		
		//============================ CONTIENE LA SECUENCIA IDENTICA ===============
		boolean secCheck01 = (secText.contains(secBuscar))?true:false;
		
		System.out.println("El Texto de Nanoparticulas contiene la secuencia  "
		+secBuscar+"? "+secCheck01);
		
		//============================ SON SECUENCIAS IDENTICA ===============
		boolean secCheck02 = (secText.contentEquals(secBuscar))?true:false;
		
		System.out.println("El Texto de Nanoparticulas es el mismo texto según la secuencia "
				+secBuscar+"? "+secCheck02);
		
		//============================ CONTIENE SECUENCIAS ESPECIFICAS O PARTES DE SECUENCIAS ===============
		String secBuscarEspecif="(.*)Cr(.*)";
		
	boolean secCheck03 = (secText.matches(secBuscarEspecif))?true:false;
		
		System.out.println("El Texto de Nanoparticulas contiene, ignorando otros caracteres, la secuencia especifica "
				+secBuscarEspecif+"? "+secCheck03);
		
		
	}

}
