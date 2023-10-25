
public class Logic1 {
    public static void main(String[] args) {
        int num1 = 32;
        int limiteInf = 20;
        int limiteSup = 50;
        System.out.println(num1 + " " + "è compreso tra: " + limiteInf + " " + "e " + limiteSup + "?" + result(num1,limiteInf,limiteSup));

    }
    public static boolean result (int x, int limiteInf,int limiteSup) {
        boolean range = x >= limiteInf && x <= limiteSup;
        return range;
    }


}
