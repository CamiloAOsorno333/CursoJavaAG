package operadores;

public class PrecedenciaOperadores {

    public static void main(String[] args) {

   
    int i= 14;
    int j= 8;
    int k= 20;

    double promedio= (i + j +k) /3d; //parentesis para priorizar
    System.out.println("promedio = " + promedio);

    promedio= promedio= (i + j +k) /3d * 10; // la manera correcta
    System.out.println("promedio = " + promedio);

    promedio= ++i + j-- +k /3d * 10;
    System.out.println("promedio = " + promedio);
    System.out.println("i = " + i);
    System.out.println("i = " + j);

    promedio= --i + j++ +k /3d * 10;
    System.out.println("promedio = " + promedio);
    System.out.println("i = " + i);
    System.out.println("i = " + j);


    }
}
