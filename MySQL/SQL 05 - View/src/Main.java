import java.sql.*;
import java.util.ArrayList;


public class Main {
    public static void main(String[] args) throws SQLException {
        Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/newdb", "developer@localhost", "pass1");
        Statement statementIt = connection.createStatement();
        Statement statementGe = connection.createStatement();
        //create view italianstudents select * from students where country = 'Italy'
        ResultSet resultSetIt = statementIt.executeQuery("select * from italianstudents");

        ResultSet resultSetGe = statementGe.executeQuery("select * from germanstudents");

        ArrayList<Student> italianStudents = new ArrayList<>();
        ArrayList<Student> germanStudents = new ArrayList<>();


        while (resultSetIt.next()) {

            italianStudents.add(new Student(resultSetIt.getString("first_name"), resultSetIt.getString("Last_name")));
        }
        while (resultSetGe.next()) {

            germanStudents.add(new Student(resultSetGe.getString("first_name"), resultSetGe.getString("Last_name")));
        }
        System.out.println(italianStudents);
        System.out.println(germanStudents);
    }

}