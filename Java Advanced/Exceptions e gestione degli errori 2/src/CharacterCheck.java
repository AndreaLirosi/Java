public class CharacterCheck {

    public static void main(String[] args) {
        char test = '7';

        chekChar(test);
    }

    public static void checkIfANumber(char test) throws Exception {
        if (test >= '0' && test <= '9') {
    // se vero prende l'eccezione che viene rimandato nel try e elaborato nel catch
            System.out.println("Il carattere è un numero.");
        } else {
            throw new Exception("Il carattere non è un numero");
        }
    }
    public static void chekChar (char car) {
        // andiamo a creare una gestione dell'errore, nel caso in cui il char sia un numero.
        //nel try andiamo ad inserire il richiamo della funzione.
        try {
            checkIfANumber(car);
            // il catch prenderà quindi in esame l'eccezione che manderà sul terminale
        } catch (Exception e) {
            System.out.println("L'Eccezione: " + e);
        }
    }


}
