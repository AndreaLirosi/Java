public class Main {
    public static void main(String[] args) {
        Rettangolo rettangolo = new Rettangolo(10, 5);
        Triangolo triangolo = new Triangolo(12, 18);
        int area = rettangolo.calcolaArea();
        int area1 = triangolo.calcolaArea();
        System.out.println("l'area del rettangolo è: " + area);
        System.out.println("l'area del Triangolo è: " + area1);
    }
}