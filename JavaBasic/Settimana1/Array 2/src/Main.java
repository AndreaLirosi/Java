
public class Main {

    public static void main(String[] args) {
        
        String testo = "Questo è un esempio di testo con alcune lettere 'a'.";
        char[] caratteri = testo.toCharArray(); //trasformo il testo in un array di caratteri
        stampaOccorrenze(caratteri);    //stampa l'array formato
    }

    public static void stampaOccorrenze(char[] caratteri) { // metodo che conta le a
        int conteggioA = 0;

        for (char carattere : caratteri) {  //il ciclo for "scorre" nell'array
            if (carattere == 'a') { //se incontra una "a" la conta
                conteggioA++;
            }
        }

        if (conteggioA > 0) {
            System.out.println("Numero di 'a' nel testo: " + conteggioA);
        } else {
            System.out.println("Nessuna occorrenza di 'a'");
        }
    }
}


