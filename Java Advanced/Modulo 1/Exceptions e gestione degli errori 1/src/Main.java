import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Random numR = new Random();
        int limInf = 2;
        int limSup = 10;

        int randomNum = numR.nextInt(20);
        System.out.println("Numero casuale: " + randomNum);

        try {
            boolean isInRange = numInRange(randomNum, limInf, limSup);
            if (isInRange) {
                System.out.println("Il numero è nel range.");
            } else {
                System.out.println("Il numero non è nel range.");
            }
        } catch (ArithmeticException e) {
            System.out.println("Si è verificato un errore: " + e.getMessage());
        }
    }

    public static boolean numInRange(int num, int limInf, int limSup) {
        if (num >= limInf && num <= limSup) {
            return true;
        } else {
            throw new ArithmeticException("Il numero non è nel range");
        }
    }
}
