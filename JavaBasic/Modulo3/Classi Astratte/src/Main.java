public class Main {
    public static void main(String[] args) {
    Rettangolo rettangolo = new Rettangolo(4.5, 7);
    Trangolo trangolo = new Trangolo(4.5, 8);

    System.out.println(rettangolo.calcolaArea(rettangolo.getBase(), rettangolo.getAltezza()));
    System.out.println(trangolo.calcolaArea(trangolo.getBase(), trangolo.getAltezza()));

    }
}