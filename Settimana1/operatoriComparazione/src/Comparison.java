
public class Comparison {
    //creo le variabili
    public static void main(String[] args) {
    int x = 10;
    int y = 7;
    System.out.println(x);
    System.out.println(y);
    System.out.println("x = y?: " + equal(x,y));

        }
//creo una funzione equal dove metto l'operatore di uguaglianza boolean
    public static boolean equal (int x, int y) {
        return (x == y);
    }
}
