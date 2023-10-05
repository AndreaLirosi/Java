public class Main {
    public static void main(String[] args) {
        Macchina car = new Macchina(1200, "RM00123" , "Fiat", "500");

        System.out.println(" la cilindrata è: " + car.getCilindrata());
        System.out.println(" la Targa è: " + car.getTarga());
        System.out.println(" la Marca è: " + car.getMarca());
        System.out.println(" il Modello è: " + car.getModello());

    }
}