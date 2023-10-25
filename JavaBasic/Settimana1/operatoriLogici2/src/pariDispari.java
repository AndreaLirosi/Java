public class pariDispari {
    //dichiaro il numero da confrontare
    public static void main(String[] args) {
        int numero = 7;
    //uso il % che se da resto 0 allora è pari altrimenti è dispari
        //uso l'operatore ternario ? che prevede la codizione e i casi "vero" : "falso"
        String risultato = (numero % 2 == 0) ? "pari" : "dispari";
        System.out.println(numero + " è un numero " + risultato + ".");
    }
}
