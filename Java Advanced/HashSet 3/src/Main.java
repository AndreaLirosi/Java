import java.util.HashSet;
import java.util.Iterator;
import java.util.Objects;

public class Main {
    public static void main(String[] args) {
        //creo un hashset che chiamo user
        HashSet<String> user = new HashSet<>();

        user.add("Andrea");
        user.add("Marco");
        user.add("Alberto");
        user.add("Elisa");
        // gli utenti da verificare se sono presenti nel set
        String utente1 = "Alberto";


        System.out.println("Prima della rimozione:");
        System.out.println(user);

        searchAndDestroy(user, utente1);

        System.out.println("Dopo la rimozione:");
        System.out.println(user);

    }

    // per il metodo non possiamo usare il ciclo for, perchè non si può modificare il set durante la lettura
// ma dobbiamo usare Iterator
    public static void searchAndDestroy(HashSet<String> user, String utente) {
// chiamo Iterator e lo applico a user
        Iterator<String> iterator = user.iterator();
        // iterator funziona con un while e con .hasNext( che và solo a verificare se è presente
        //l'elemento successivo.
        while (iterator.hasNext()) {
            // una volta verificato lo prende (tramite iterator.next) e lo andiamo ad utilizzare
            String element = iterator.next();
            // pongo la condizione che se l'elemento in esame è uguale a utente allora (con .remove)
            // verrà rimosso a fine giro.
            if (Objects.equals(element, utente)) {
                iterator.remove();
            }
        }
    }
}