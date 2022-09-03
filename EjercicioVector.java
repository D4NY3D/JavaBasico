// Crea un "Vector" del tipo de dato que prefieras, y añádele 5 elementos.
// Elimina el 2o y 3er elemento y muestra el resultado final.

import java.util.Vector;

public class EjercicioVector {
    public static void main(String[] args) {
        Vector<Integer> edad = new Vector<>(1, 6 );
        edad.add(1);
        edad.add(2);
        edad.add(3);
        edad.add(4);
        edad.add(5);
        System.out.println(edad);
        edad.remove(2);
        edad.remove(3);
        System.out.println(edad);

        for (int i : edad){
            System.out.println(i);
        }

        }



    }

