import java.util.HashSet;

public class Main {
    public static void main (String[] args) {
        HashSet<String> user = new HashSet<String>();

        user.add("Andrea");
        user.add("Marco");
        user.add("Alberto");
        user.add("Elisa");

        String utente1 = "Alberto";
        String utente2 = "Anna";
    elementTest(user, utente1);
    elementTest(user, utente2);
    }
    public static boolean elementTest (HashSet<String> user, String utente) {
        boolean exist = user.contains(utente);
        if (exist) {
            System.out.println("l'oggetto è presente nel set");
        }else System.out.println("L'oggetto non è presente nel set");
        return false;
    }
}