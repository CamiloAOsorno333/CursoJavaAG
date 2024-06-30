package Ejercicios;

import javax.swing.*;
import java.util.Scanner;

public class CalculoIMC {

    public static void main(String[] args) {

        CalculoIMC cp= new CalculoIMC();
        cp.imcPantalla();

        Scanner s = new Scanner(System.in);

        int peso = 0;
        double estatura = 0;

        System.out.println("Por favor ingrese su peso = ");
        peso = s.nextInt();
        System.out.println("peso = " + peso);

        System.out.println("Por favor ingrese su estatura = ");
        estatura = s.nextDouble();
        System.out.println("peso = " + peso);

        double imc = peso / Math.pow(estatura, 2);

        System.out.println("Su indice de masa muscular es = " + imc);

        if (imc < 16) {
            System.out.println("Delgadez severa");
        } else if (imc < 17) {
            System.out.println("Delgadez moderada");
        } else if (imc < 18.5) {
            System.out.println("Delgadez leve");
        } else if (imc < 25) {
            System.out.println("Peso normal");
        } else if (imc < 30) {
            System.out.println("Obesidad leve");
        } else if (imc < 35) {
            System.out.println("Obesidad moderada");
        } else if (imc < 40) {
            System.out.println("Delgadez moderada");
        } else {
            System.out.println("Obesidad morbida");
        }



    }

    public static void imcPantalla() {

        String datosPantallaPeso = JOptionPane.showInputDialog(null, "Por favor ingrese su peso corporal = ");
        String datosPantallaEstatura = JOptionPane.showInputDialog(null, "Por favor ingrese su estatura = ");
        int peso = 0;
        double estatura = 0.0;
        double imc= 0.0;

        try {

            peso = Integer.parseInt(datosPantallaPeso);
            estatura= Double.parseDouble(datosPantallaEstatura);
            imc = peso / Math.pow(estatura, 2);

        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Error, debe ingresar un peso correcto");
        }

        System.out.println("Su indice de masa muscular es = " + imc);

        if (imc < 16) {
            JOptionPane.showMessageDialog(null,"Delgadez severa");
        } else if (imc < 17) {
            JOptionPane.showMessageDialog(null,"Delgadez moderada");
        } else if (imc < 18.5) {
            JOptionPane.showMessageDialog(null,"Delgadez leve");
        } else if (imc < 25) {
            JOptionPane.showMessageDialog(null,"Peso normal");
        } else if (imc < 30) {
            JOptionPane.showMessageDialog(null,"Obesidad leve");
        } else if (imc < 35) {
            JOptionPane.showMessageDialog(null,"Obesidad moderada");
        } else if (imc < 40) {
            JOptionPane.showMessageDialog(null,"Delgadez moderada");
        } else {
            JOptionPane.showMessageDialog(null,"Obesidad morbida");
        }

    }
}