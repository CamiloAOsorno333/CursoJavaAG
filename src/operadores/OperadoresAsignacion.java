package operadores;

public class OperadoresAsignacion {

    public static void main(String[] args) {

        int i= 5; //en este caso el = es el operador de asignación
        int j= i + 4;
        // combinados o compuestos

        i = i +2;
        System.out.println("i = " + i);

        i += 5;
        System.out.println("i = " + i);

        i += 5;
        System.out.println("i = " + i);
        
        j-= 4;
        System.out.println("i = " + j);
        
        j*= 3;
        System.out.println("j = " + j);

        String sqlString= "selct * from clientes as c";

        sqlString += "where c.nombre'Andres'";
        sqlString += "and c.activos";
        System.out.println("sqlString = " + sqlString);





    }
}
