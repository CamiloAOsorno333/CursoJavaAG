package sentenciasControl;

import java.util.Scanner;

public class SetenciaSwitchCaseDiasMes {

    public static void main(String[] args) {

        Scanner s= new Scanner(System.in);
        System.out.println("Por favor ingrese el número del mes, de 1 a 12 = ");
        int mes= s.nextInt();

        int numeroDias= 0;
        System.out.println("Por favor ingrese el año = ");
        int anio= s.nextInt();              ;

        switch (mes){
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                numeroDias=31;
                break;
            case 4:
            case 6:
            case 9:
            case 11:
                numeroDias=30;
            case 2:
                if(anio % 400 == 0 || ( ( anio % 4 == 0) && !(anio % 100 == 0))){
                numeroDias= 29;
            }else{
                numeroDias=28;
            }
                break;
            default:
                System.out.println("Mil gracias intentalo de nuevo");
        }
        System.out.println("numeroDias = " + numeroDias);

    }
}
