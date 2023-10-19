public class Main {
    public static void main(String[] args) {
        double num = 5;
        try {
            division(num);
            throw new ArithmeticException("divide per 0 ");
        }catch (ArithmeticException e ){
            System.out.println("Errore il numero è diviso per 0: " + e);
        }
    }
    public static double division (double num) {
        return (num % 0);
    }
}