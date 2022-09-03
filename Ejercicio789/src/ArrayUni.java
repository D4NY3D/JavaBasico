
//Crea un array unidimensional de Strings y recórrelo, mostrando únicamente sus valores.
public class ArrayUni {
    public static void main(String[] args) {
        String nombre1 = "array unidimensional";
        String nombre2 = "array ejemplo";
        String nombre3 = "otro ejemplo";

        String[] nombres = new String[3];

        nombres[0] = nombre1;
        nombres[1] = nombre2;
        nombres[2] = nombre3;

        for (int i=0;i<nombres.length;i++){
            System.out.println(nombres[i]);
        }
    }
    }

