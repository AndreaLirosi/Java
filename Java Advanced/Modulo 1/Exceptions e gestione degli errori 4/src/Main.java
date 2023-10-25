import java.util.Arrays;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        int [] arrayInt = new int[5];
        System.out.println(Arrays.toString(fillArray(arrayInt)));
        try {
            division(arrayInt, 0);
    } catch (Exception e ) {
            System.out.println("Errore: " + e);
        }
    }
    public static int [] fillArray (int [] arrE) {
        Random r = new Random();
        for (int i = 0; i < arrE.length; i++) {
            arrE[i] = r.nextInt(1, 20);
        }
        return arrE;
    }
    public static double division (int[] arr,int denominatore ) throws Exception {
        if (denominatore > 0) {
            double divElement;
            divElement = (arr[3] / denominatore);
            return divElement;
        }else throw new Exception ("Impossibile dividere per 0");

    }
}