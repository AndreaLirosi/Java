import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Random numR = new Random();
        int limInf = 2;
        int limSup = 10;
        System.out.println(numR.nextInt(1, 100));
        try {
            boolean isInRange = numInRange(numR.nextInt(), limInf, limSup);
            if (!isInRange){
                throw new ArithmeticException("il numero non è nel range");
            }
        }catch (Exception e) {
            System.out.println("Si è verificato un errore: " + e);
        }
    }
    public static boolean numInRange (int num, int limInf, int limSup) {
        if (num >= limInf && num <= limSup) {
        } else {
            return false;
        }
    }

    }