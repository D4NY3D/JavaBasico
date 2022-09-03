import java.util.ArrayList;

//Crea un ArrayList de tipo String, con 4 elementos. Cópialo en una LinkedList.
// Recorre ambos mostrando únicamente el valor de cada elemento.
public class ArrayListEjercicio {
    public static void main(String[] args) {

        ArrayList<String> players = new ArrayList<String>();
        players.add("Jugador1");
        players.add("Jugador2");
        players.add("Jugador3");
        players.add("Jugador4");
        players.add("Jugador5");

        for (int i=0;i<players.size();i++){
            System.out.println(players.get(i));
        }
    }
}
