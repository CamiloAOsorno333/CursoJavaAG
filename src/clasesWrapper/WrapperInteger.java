package clasesWrapper;

public class WrapperInteger {
    public static void main(String[] args) {

        int intPrimitivo= 32768;

        //formma explicita de crear un objeto de tipo Integer (Boxing)
        Integer intObjeto= Integer.valueOf(intPrimitivo);

        //autopoxing implicita
        Integer intObjeto2= intPrimitivo;

        System.out.println("intObjeto2  = " + intObjeto2 + " " + "y  " + intObjeto);

        int num= intObjeto; //conversion automatica implicita
        System.out.println("num = " + num);
        
        int num2= intObjeto.intValue(); //conversion explicita
        System.out.println("num2 = " + num2);

        String valorTvLcd= "67000";

        //convertir un String a un valor entero 
        Integer valor= Integer.valueOf(valorTvLcd);
        System.out.println("valor = " + valor);

        Short shortObjeto= 32767;

        //cuando convertimos un tipo de dato de mayor capacidad a menor se pierden o terjiversan los datos
        Short shortobjeto2= intObjeto.shortValue();
        System.out.println("shortobjeto2   = " + shortobjeto2  +  " " + "\n" + "intObjeto que vale =  " + intObjeto + "\n" + "Son totalmente diferentes ");

        Byte byteObjeto= intObjeto.byteValue();
        System.out.println("byteObjeto = " + byteObjeto);

        Long lognObjeto= intObjeto.longValue();
        System.out.println("lognObjeto = " + lognObjeto);
    }
}
