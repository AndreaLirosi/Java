
public class week {
    public static void main(String[] args) {
        int valore = 7;
        System.out.println(giorno(valore));
    }
    //imposto la funzione giorno con switch
    //elenco i casi e pongo di stampare il giorno
    public static int giorno(int valore) {
        switch (valore) {
            case 1:
                System.out.println("è Lunedì");
                break;  //metto i break altrimenti me li stampa tutti
            case 2:
                System.out.println("è Martedì");
                break;
            case 3:
                System.out.println("è Mercoledì");
                break;
            case 4:
                System.out.println("è Giovedì");
                break;
            case 5:
                System.out.println("è Venerdì");
                break;
            case 6:
                System.out.println("è Sabato");
                break;
            case 7:
                System.out.println("è Domenica");
                break;
            //default non è necessario in questo caso poichè se non ci sono corrispondenze
            //la funzione mi darà solo il numero
        }
        return valore;
    }
}
