package operadores;

public class OperadorInstanceOfTiposGenericos {

    public static void main(String[] args) {

        Object texto= "Creando un objeto de la clase String ... que tal!";

        //Number num= 7; ----> por debajo utiliza la forma Integer.valueOf(7)

        //Otra forma de declarar una instancia de una clae principal, ya que no nos deja con el new sería
        Number num= Integer.valueOf(7); //crea una public static Integer
        
        Boolean b1=texto instanceof String; //sirve para saber si una instancia es de una clase
        System.out.println("¿texto es del tipo String ?= " + b1);

        b1=texto instanceof Object;
        System.out.println("¿Es del tipo String pertenece a Object ?= " + b1);

        b1= texto instanceof  Integer;
        System.out.println("texto es del tipo Integer " + b1 );

        b1= num instanceof Integer;
        System.out.println("num es de tipo Integer = " + b1);

        b1= num instanceof Number;
        System.out.println("num es de tipo Number = " + b1);

       Number decimal= 45.54f;
       b1= decimal instanceof Double;
       System.out.println("decimal es del tipo Double = " + b1);


       b1= decimal instanceof Float;
       System.out.println("decimal es del tipo Float = " + b1);


       b1= decimal instanceof Integer;
       System.out.println("decimal es del tipo Integer = " + b1);

       b1= decimal instanceof Number;
       System.out.println("decimal es del tipo Number = " + decimal);


        b1= num instanceof Object;
        System.out.println("num es de tipo Object = " + b1);


        b1= num instanceof Double;
        System.out.println("num es de tipo Double = " + b1);

        b1= num instanceof Long;
        System.out.println("num es de tipo Long = " + b1);

        b1= b1 instanceof Boolean;
        System.out.println("b1 es del tipo Boolean = " + b1);
    }


}
