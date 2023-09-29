
public class Main {
    public static void main(String[] args) {
        int[] numeri;          // dichiaro un array
        numeri = new int[10];  // creo un array vuoto composto da 10 elementi

        contatore(numeri); // chiamo il metodo per riempire l'array

        // //stampa gli elementi dell'array, dopo che questi sono stati assegnati in contatore
        for (int i = 0; i < numeri.length; i++) {
            System.out.print(numeri[i] + " ");
        }

        int sum = 0;    // fa la somma partendo da 0
        for (int i = 0; i < numeri.length; i++) {
            sum += numeri[i];
        }
        System.out.println("La somma degli elementi è: " + sum);
    }

    public static void contatore(int[] numeri) {
        for (int i = 0; i < numeri.length; i++) {
            numeri[i] = i + 1; // Riempio l'array con valori da 1 a 10
        }
    }
}






