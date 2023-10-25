public class Main {
    public static void main(String[] args) {
    // generiamo il testo e impostiamo l'indice
        String testo = "Testo di Prova";
        int index = 7;
// result è quindi uguale al metodo in Estrattore ma con i parametri di estratto.
        String result = Estrattore.searchUnicode(testo,index);
        System.out.println(result);
    }
}

