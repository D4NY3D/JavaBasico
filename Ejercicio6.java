//Crea un ArrayList de tipo int, y, utilizando un bucle rellénalo con elementos 1..10.
// A continuación, con otro bucle, recórrelo y elimina los numeros pares.
// Por último, vuelve a recorrerlo y muestra el ArrayList final.
// Si te atreves, puedes hacerlo en menos pasos, siempre y cuando cumplas el primer "for" de relleno.

import java.util.ArrayList;

public class Ejercicio6 {
    public static void main(String[] args) {
        ArrayList<Integer> elementos = new ArrayList();
        elementos.add(1);
        elementos.add(2);
        elementos.add(3);
        elementos.add(4);
        elementos.add(5);
        elementos.add(6);
        elementos.add(7);
        elementos.add(8);
        elementos.add(9);
        elementos.add(10);

        for(int i=1;i<11;i++) {
            System.out.println("ejemplo " + i);
        }
        for (Integer elemento : elementos) {
            System.out.println("ejemplo 2: " + elemento);
        }
        for (int i=0;i<elementos.size();i++){
            if(elementos.get(i) instanceof Integer){
                Integer aux=elementos.get(i);
                if(aux%2==0){
                    elementos.remove(i);
                System.out.println("ejemplo 3: "+ elementos);
                }
            for (int j=0;j<elementos.size();j++){
                System.out.println("ejemplo 4 :" + elementos.get(i));

            }
    }
        }
    }
}
