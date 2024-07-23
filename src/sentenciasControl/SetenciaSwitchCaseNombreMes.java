package sentenciasControl;

import java.util.Scanner;

public class SetenciaSwitchCaseNombreMes {

    public static void main(String[] args) {

        System.out.println("Por favor ingrese el número del mes = ");
        Scanner s= new Scanner(System.in);

        int mes=s.nextInt();
        String nombreMes=null;


        switch(mes){
            case 1:
                nombreMes= "Enero";
                break;
            case 2:
                nombreMes= "Febrero";
                break;
            case 3:
                nombreMes= "Marzo";
                break;
            case 4:
                nombreMes= "Abril";
                break;
            case 5:
                nombreMes= "Mayo";
                break;
            case 6:
                nombreMes= "Junio";
                break;
            case 7:
                nombreMes= "Julio";
                break;
            case 8:
                nombreMes= "Agosto";
                break;
            case 9:
                nombreMes= "Septiembre";
                break;
            case 10:
                nombreMes= "Octubre";
                break;
            case 11:
                nombreMes= "Noviembre";
                break;
            case 12:
                nombreMes= "Diciembre";
                break;
            default:
                System.out.println("El número ingresado no corresponde a ningún mes del año");
        }

        System.out.println(nombreMes);

        System.out.println("Por favor ingrese una opción del 0 a 3");
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
