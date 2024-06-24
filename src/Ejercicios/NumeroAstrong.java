package Ejercicios;

import javax.swing.*;

public class NumeroAstrong {
    public static void main(String[] args) {


       String ingreseNumero= JOptionPane.showInputDialog(null, "Por favor ingrese un número para su evaluación");

        int numIngresado=0;

        try {
            numIngresado=Integer.parseInt(ingreseNumero);
            int canExp= ingreseNumero.length();
            System.out.println("canExp = " + canExp);
            for(int i=0; i<ingreseNumero.length(); i++){
                char numNum= ingreseNumero.charAt(i);
               // int convertido= Integer.parseInt(null,numNum) ^ canExp;
                System.out.println(numNum);

            }
        } catch (Exception e){
            JOptionPane.showInputDialog(null,"Error, debe ingresar un número entero");
            main(args);
            System.exit(0);
        }

    }

    /* public static int numAstrong(int num){
        int numIngreso= 0;
        String numDigitos= Integer.parseInt()
    }*/
}
