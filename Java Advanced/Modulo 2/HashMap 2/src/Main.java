import java.util.LinkedHashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        Article articolo1 = new Article("pasta",2);
        Article articolo2 = new Article("sugo",5);
        Article articolo3 = new Article("acqua",1);

        LinkedHashMap<String,Article> linkMapOrdinata = new LinkedHashMap<>();

        // inseriamo i dati nella map; questa, a differenza della hasmap, è in grado di
        //mantenere l'ordine degli elementi assegnati agli indici in cui sono stati inseriti.

        linkMapOrdinata.put("Carboidrati", articolo1);
        linkMapOrdinata.put("condimento", articolo2);
        linkMapOrdinata.put("bevanda", articolo3);

        // questo ciclo for, con la sua sintassi, consente di riempire il linkhasmap
        //con l'ordine di immissione.

        for (Map.Entry<String, Article> element: linkMapOrdinata.entrySet()){
            System.out.println("l'elemento: " + element);
        }
    }
}