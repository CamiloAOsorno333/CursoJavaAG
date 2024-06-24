package TipoString;

public class StringMetodosArreglos {

    public static void main(String[] args) {

        
        String trabalenguas= "trabalenguas";
        System.out.println("trabalenguas.length() = " + trabalenguas.length()); //en los string es un metodo
        System.out.println("trabalenguas.toCharArray() = " + trabalenguas.toCharArray());

        char[] arreglo = trabalenguas.toCharArray();
        int largo= arreglo.length; // el lenght en los arreglos es un atributo
        System.out.println("arreglo = " + largo);

        for(int i=0; i < largo; i++ ){
            System.out.println("arreglo = " + arreglo[i]);
        }

        System.out.println("trabalenguas = " + trabalenguas.split("a")); //es un separador

        String[] arreglo2= trabalenguas.split("a"); //genera un nuevo arreglo
        int l = arreglo2.length;

        for(int j= 0; j<l; j++) {
            System.out.println(arreglo2[j]);
        }

        String archivo= "alguna.imagen.pdf";
        String[] archivoArr= archivo.split("\\."); //forma de escapar el caracter especial [.]
        System.out.println("archivoArr[2] = " + archivoArr[2]);
        l = archivoArr.length;
        for(int j= 0; j<l; j++) {
            System.out.println(archivoArr[j]);
        }

        System.out.println("extension = " + archivoArr[l-1]); // como es otro string que se genera me trae el ultimo segmento

    }


}
