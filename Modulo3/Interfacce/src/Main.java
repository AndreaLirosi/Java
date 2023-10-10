public class Main {
    public static void main(String[] args) {
        Rettangolo rettangolo = new Rettangolo(3.5, 2);
        Trangolo trangolo = new Trangolo(6, 8.5);

        System.out.println(rettangolo.calcolaArea(rettangolo.getBase(), rettangolo.getAltezza()));
        System.out.println(trangolo.calcolaArea(trangolo.getBase(), trangolo.getAltezza()));
    }
}