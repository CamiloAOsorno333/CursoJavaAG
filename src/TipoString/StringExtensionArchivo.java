package TipoString;

public class StringExtensionArchivo {

    public static void main(String[] args) {

        String archivo = "alguna_imagen.jpeg";
        int i= archivo.indexOf(".");
        int i2= archivo.lastIndexOf(".");
        System.out.println("archivo.length() = " + archivo.length()); //es mejor este metodo
        System.out.println("archivo.substring(archivo.length()-4) = " + archivo.substring(i+1));
        System.out.println("archivo.substring(archivo.length()-4) = " + archivo.substring(i2+1));




    }
}
