import java.sql.*;
import java.util.ArrayList;
public class Main {
    public static void main(String[] args) throws SQLException {
        ResultSet viewIt =ManagerDb.createViewIt();
        ResultSet viewGe = ManagerDb.createViewGe();

        ResultSet resultSetIt = ManagerDb.createStatement().executeQuery("select * from italianstudents");

        ResultSet resultSetGe = ManagerDb.createStatement().executeQuery("select * from germanstudents");

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