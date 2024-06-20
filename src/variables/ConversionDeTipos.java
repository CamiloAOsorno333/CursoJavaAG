package variables;

public class ConversionDeTipos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String numeroStr="50";
		
		//convertir a entero
		int numeroInt= Integer.parseInt(numeroStr);
		System.out.println("numeroInt = " + numeroInt);
		
		//convertir a decimales 
		String realStr= "9874563.21e-3";
		double realDouble= Double.parseDouble(realStr);
		System.out.println("realDouble = " + realDouble);
		
		String logicaStr= "true";
		boolean logicoBoolean = Boolean.parseBoolean(logicaStr);
		System.out.println("logicaBoolean = " + logicoBoolean);
		
		
		//Conversión de primitivos a enteros
		
		int otroNumeroInt= 100;
		
		System.out.println("otroNumeroInt = " + otroNumeroInt);
		
		String otroNumeroStr= Integer.toString(otroNumeroInt);
		System.out.println("otroNumeroStr = " + otroNumeroStr);	
		
		
		otroNumeroStr= String.valueOf(otroNumeroInt + 10);
		System.out.println("otroNumeroStr = " + otroNumeroStr);
		
		Double otroRealDouble= 12.3456789e2;
		String otroRealStr= Double.toString(otroRealDouble);
		System.out.println("otroRealStr = " + otroRealStr);
		
		otroRealStr= String.valueOf(1.23456f);
		System.out.println("otroRealStr = " + otroRealStr);
		
		//Conversion de primitivos a primitivos
		
		int i= 142767;
		short s = (short)i;  //forzar la conversion
		System.out.println("s = " + s);
		long l=i;
		System.out.println("l = " + l);
		
		System.out.println(Short.MAX_VALUE);
		
		char b= (char)i;
		System.out.println("b = " + b);
		
		float f = (float) i;
		System.out.println("f = " + f);
	}

}
