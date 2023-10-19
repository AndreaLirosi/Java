public class Main {
    public static void main(String[] args) {
        double num = 5;
        check(num);
    }
    public static double division (double num) {
        return (num % 0);
    }
    public static void check (double n) {
        try {
            division(n);
            throw new ArithmeticException("divide per 0 ");
        }catch (ArithmeticException e ){
            System.out.println("Errore il numero è diviso per 0: " + e);
        }
    }
}