
public class Main {
    public static void main(String[] args) {
        int start = 10;
        int nIter = 5;
        calcolatore(start,nIter);
    }
// il ciclo for decrementa di un'unità fin quando il risultato è maggiore della differenza
    // tra start e le iterazioni
    public static void calcolatore (int start, int nIter) {
        for (int i=start; i> start - nIter; i--) {
            System.out.println(i);
        }   // poichè è void non serve il return
    }
}
