
public class Caratteri {
    //imposto la variabile char (valida per singoli caratteri)

    public static void main(String[] args) {
        char operatore = '+';
        String tipOperatore = IDOper(operatore);    //nomino tipo string il return della funzione
        //così da poter stampare la frase sotto riportata
        System.out.println("Il carattere " + operatore + " è una " + tipOperatore);
    }
    // creo una funzione switch dove a seconda del caso, invece di stampare, rimanda una stringa
    // metto quindi i return e (sembra non servire il break) pongo a default il messaggio di errore
    public static String IDOper (char operatore) {
        switch (operatore){
            case '+':
                return "Addizione";
            case '*':
                return "Moltiplicazione";
            case '-':
                return "Sottrazione";
            case '/':
                return "Divisione";
            default:
                return "Errore ";
        }
    }
}