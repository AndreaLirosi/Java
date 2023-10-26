import java.util.Objects;

public class Student {
    private String nome;
    private int age;

    public Student (String nome, int age) {
        this.nome = nome;
        this.age = age;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return age == student.age && Objects.equals(nome, student.nome);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nome, age);
    }

    @Override
    public String toString() {
        return "Student{" +
                "nome='" + nome + '\'' +
                ", age=" + age +
                '}';
    }
}
