package TipoString;

public class CreandoObjString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String curso= "Programación Java"; //no es un primitivo
		String curso2 = new String("programación java");	
		
		boolean esIgual = curso == curso2; //compara en cuanto a la instancia pero no por su valor
		System.out.println("curso == curso2 = " + esIgual);
		
		esIgual= curso.equals(curso2); //compara por valor 
		System.out.println("curso.equals(curso2) = " + esIgual);
		
		esIgual= curso.equalsIgnoreCase(curso2); //compara por valor ignorando mayusculas y minusculas
		System.out.println("curso.equalsIgnoreCase(curso2) = " + esIgual);
		
		String curso3= "Programación Java";
		esIgual = curso == curso3;
		System.out.println("curso == curso3 = " + esIgual);
		
		
	}

}
