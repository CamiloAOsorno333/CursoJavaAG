package variables;

import javax.swing.*;

public class SisNumEntraVentana {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Entrada de datos por pantalla
		
		String datosPantalla= JOptionPane.showInputDialog(null,"Ingrese un número para el calculo");
		
		int numeroEntero=0;
		try {
			numeroEntero= Integer.parseInt(datosPantalla);
		}catch (NumberFormatException e) {
			JOptionPane.showMessageDialog(null, "Error, debe ingresar un número entero");
			main(args);
			System.exit(0);
		}
		
		System.out.print("El número que ingresaste por patanlla es = " + numeroEntero + "\n");
		
		int num1= 3;
		int num2= 4;
		int num3= 5;
		
		numeroEntero += num1;
		numeroEntero += num2;
		numeroEntero += num3;
		
		
		System.out.println("El resultado de los datos de pantalla mas la suma es = " + numeroEntero);
		
		
	}

}
