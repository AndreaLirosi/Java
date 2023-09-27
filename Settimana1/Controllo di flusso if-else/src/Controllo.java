public class Controllo {
// creo una funzione StampFiBuzz con un primo if che controlla se num<=100
    //all'interno inserisco le altre condizioni con altri if (usare %)

    public static void StampFiBuzz (int num) {
        if (num<=100) {
    if (num % 3 == 0 && num % 5 == 0) {
        System.out.println(num + "FizzBuzz");
    } else if (num % 3 == 0) {
        System.out.println(num + "Fizz");
    } else if (num % 5 == 0) {
        System.out.println((num + "Buzz"));
//se nessuna delle condizioni è soddisfatta allora stampa semplicemente il numero
    }else {
        System.out.println(num);
    } StampFiBuzz(num + 1);     //aumenta il numero di 1
        }
        }
    public static void main (String[] args) {
        StampFiBuzz(1);         //voglio che la conta inizi da 1
    }
}

