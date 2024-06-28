package operadores;

import java.util.Scanner;

public class OperadorTernario {

    public static void main(String[] args) {


    //es una version simplificada del if/else

    //  variable= condicion ? si es verdadero: si es falso


    String variable = 7 == 5 ? "si es verdadero" : "si es falso";
    System.out.println("variable = " + variable);

    
    String estado= "";
    double promedio= 0.0;
    
    estado = promedio >= 5.49 ? "Aprobado" : "Rechazado";
        System.out.println("estado = " + estado);

    double matematicas= 0;
    double sociales= 0;
    double espanol= 0;
    double ciencias= 0;
    double historia= 0;



    Scanner scanner= new Scanner(System.in);

    System.out.println("Ingresa la nota de matematicas entre 2.0  - 7.0");
    matematicas = scanner.nextDouble();

    System.out.println("Ingresa la nota de sociales entre 2.0  - 7.0");
    sociales = scanner.nextDouble();

    System.out.println("Ingresa la nota de espanol entre 2.0  - 7.0");
    espanol = scanner.nextDouble();

    System.out.println("Ingresa la nota de ciencias entre 2.0  - 7.0");
    ciencias = scanner.nextDouble();

    System.out.println("Ingresa la nota de historia entre 2.0  - 7.0");
    historia = scanner.nextDouble();

    promedio= (matematicas + sociales + espanol + ciencias + historia) / 5;
    System.out.println("promedio = " + promedio);


    estado = promedio >= 5.49 ? "Aprobado" : "Rechazado";
    System.out.println("estado = " + estado);

    }

}
