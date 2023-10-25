
public class tabelline {
    public static void main(String[] args) {
        int base = 7;
        calcolatore (base); //richiamo la funzione nel main
    }

    public static void calcolatore (int base) {
    //il ciclo inizia da 0 e termina quando i = 10, e aumenta di un fattore pari a base
        for (int i=base; i <= (base*10); i = i+base) {
            System.out.println (i); // stampa il valore i per ogni iterazione
        }
    }
}
