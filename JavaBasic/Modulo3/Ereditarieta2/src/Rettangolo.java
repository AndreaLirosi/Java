public class Rettangolo extends Forma {
    // istanzio i dati del rettangolo
    private int base;
    private int altezza;
// creo il costruttore

    public Rettangolo (int base, int altezza) {

        this.base = base;
        this.altezza = altezza;
    }
@Override
    public int calcolaArea () {
        return (base * altezza);
    }

}
