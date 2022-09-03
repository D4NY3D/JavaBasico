//Dada la función:
//
// public static String reverse(String texto) { }
//
//Escribe el código que devuelva una cadena al revés. Por ejemplo, la cadena "hola mundo", debe retornar "odnum aloh".
public class Main {

    public static String reverse(String texto ) {
        return new StringBuilder(texto).reverse().toString();
        }

    public static void main(String[] args) {
        String texto ="hola mundo";
        texto =reverse(texto);
        System.out.println("Hola mundo, escrito al reves: " + texto);
    }
    }



