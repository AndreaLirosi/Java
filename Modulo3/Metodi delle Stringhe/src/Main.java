public class Main {
    public static void main(String[] args) {
    // generiamo il testo e impostiamo l'indice
        String testo = "Testo di Prova";
        int index = 7;
// creo l'oggetto con i parametri dati sopra di modo da inserirli nel metodo
        Estrattore estratto = new Estrattore(testo,index);
// result è quindi uguale al metodo in Estrattore ma con i parametri di estratto.
        String result = estratto.searchUnicode(testo,index);
        System.out.println(result);
    }
}

