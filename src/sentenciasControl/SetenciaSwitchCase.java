package sentenciasControl;

import javax.swing.*;
import java.util.Scanner;

public class SetenciaSwitchCase {

    public static void main(String[] args) {

        System.out.println("Por favor ingrese una opción del 0 a 3");
        Scanner s= new Scanner(System.in);

        int num= s.nextInt();

        switch (num){
            case 0:
                System.out.println("El número cero");
                break;
            case 1:
                System.out.println("El número uno");
                break;
            case 2:
                System.out.println("El número dos");
                break;
            case 3:
                System.out.println("El número tres");
                break;
            default:
                System.out.println("Número o caracter desconocido");
        }


        System.out.println("Por favor ingrese un nombre");

        //String nombre= JOptionPane.showInputDialog(null, "Por favor ingrese un nombre de usuario");

        String nombre= s.next();
        switch (nombre){
            case "admin":
                System.out.println("Hola admin, Bienvenido");
                break;
            case "Andres":
                System.out.println("Hola Andrés, Bienvenido");
                break;
            case "Camilo":
                System.out.println("Hola Camilo, Bienvenido");
                break;
            default:
                System.out.println("Usuario Desconocido");

        }

    }
}
