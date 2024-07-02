package operadores;

public class OperadorStanceOf {

    public static void main(String[] args) {

        String texto= "Creando un objeto de la clase String ... que tal!";

        Integer num= 7;
        
        Boolean b1=texto instanceof String; //sirve para saber si una instancia es de una clase
        System.out.println("¿Es del tipo String ?= " + b1);

        b1=texto instanceof Object;
        System.out.println("¿Es del tipo String pertenece a Object ?= " + b1);

        b1= num instanceof Integer;
        System.out.println("num es de tipo Integer = " + b1);



        b1= num instanceof Number;
        System.out.println("num es de tipo Number = " + b1);

        Double decimal= 45.54;
        b1= decimal instanceof Number;


        b1= num instanceof Object;
        System.out.println("num es de tipo Object = " + b1);

        b1= b1 instanceof Boolean;
        System.out.println("b1 es del tipo Boolean = " + b1);
    }


}
