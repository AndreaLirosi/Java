import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int lunghezza = 10;
        int[] array = new int[lunghezza];

        //creo un array predefinito con dei numeri
        int[] arrayNum = {1,2,2,3,4,5,5,6,7};

        newArray(array, arrayNum);
        //stampa array riempito dalla funzione newArray
        //for (int num : array) {
           // System.out.println(num);
        //}

        //stampa array senza duplicati
        System.out.println(Arrays.toString(removeDuplicate(array)));

    }

    public static void newArray(int[] arrE, int[] Numeri) {
        int indice = 0; //indice dell'array (arrayNum)
        for (int i = 0; i < Numeri.length; i++) {
            arrE[i] = Numeri[indice];   //all'indice dell'array vuoto verrà messo l'elemento in arrayNUm
            indice++;   // scorre l'indice dell'array (arrayNum)
        }
    }
    public static int[] removeDuplicate(int[] arrD) {
        int[] temp = new int[arrD.length];
        int indice = 0;

        for (int i = 0; i < arrD.length -1; i++) {
            if (arrD[i] != arrD[i + 1]) {
                temp[indice++] = arrD[i];

            } else {
                temp[indice++] = -1;
            }
        }
        return temp;
    }
}
