import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;

public class Main {
    public static void main(String[] args) {

        Student student1 = new Student("Tiziano", 30);
        Student student2 = new Student("Fabio", 31);
        Student student3 = new Student("Luca", 26);
        Student student4 = new Student("Andrea", 27);
        Student student5 = new Student("Raffaello", 20);
        Student student6 = new Student("Leonardo", 22);
        Student student7 = new Student("Marco", 33);
        Student student8 = new Student("Mario", 24);
        Student student9 = new Student("Chiara", 19);
        Student student10 = new Student("Sara", 18);
        Student student11 = new Student("Giulia", 26);
        Student student12 = new Student("Elena", 30);

        ArrayList<Student> listStudents = new ArrayList<>();
        listStudents.add(student1);listStudents.add(student2);listStudents.add(student3);
        listStudents.add(student4);listStudents.add(student5);listStudents.add(student6);
        listStudents.add(student7);listStudents.add(student8);listStudents.add(student9);
        listStudents.add(student10);listStudents.add(student11);listStudents.add(student12);

        System.out.println(listStudents);

    //ordiniamo la lista di oggetti usando i metodi sugli oggetti

        listStudents.sort(Comparator.comparing(Student :: getNome));
        System.out.println("lista ordinata per nome: \n" + listStudents);

    //ordiniamo la lista per l'età
//per entrambe abbiamo usato .sort(metodo delle liste) e Comparator, dove, come argomento
        //gli abbiamo passato la classe di riferimento (nel caso Student) e la variabile da confrontare (getAge)
        listStudents.sort(Comparator.comparing(Student :: getAge));
        System.out.println("lista ordinata per età: \n" + listStudents);
    }
}