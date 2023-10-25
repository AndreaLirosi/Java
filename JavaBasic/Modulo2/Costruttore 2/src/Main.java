public class Main {
    public static void main(String[] args) {
        Auto car = new Auto();
        car.setCilindrata(1200);
        car.setTarga("RM00123");
        car.setMarca("Fiat");
        car.setModello("500");


        System.out.println(car);
        System.out.println(" la cilindrata è: " + car.getCilindrata());
        System.out.println(" la Targa è: " + car.getTarga());
        System.out.println(" la Marca è: " + car.getMarca());
        System.out.println(" il Modello è: " + car.getModello());

    }
}