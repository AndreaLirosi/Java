
public class metodi_string {
    //dichiaro string, la lunghezza con testlenght e il print
    public static void main(String[] args) {
        String test = "supercalifragilistichespiralidoso";
        int lunghezza = testLenght(test);
        System.out.println("La lunghezza della Stringa è: " + lunghezza);
    }
//creo una funzione che mi conti le lettere usando.lenght;
    //metto lunghezza uguale a test.lenght e faccio il return per avere il risultato
    public static int testLenght(String test) {
        int lunghezza = test.length();
        return lunghezza;
    }
}
