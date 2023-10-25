import java.util.HashSet;

public class Main {
    public static void main(String[] args) {
        // creo un HashSet, un tipo di set, che sarà di tipo String e di nome cars
        HashSet<String> cars = new HashSet<>();
        cars.add("Fiat");
        cars.add("Volvo");
        cars.add("Mercedes");
        cars.add("Renault");
        cars.add("Seat");
        fillHashSet(cars);
        System.out.println("Il set contiene: " + cars.size() + " elementi");
    }

    public static void fillHashSet(HashSet<String> setEmpty) {
        for (String elementi : setEmpty) {
            System.out.println(elementi);
        }
    }
}