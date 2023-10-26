import java.util.AbstractMap;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        Article articolo1 = new Article("pasta",2);
        Article articolo2 = new Article("sugo",5);
        Article articolo3 = new Article("acqua",1);

        // Primo metodo
        Map<String,Article> mapArticle = new HashMap<>();

        mapArticle.put("carboidrati",articolo1);
        mapArticle.put("condimento",articolo2);
        mapArticle.put("bevanda",articolo3);

        System.out.println("1° metodo: \n" + mapArticle);

        //Secondo metodo usando map.of
        Map<String,Article> mapArticle2 = Map.of("carboidrati",articolo1,"condimento", articolo2, "bevanda",articolo3);

        System.out.println("2° metodo: \n" + mapArticle2);

        Map<String,Article> mapArticle3 = Map.ofEntries(
                new AbstractMap.SimpleEntry<>("carboidrati",articolo1),
                new AbstractMap.SimpleEntry<>("condimento",articolo2),
                new AbstractMap.SimpleEntry<>("bevanda",articolo3)
        );

        System.out.println("3° metodo: \n" + mapArticle3);

    }
}