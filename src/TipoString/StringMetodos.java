package TipoString;

public class StringMetodos {

    public static void main(String[] args) {

        String nombre= "Andres";

        System.out.println("nombre.length() = " + nombre.length());

        System.out.println("nombre.toUpperCase() = " + nombre.toUpperCase());
        System.out.println("nombre.toUpperCase() = " + nombre.toLowerCase());
        System.out.println("nombre.equals(\"Andres\") = " + nombre.equals("Andres"));
        System.out.println("nombre.equals(\"Andres\") = " + nombre.equals("andres"));
        System.out.println("nombre.equalsignoreCase(\"Andres\") = " + nombre.equalsIgnoreCase("andres"));
        System.out.println("nombre.compareTo(\"Andres\") = " + nombre.compareTo("Andres")); //orden numerico de cada codigo o lexicografico
        System.out.println("nombre.compareTo(\"Aaron\") = " + nombre.compareTo("Aaron"));
        System.out.println("nombre.charAt(0) = " + nombre.charAt(0)); //ne trae la posición de cada letra
        System.out.println("nombre.charAt(1) = " + nombre.charAt(1));
        System.out.println("nombre.charAt(1) = " + nombre.charAt(5));
        System.out.println("nombre.charAt(dinamico) = " + nombre.charAt(nombre.length()-1)); //manera dinamica para saber ultimo caracter
        System.out.println("nombre.substring(1) = " + nombre.substring(1)); //muestra una parte del string
        System.out.println("nombre.substring(1) = " + nombre.substring(4)); //muestra una parte del string
        System.out.println("nombre.substring(1) = " + nombre.substring(nombre.length()-1)); //muestra una parte del string

        String trabalengua= "trabalenguas";
        System.out.println("trabalengua.replace(\"a\", \".\") = " + trabalengua.replace("a", "."));

        System.out.println("trabalengua = " + trabalengua);

        System.out.println("trabalengua.indexOf('a') = " + trabalengua.indexOf('a')); // para saber la primera posición de un caracter

        System.out.println("trabalengua.lastIndexOf('a') = " + trabalengua.lastIndexOf('a')); // la ultima ocurrencia de ese caracter
        System.out.println("trabalengua.indexOf('z') = " + trabalengua.indexOf('z'));// como no esta retorna un -1
        System.out.println("trabalengua.contains(\"t\") = " + trabalengua.contains("t")); // contiene si o no x mdio de un booleano
        System.out.println("trabalengua.contains(\"t\") = " + trabalengua.contains("lenguas")); // contiene si o no x mdio de un booleano
        System.out.println("trabalengua.contains(\"t\") = " + trabalengua.startsWith("lenguas")); // contiene si o no x mdio de un booleano

        System.out.println("trabalengua.startsWith(\"Lenguas\") = " + trabalengua.startsWith("traba")); //comienza con

        System.out.println("trabalengua.endsWith(\"tr\") = " + trabalengua.endsWith("enguas")); //termina con

        System.out.println("  trabalenguas " );
        System.out.println("  trabalenguas ".trim());
    }
}
