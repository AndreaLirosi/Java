public class Main {

    public static void main(String[] args) {
        User user1 = User.getUser();
        User user2 = User.getUser();

        user1.printUserInfo();
        user2.setName("Mario");
        user2.setAge(28);
        user2.printUserInfo();
    }
}