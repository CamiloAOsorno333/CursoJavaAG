package TipoString;

public class StringValidar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String curso= null;
		
		//se valida por medio de booleanos
		
		boolean esNulo= curso == null;
		
		System.out.println("esNulo = " + esNulo);
		
		if(esNulo) {
			curso= "Programación Java";
			//curso= " ";
		}	
		
		//para validar que un string tenga un tamaño
		
		boolean esVacio= curso.length() == 0 ;
		
		System.out.println("esVacio = " + esVacio);
		
		boolean esVacio2 = curso.isEmpty(); //este metodo retorna value.legth == 0;
		System.out.println("esVacio2 =  " + esVacio2);
		
		boolean esBlanco= curso.isBlank();
		System.out.println("esBlanco = " + esBlanco);
		
		if(esBlanco == false) {
		
	    System.out.println(curso.toUpperCase());
		System.out.println("Bienvenido al curso ".concat(curso)); 
			
		}
				
		
	

	}
}
