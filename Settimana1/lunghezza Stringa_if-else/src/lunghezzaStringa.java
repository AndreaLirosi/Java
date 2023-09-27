
public class lunghezzaStringa {
    //dichiaro string, la lunghezza con testlenght e il print
    public static void main(String[] args) {
        String test = "supercalifragilistichespiralidoso";
        int lunghezza = testLenght(test);
        System.out.println("La lunghezza della Stringa è: " + lunghezza);
    }
    //creo una funzione che mi conti le lettere usando.lenght;
    // alla quale subentra una serie di condizioni con if/else per la lunghezza
    public static int testLenght(String test) {
        int lunghezza = test.length();
        if (lunghezza == 10) {
            System.out.println("lunghezza pari a 10 ");
        } else if (lunghezza > 10) {
            System.out.println("lunghezza maggiore di 10");
        }else {
            System.out.println("lunghezza minore di 10 ");
        }
        return lunghezza;   //avere la unghezza può essere una verifica in più
    }
}