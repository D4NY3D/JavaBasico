//Crea un array bidimensional de enteros y recórrelo, mostrando la posición y el valor de cada elemento en ambas dimensiones.
public class arrayBidi {
    public static void main(String[] args) {


        int[][] numero;
        numero= new int[4][2]; // filas y columnas

        numero [0][0] = 5;
        numero [0][1] = 10;

        numero [1][0] = 30;
        numero [1][1] = 40;

        numero [2][0] = 60;
        numero [2][1] = 70;

        numero [3][0] = 80;
        numero [3][1] = 90;

        for (int i=0;i<numero.length;i++){
            System.out.println("posicion de i: " + i);

            for (int j=0;j< numero[j].length;j++){
                System.out.println("posicion de j: "+ j);
                System.out.println( "posicion de i = "+i + " posicion de j = "+ j);
                System.out.println(numero[i][j]);
            }
        }
    }
}
