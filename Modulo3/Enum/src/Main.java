
public class Main {
    public static void main(String[] args) {
        Rettangolo rettangolo = new Rettangolo(3.5, 2, tipoRettangolo.rettangolo);
        Triangolo triangolo = new Triangolo (6, 8.5, tipoTriangolo.triangolo);
        System.out.println("il tipo di forma è: " + rettangolo.getTipo());
        System.out.println("il tipo di forma è: " + triangolo.getTipo());
        System.out.println(rettangolo.calcolaArea(rettangolo.getBase(), rettangolo.getAltezza()));
        System.out.println(triangolo.calcolaArea(triangolo.getBase(), triangolo.getAltezza()));
    }
}