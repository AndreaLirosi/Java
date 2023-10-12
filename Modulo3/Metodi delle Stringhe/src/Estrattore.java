// creiamo una classe che nominiamo Estrattore
public class Estrattore {
    // istanziamo le variabili che poi metteremo nel costruttore
    private String testo;
    private int index;
    public Estrattore (String testo, int index) {
    this.testo = testo;
    this.index = index;
    }
    // successivamente andiamo a formare il metodo:
// il metodo si struttura in un if, dove verifichiamo se l'indice è compreso nel testo
    public String searchUnicode (String test, int idx) {
        if (idx >= 0 && idx < test.length()) {
            // dopodiché trasformiamo, grazie ai metodi delle stringhe il valore di idx
    // nel corrispettivo char; usando charAt.
            char unicodeChar = test.charAt(idx);
    //creiamo un oggetto risultato dove mettiamo la frase da stampare.
            StringBuilder result = new StringBuilder();
            result.append("Il carattere all'indice ");
            result.append(idx);
            result.append(" è: ");
            result.append(unicodeChar);
// ci deve tornare una stringa
            return result.toString();
    }
        else return "Error";
}

}



