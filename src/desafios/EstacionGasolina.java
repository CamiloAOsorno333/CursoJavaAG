package desafios;

/*Suponiendo un estanque de gasolina (gas) con capacidad 70 litros,
se requiere un programa que pida la medida actual en litros y
mostrar el resultado de la forma: Insuficiente, Suficiente, Medio...

La medida o capacidad actual del estanque puede ser en tipo double, para una mejor precisión,
pero tambien puede ser del tipo int.

Si la capacidad actual es 70 litros: imprimir Estanque lleno
Si está entre 60 y menor a 70: imprimir Estanque casi lleno
Si está entre 40 y menor a 60: imprimir Estanque  3/4
Si está entre 35 y menor a 40: imprimir Medio Estanque
Si está entre 20 y menor a 35: imprimir Suficiente
Si está entre 1 y menor a 20: imprimir Insuficiente*/

import java.util.Scanner;

public class EstacionGasolina {

    public static void main(String[] args) {

        int litros = 0;
        String[] nivelEstanque = {"lleno", "Casi lleno", "Estanque a 3/4", "Medio", "Suficiente", "Insuficiente"};


        Scanner s = new Scanner(System.in);

        System.out.println("Por favor ingrese el número de litros que tiene la estación = ");
        litros = s.nextInt();

        if (litros == 70) {
            System.out.println("El Estanque tiene  = " + litros + " Litros" + " esta  " + nivelEstanque[0]);
        } else if (litros >= 60 && litros < 70) {
            System.out.println("El Estanque tiene  = " + litros + " Litros" + " esta "  .concat(nivelEstanque[1]));
        } else if (litros >= 40 && litros < 60 ) {
            System.out.println("El Estanque tiene  = " + litros + " Litros" + " esta " .concat(nivelEstanque[2]));
        } else if (litros >= 35 && litros < 40) {
            System.out.println("El Estanque tiene  = " + litros + " Litros" + " esta " + nivelEstanque[3]);
        } else if (litros >= 20 && litros < 35) {
            System.out.println("El Estanque tiene  = " + litros + " Litros" + " esta " + nivelEstanque[4]);
        }else if (litros >= 0 && litros < 20) {
            System.out.println("El Estanque tiene  = " + litros + " Litros" + " esta " .concat(nivelEstanque[5]));
        }


    }


}