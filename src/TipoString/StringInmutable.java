package TipoString;

public class StringInmutable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String curso= "Programación Java"; //no es un primitivo
		
		String profesor= "Andres Guzman";
		
		String resultado= curso.concat(profesor);
		System.out.println("curso = " + curso);
		System.out.println("resultado = " + resultado);
		System.out.println(curso == resultado);
		
		String resultado2= curso.transform(c->{
			return c + " con " + profesor;
		});
		
		System.out.println("curso = " + curso); // curso se mantiene inmutable
		System.out.println("resultado2 = " + resultado2);
		
		String resultado3= resultado.replace("a", "A");
		System.out.println("resultado = " + resultado); // no cambia nada es inmutable
		System.out.println("resultado3 = " + resultado3);
	}

}
