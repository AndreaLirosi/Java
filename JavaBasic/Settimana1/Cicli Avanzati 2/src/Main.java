public class Main {
    public static void main(String[] args) {

        int limit = 10;
        calcolatore(limit);
    }

    public static void calcolatore(int limit) {
        for (int i = 0; i <= limit; i++) {
            if (i == 5) {
                continue;  // continue salta questo parametro e continua il ciclo
            }
            System.out.println(i);
        }

    }
}