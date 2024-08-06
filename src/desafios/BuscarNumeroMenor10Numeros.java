package desafios;

/*
*
* Crear una clase con el método main donde el desafío es buscar el número menor de mínimo 10 valores enteros,
* usando la clase Scanner ingresar la cantidad de números a comparar, luego utilizando una sentencia for iterar
*el numero de veces (ingresado) para pedir el numero entero, entonces se requiere:

Calcular el menor número e imprimir el valor.

Si el menor número es menor que 10, imprimir "El número menor es menor que 10!". si no, imprimir " el numero menor
* es igual o mayor que 10!".

*/

import java.util.Scanner;

public class BuscarNumeroMenor10Numeros {

    public static void main(String[] args) {

        System.out.println("Por favor ingrese la cantidad de números que desea comparar");
        Scanner s= new Scanner(System.in);
        int cantNumComparar= s.nextInt();

        if (cantNumComparar < 10){
            System.out.println("Debe ingresar por lo menos 10 números enteros ");
        }else{
            int menor = Integer.MAX_VALUE;
            int numero;

        for(int i=0; i < cantNumComparar; i++){
            System.out.println("Ingrese por favor el número " + (i +1) +  " a comparar = ");
            int numComparar= s.nextInt();
            menor= (numComparar < menor) ? numComparar : menor;
            }
            System.out.println("el número menor es  = " + menor);

        if (menor < 10) {
            System.out.println("El número " + menor + " es menor que 10!");
        } else {
            System.out.println("El número " + menor + " es igual o mayor que 10!");
        }

        }
    }

}
