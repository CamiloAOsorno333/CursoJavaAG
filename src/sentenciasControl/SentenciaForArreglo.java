package sentenciasControl;

import javax.swing.*;

public class SentenciaForArreglo {

    public static void main(String[] args) {

        //Formas de declarar Arreglos
        //String[] nombres= new String[6];
        //String nombres[]= new String[6];

        String[] nombres= {"Andres","Pepe","Paco","Lalo","Bea","Pato","Pepa", "Maria"};

        //lo tipo para iterar un array es es un for

        int count= nombres.length;

        for (int i=0; i < count; i++){
            if(nombres[i].equals("Andres")||
                    nombres[i].equals("Pepa")){
                continue;
            }
            System.out.println(i + ".- " + nombres[i]);
        }

    String buscar= JOptionPane.showInputDialog("Ingrese un nombre, por ejemplo \"Pepe\" o \"Maria\" = ");
        System.out.println("buscar = " + buscar);

    boolean encontrado= false;
    for (int i=0; i < count; i++){
        if(nombres[i].equalsIgnoreCase(buscar)){
            encontrado= true;
            break;
        }
        System.out.println("nombres = " + nombres[i]);
    }
    if(encontrado){
      JOptionPane.showMessageDialog(null, buscar + " Fue encontrado");
    }else {
            JOptionPane.showMessageDialog(null, buscar + " No Existe en el Sistema");
        }


    }

    }

