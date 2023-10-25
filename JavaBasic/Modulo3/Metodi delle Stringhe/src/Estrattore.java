// creiamo una classe che nominiamo Estrattore
public class Estrattore {
    // successivamente andiamo a formare il metodo:
// il metodo si struttura in un if, dove verifichiamo se l'indice è compreso nel testo
    public static String searchUnicode (String test, int idx) {
        if (idx >= 0 && idx < test.length()) {
            // dopodiché trasformiamo, grazie ai metodi delle stringhe il valore di idx
    // nel corrispettivo char; usando charAt.
            int unicodeChar = test.charAt(idx);
    //creiamo un oggetto risultato dove mettiamo la frase da stampare.
            StringBuilder result = new StringBuilder();
            result.append("Il carattere all'indice ").append(idx)
                    .append(" è: ").append(unicodeChar);
// ci deve tornare una stringa
            return result.toString();
    }
        return "Error";
}

}



