import java.sql.*;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) throws SQLException {

        Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/newdb", "developer@localhost", "pass1");
        Statement statement = connection.createStatement();

        ResultSet resultSet = statement.executeQuery("select * from students");
        ArrayList students = new ArrayList<>();
        while (resultSet.next()) {
            String student = "\n" + resultSet.getString("Last_name") + " " + resultSet.getString("first_name") + " " + resultSet.getString("country");
            students.add(student);


        }
        for (Object student : students) ;
        System.out.println(students);

    }
}