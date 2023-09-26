
public class Logic1 {
    public static void main(String[] args) {
        int num1 = 32;
        int num2 = 52;
        int limiteInf = 20;
        int limiteSup = 50;
        System.out.println("limite inf =" +limiteInf);
        System.out.println("limite sup =" +limiteSup);
        System.out.println("num1 è compreso nei limiti:" + result(num1,limiteInf,limiteSup));
        System.out.println("num2 è compreso nei limiti:" + result2(num2,limiteInf,limiteSup));
    }
    public static boolean result (int num1, int limiteInf,int limiteSup) {
        return (num1>limiteInf && num1<limiteSup);

    }
    public static boolean result2 (int num2, int limiteInf,int limiteSup) {
        return (num2>limiteInf && num2<limiteSup);

    }

}
