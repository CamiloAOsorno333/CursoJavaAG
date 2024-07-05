package sentenciasControl;

import java.util.Scanner;

public class SentenciaIfElse {

    public static void main(String[] args) {

       double promedio=0f;

        Scanner s = new Scanner(System.in);
        System.out.println("Por ingresa tu promedio ");
        promedio= s.nextFloat();

        if(promedio >= 6.5) {
            System.out.println("Felicitaciones, excelente promedio! ");

        }else if(promedio <= 6.0){
            System.out.println("Muy buen promedio");
        }else if (promedio >= 5.5){
            System.out.println("Buen promedio!");
        } else if (promedio >= 5.0 ) {
            System.out.println("Necesitas un poco mas de esfuerzo");
        }else if(promedio >= 4.0){
            System.out.println("Insuficiente, necesitas un poco mas de esfuerzo");
        }else {
            System.out.println("Reprobado");
        }

        System.out.println("Tu promedio es = " + promedio);
            
        }

}
