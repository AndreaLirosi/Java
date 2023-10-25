
public class Main {
    public static void main(String[] args) {
    int n = 10; //questo sarà il mio limite
    System.out.println(sum(n)); //mi stampa il metodo con argomento n

    }
    public static int sum( int limit) {
            int counter = 0;    //imposto la variabile contatore
            int sum = 0;        //e la somma
        do {
            sum += counter; //somma sum con counter
            counter++;  //e itera di 1
            System.out.println(sum);    //per verificare se facesse tutto corretto
        }while (counter<limit);
        return sum;
    }

}
