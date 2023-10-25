public class Student {      //creo la classe immettendo i dati di cui è composta
    private final String name;
    private final String surname;
    private final int id;

    // creo un costruttore che sarebbe una funzione con lo stesso nome della classe
    // uso this. poiché permette di accedere all'istanza.
    public Student(String name, String surname, int id) {
        this.name = name;
        this.surname = surname;
        this.id = id;
    }
    public int getID () {
        return id;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", ID=" + id +
                '}';
    }




}
