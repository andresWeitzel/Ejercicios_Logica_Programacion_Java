package strings;

/*
 * Escriba un programa Java para probar si una cadena dada contiene la
 *  secuencia especificada de valores de caracteres.
 * 
 * */

public class CompararSecuenciaEspecificaSix {
	
	public static void main(String[] args) {
		
		
		//Texto Nanoparticulas
		
		String secText = "Una nanopart�cula (NP) es un materialde composici�n"
				+ " variable,cuyotama�o est� entre 1 y 100 nan�metros (nm) de di�metro."
				+ "El prefijo griego �nano� significa �enano� y en el campo dela ciencia"
				+ " se refiere a estructuras que miden la mil millon�sima parte de un "
				+ "metro (1 nm = 1x10-9m) o a la millon�sima parte de un mil�metro "
				+ "(1 nm = 1x10-6mm) (figura 1). La nanotecnolog�a es la disciplina "
				+ "que estudia la materia a nanoescala  para  comprender  sus "
				+ "propiedadesf�sicas  y  qu�micas, as�  como  en  el avance del"
				+ " dise�o, s�ntesis manipulaci�n y aplicaciones de estos materiales"
				+ " [1]. Las NPsson extremadamente peque�as y para observarlas  "
				+ "se  requieren  microscopios  de  alta  resoluci�n,  como  son "
				+ " el  electr�nico de transmisi�n (TEM) o el  electr�nico  de   "
				+ " barrido    (SEM) [1,  2].Las  NPs  se  generande  manera  "
				+ "naturalen el  polvo  de arena de los desiertos, en sustancias"
				+ " qu�micas formadas por el plancton oce�nico, incendios o como "
				+ "resultado deprocesos geol�gicos(volcanes, fumarolas), etc.[3]."
				+ " En �reas urbanas, se originan principalmente de manera no "
				+ "intencional en procesosde combusti�n por veh�culos de motor y "
				+ "en el desgaste de las llantas o frenos.Aqu�,las NPsse  acumulan"
				+ "  en  las  banquetasy  callesencantidades  hasta  diez  veces "
				+ "mayores que las concentraciones naturales (o de fondo)[4]. "
				+ "Otra fuente de NPsno intencional es la construcci�n.En este "
				+ "caso, existen NPs esf�ricasde TiO2y Fe3O4(magnetita), "
				+ "nanotubos de carbono y un enriquecimiento especialmente mayor "
				+ "de metales  y  metaloides  (As,  Co,  Cr,  Cu,  Hg,  Fe,  Sn "
				+ " y  Ta)  en  NPs  en  relaci�n  con part�culas m�s grandes[5]"
				+ ".Adicionalmente, algunas caracter�sticas fisicoqu�micasde las "
				+ "NPs sonmuy atractivas para la industria.";
		
		
		String secBuscar="metaloides";
		
		//============================ CONTIENE LA SECUENCIA IDENTICA ===============
		boolean secCheck01 = (secText.contains(secBuscar))?true:false;
		
		System.out.println("El Texto de Nanoparticulas contiene la secuencia  "
		+secBuscar+"? "+secCheck01);
		
		//============================ SON SECUENCIAS IDENTICA ===============
		boolean secCheck02 = (secText.contentEquals(secBuscar))?true:false;
		
		System.out.println("El Texto de Nanoparticulas es el mismo texto seg�n la secuencia "
				+secBuscar+"? "+secCheck02);
		
		//============================ CONTIENE SECUENCIAS ESPECIFICAS O PARTES DE SECUENCIAS ===============
		String secBuscarEspecif="(.*)Cr(.*)";
		
	boolean secCheck03 = (secText.matches(secBuscarEspecif))?true:false;
		
		System.out.println("El Texto de Nanoparticulas contiene, ignorando otros caracteres, la secuencia especifica "
				+secBuscarEspecif+"? "+secCheck03);
		
		
	}

}
