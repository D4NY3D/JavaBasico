//En este ejercicio tenéis que crear un bucle que permita concatenar textos e imprima el resultado final por consola.
//Tened en cuenta que los textos pueden venir de un array de tipo String

public class ejerciciotres {
    public static void main(String[] args) {

        //Creamos el array de tipo String
        String[] nombre = new String[]{"Dani", "Mario", "Irene"};

        //Recorremos el array y mostramos su contenido
        for(int i = 0; i < nombre.length; i++) {
            System.out.print(nombre[i] + ",");
        }

    }

}

