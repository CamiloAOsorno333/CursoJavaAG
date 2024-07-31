package sentenciasControl;

public class SentenciaForEach {
    public static void main(String[] args) {
        //ForEach es solo para iterar arreglos u objetos de colección

        int[] numeros= {1,5,7,9,11,13,15};
        for(int num: numeros){
            System.out.println("num = " + num);
        }

        String[] nombres= {"Andres","Pepe","Paco","Lalo","Bea","Pato","Pepa", "Maria"};
        
        for(String nombre: nombres){
            System.out.println("nombre = " + nombre);
        }
    }
}
