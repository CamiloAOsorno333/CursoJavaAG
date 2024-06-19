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
		
	}

}
