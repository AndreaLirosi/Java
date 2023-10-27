import java.util.*;

public class Main {
    public static void main(String[] args) {
        Article articolo1 = new Article("pasta", 2);
        Article articolo2 = new Article("sugo", 5);
        Article articolo3 = new Article("acqua", 1);

        LinkedHashMap<String, Article> linkMapOrdinata = new LinkedHashMap<>();

        // inseriamo i dati nella map; questa, a differenza della hasmap, è in grado di
        //mantenere l'ordine degli elementi assegnati agli indici in cui sono stati inseriti.

        linkMapOrdinata.put("Carboidrati", articolo1);
        linkMapOrdinata.put("condimento", articolo2);
        linkMapOrdinata.put("bevanda", articolo3);
        //il ciclo presenta: Map.Entry = è un interfaccia che rappresenta un singolo elemento in una mappa; utilizzata
// per rappresentare una coppia chiave-valore all'interno di una mappa.
//<String, Article> indicano gli argomenti della Map: il primo la Key, la seconda rappresenta la classe Article.
        // element è una variabile che diamo (come per il forEach)
// dopo i due punti diamo linkMapOrdinata (la nostra Map) e gli passiamo il metodo entrySet() questo  restituisce un insieme (set) di oggetti Map.Entry. Questo set contiene tutte le coppie chiave-valore presenti nella mappa.
        System.out.println("Map ordinata per immissione di oggetti\n");
        for (Map.Entry<String, Article> element : linkMapOrdinata.entrySet()) {
            String key = element.getKey();
            Article value = element.getValue();

            System.out.println("l'elemento: " + key + " ha valore\n" + value);
        }
// per ordinare i dati in base ad un valore (in questo caso il prezzo) dobbiamo, inanzitutto, andare a trasformare questa Map in una lista; con cui poi potremmo lavorare.
            List<Map.Entry<String, Article>> listArticoli = new ArrayList<>(linkMapOrdinata.entrySet());


// abbiamo quindi inizializzato una lista (arraylist) che prende gli argomenti di linkMapOridnata.

/* usiamo il metodo .sort delle collection per riodinare i singoli articoli in ordine di prezzo.
 la freccia -> è una Lambda che definisce come i due elementi della lista (listarticoli) debbano essere comparati per determinare l'ordine. i due entry sono oggetti di listArticoli.
 Integer.compare è la funzione che confornta le due variabili, .getValue.getPrezzo sono metodi che permetto di andare a pescare i valore (il primo) e il prezzo (il secondo); quest'ultimo l'oggetto del confronto.*/

        listArticoli.sort((entry1, entry2) -> Integer.compare(entry1.getValue().getPrezzo(), entry2.getValue().getPrezzo()));

        System.out.println("\nMap ordinata per prezzo crescente \n");
        for (Map.Entry<String, Article> entry : listArticoli) {
            String key = entry.getKey();
            Article value = entry.getValue();
            System.out.println("l'elemento: " + key + " ha valore\n" + value);
        }




            
        }
    }