public class Main {
    public static void main(String[] args) {
        Boolean numeratore = null;
        Boolean denominatore = null;

        try {
            if (numeratore == null) {
                throw new Exception("Il numeratore è null");
            } else {
                System.out.println("Il numeratore non è null");
            }
        } catch (Exception e) {
            System.out.println("Errore " + e);
        }
        try {
            if (denominatore == null) {
                System.out.println("Il denominatore è null");
            } else {
                System.out.println("Il denominatore non è null");
            }
        } catch (Exception e) {
            System.out.println("Errore" + e);


        }
    }
}