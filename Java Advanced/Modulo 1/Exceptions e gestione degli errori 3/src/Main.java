public class Main {
    public static void main(String[] args) {
        double num = 5;
        double div = 0;
        check(num,div);
    }
    public static double division (double num, double div) throws Exception {
        if(div == 0) {
            throw new Exception("Diviso per 0");
        }
        else {
            return num/div;
        }
            }
    public static void check (double n, double d) {
        try {
            double result = division(n,d);
            System.out.println("Il risultato è: " + result);
        }catch (Exception e ){
            System.out.println("Errore: " + e.getMessage());
        }
    }
}