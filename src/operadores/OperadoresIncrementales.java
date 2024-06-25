package operadores;

public class OperadoresIncrementales {
    public static void main(String[] args) {

        //preincremento
        int i= 1;
        int j= ++i; //i= i+1
        System.out.println("i = " + i); //
        System.out.println("j = " + j);

        //Post incremento
        i = 2;
        System.out.println("\t" + "inicial de i = " + i); // i vale 3
        j= i++;

        System.out.println("i = " + i); // i vale 3
        System.out.println("j = " + j); // j vale 2

        // Pre decremento
        i= 3;
        j= --i; // i= i-1= 2
        System.out.println("i = " + i);
        System.out.println("j = " + j);

        //Post Decremento
        i= 4;
        j= i--;
        System.out.println("i = " + i);
        System.out.println("j = " + j);

        System.out.println("(++j) = " + (++j));
        System.out.println("(++j) = " + (j++));
        System.out.println("j = " + j);
    }



}
