import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        // scriviamo un array multidimensione
        int [] [] numeri = {{1,2,3,4,5}, {6,7,8,9,10}};
        // chiamo la funzione somma e stampo la somma
    System.out.println(somma(numeri));
    }
    public static int somma (int [] [] arr) {
        int sum = 0;
        // per ogni array somma tutti i valori
        for(int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                sum += arr[i][j];
            } System.out.println(Arrays.toString(arr[i]));
        }
        return sum;
    }
}

