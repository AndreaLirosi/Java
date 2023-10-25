
public class Main {
    public static void main(String[] args) {
        char x = 'a';
        char y = 'b';
        Confronto(x,y);


    }// nel metodo istanzio un valore boolean che dice la condizione vera di uguaglianza
    public static void Confronto(char x, char y) {
        boolean xyEquals = x == y;
        System.out.println("x è uguale a y? " + xyEquals );
    }
}

