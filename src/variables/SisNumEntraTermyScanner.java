package variables;

import java.util.InputMismatchException;
import java.util.Scanner;

import javax.swing.*;

public class SisNumEntraTermyScanner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		//Clase Scanner
		
		Scanner scanner= new Scanner(System.in);
		
		System.out.println("Por favor ingrese un número");
			
		String numeroStr=scanner.nextLine();
		
		int numeroDecimal=0;
		
		try {
			numeroDecimal= Integer.parseInt(numeroStr);
		}catch (NumberFormatException e) {
			System.out.println("Error, debe ingresar un número entero");
			main(args);
			System.exit(0);
		}
		
		 
		//int numConvertido= Integer.parseInt(numeroStr);
		int num1= 3;
		int num2= 4;
		int num3= 5;
		
		int suma= numeroDecimal;
		
		suma += num1;
		suma += num2;
		suma += num3;
		
		
		System.out.println("El número obtenido por consola = " + numeroStr);
		
		System.out.println("El número obtenido por consola mas la suma es = " + suma);
		
		//otra forma de obtener el entero sin conversión de tipo 
		
		System.out.println("Por favor ingrese un número entero por consola" + "\n");
		
		try {
			numeroDecimal= scanner.nextInt();
		}catch (InputMismatchException e) {
			System.out.println("Error, debe ingresar un número entero");
			main(args);
			System.exit(0);
		}
		
		int num4= 4;
		int num5= 5;
		int num6= 6;
		
		int suma2= numeroDecimal;
		
		suma2 += num4 + num5 +num6;
		
		System.out.println("El número obtenido por consola mas la suma es = " + suma2);
	}

}
