public class Main {
    public static void main(String[] args) {
        Builder builder = new Builder();
        builder.setFirstName("Andrea");
        builder.setLastName("Rossi");
        builder.setAge(30);
        builder.setAddress("via vai");
        Person person1 = builder.Build();
        builder.setFirstName("Mario");
        builder.setLastName("Bianchi");
        builder.setAge(26);
        builder.setAddress("corso di fretta");
        Person person2 = builder.Build();
        System.out.println(person1);
        System.out.println(person2);
    }
}