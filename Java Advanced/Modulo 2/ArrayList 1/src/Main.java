import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        //inizializziamo gli oggetti studenti (basati sulla classe Student)
    Student studente1 = new Student("Aldo", 28);
    Student studente2 = new Student("Leonardo", 30);
    Student studente3 = new Student("Mario", 25);

        //List<Student> elenco = Arrays.asList(studente1,studente2,studente3);
        ArrayList<Student> elenco = new ArrayList<>();
        elenco.add(studente1);
        elenco.add(studente2);
        elenco.add(studente3);
        System.out.println("Elenco studenti: " + elenco);

        Student studente4 = new Student("Roberto", 22);
        Student studente5 = new Student("Patrizia", 25);
        Student studente6 = new Student("Laura", 20);
        Student studente7 = new Student("Chiara", 27);

        elenco.add(studente4);
        elenco.add(studente5);
        elenco.add(studente6);
        elenco.add(studente7);
        System.out.println("la nuova lista è: " + elenco);




    }
}