package TipoString;

public class StringTestRendimientoConcat {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String curso= "Programación Java"; //no es un primitivo
		
		String profesor= "Andres Guzman";
		
		String detalle= curso + " con el instructor " + profesor;
		System.out.println(detalle);
		
		//cuando concatenamos con operaciones aritmeticas
		
		int numA= 10;
		int numB= 5;
		System.out.println(detalle + numA + numB); // como string
		System.out.println(detalle + " = " + (numA + numB)); // separa el string de la operación aritmetica
		
		System.out.println(numA + numB + " = " +detalle);
		
		
		String detalle2 = curso.concat(" con ").concat(profesor); //se puede ir anidando
		System.out.println("detalle2 = " + detalle2);
		
		
	}

}
