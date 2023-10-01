
public class Main {
    public static void main(String[] args) {
        char x = 'a';
        char y = 'b';
        sumChar(x, y);
    }
    // nel metodo sotto riportato inseriamo dei caratteri che vengono modificati da caratteri in numeri
    // i numeri sono del codice ASCII
    public static void sumChar (char x, char y) {
        int sum = (int) x + (int) y;
        System.out.println("la somma dei caratteri " + x + " e " + y + " " + "è: " + sum);
    }
}

