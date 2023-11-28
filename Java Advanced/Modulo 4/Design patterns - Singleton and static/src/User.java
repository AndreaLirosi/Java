public class User {
    private String name;
    private int age;
    private static User user;

    public static User getUser () {
        if (user == null) {
            user = new User();
        }else {
            System.out.println("User exist");
        }
        return user;
    }

    public User() {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
    public void printUserInfo() {
        System.out.println("Nome: " + name);
        System.out.println("Età: " + age);
    }
}
