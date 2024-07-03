package desafios;

import java.util.Scanner;

public class PedirDosNumeros {

    public static void main(String[] args) {

        int num1=0;
        int num2=0;

        Scanner s= new Scanner(System.in);

        System.out.println("Por favor ingrese el primer número = ");
        num1= s.nextInt();

        System.out.println("Por favor ingrese el segundo número = ");
        num2= s.nextInt();

        System.out.println("El orden de los numeros es el siguiente = ");

        String mensaje= (num1 > num2) ? " el primero es " + num1 + " y el segundo " + num2 :
                " el primero es " + num2 + " y el segundo " + num1;
        System.out.println("mensaje = " + mensaje);


    }
}
