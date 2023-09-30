public class Main {
    public static void main(String[] args) {
        int lunghezzaArray = 10; // imposto una variabile che sarà la lunghezza del array
        char[] arrayFisso = new char[lunghezzaArray]; // Crea un array di caratteri.

        // creo un array di caratteri predefinito.
        char[] caratteri = {'a', 'b', 'c', 'd', 'a', 'f', 'g'};

        // richiamo la funzione arrayFill per riempire l'arrayFisso con i caratteri predefiniti.
        arrayFill(arrayFisso, caratteri);

        // stampo l'array di caratteri per vedere se ha riempito l'array vuoto
        System.out.println("Array di caratteri predefiniti:");
        for (char carattere : arrayFisso) { //for senza indice che stampa tutto (il nome carattere è solo per indicare
                                            // cosa stiamo stampando
            System.out.print(carattere + " ");
        }
        // richiamo la funzione per la conta e stampo il numero
        int conteggio = contaChar(arrayFisso);
        System.out.println("\nnum di a: " + conteggio);
    }
    // creo la funzione che riempie l'array (metto due argomenti; uno l'array vuoto e l'altro quello con i dati
    public static void arrayFill(char[] arrEmpty, char[] caratteri) {
        int indice = 0; // Inizializza l'indice nell'array predefinito.

        // inserisce nell' array i caratteri.
        for (int i = 0; i < arrEmpty.length; i++) {
            arrEmpty[i] = caratteri[indice]; //all'indice i sarà uguale a l'indice nell' array con i caratteri
            indice++; // Incrementa l'indice nell'array predefinito.

            // Riparte dall'inizio dell'array caratteri se abbiamo raggiunto la fine.
            if (indice == caratteri.length) {
                indice = 0;
            }
        }

    }
    public static int contaChar (char[] arrChar) {
        int contaA = 0; //la conta inizia da 0
        for (char c : arrChar) {    //visto che dobbiamo passare per ogni punto non serve l'indice
            if (c == 'a') { // se c è uguale al carattere 'a' lo conta
                contaA++;

            }
        }if (contaA == 0) { // se la conta di a è uguale a 0 stampa 0
            System.out.println("num di a: " + "0");
        }

        return contaA;  // vogliamo la conta
    }
}