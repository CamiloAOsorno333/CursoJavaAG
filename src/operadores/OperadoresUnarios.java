package operadores;

public class OperadoresUnarios {

    public static void main(String[] args) {

        //operadores unarios (+ - ) o multiplicar por menos -1
        int i= -5;
        int j= +i; // j= (1)+1 => 5
        System.out.println("j = " + j);

        int k = -i; //k= (-1)*i; =>5
        System.out.println("k = " + k);

        i = 6;
        j = +i;
        System.out.println("j = " + j);
        
        k= -i;
        System.out.println("k = " + k);


    }
}
