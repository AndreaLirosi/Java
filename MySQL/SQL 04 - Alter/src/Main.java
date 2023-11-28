import java.sql.ResultSet;
import java.sql.SQLException;

public class Main {
    public static void main(String[]args){
        alterTable();
        populateCountryDb();
        printColumn();

    }
    public static void alterTable ()  {
        try {
            String query = "ALTER TABLE students ADD COLUMN country VARCHAR(30)";
            ConnectDb.newStatement().executeQuery(query);
        }catch (SQLException e) {
            System.out.println("Error");
        }

    }
    public static void populateCountryDb () {
        alterTable();
        String query1 = "UPDATE students SET country = 'Italy' WHERE idStudents = 1";
        String query2 = "UPDATE students SET country = 'German' WHERE idStudents = 2";
        String query3 = "UPDATE students SET country = 'Italy' WHERE idStudents = 3";
        String query4 = "UPDATE students SET country = 'German' WHERE idStudents = 4";
        try {
            ConnectDb.newStatement().executeQuery(query1);
            ConnectDb.newStatement().executeQuery(query2);
            ConnectDb.newStatement().executeQuery(query3);
            ConnectDb.newStatement().executeQuery(query4);
        }catch (SQLException e) {
            System.out.println("Error");
        }

    }
    public static void printColumn () {
        try {
            ResultSet resultSet = ConnectDb.newStatement().executeQuery("SELECT * FROM students");

            while (resultSet.next()) {
                String lastName = (resultSet.getString("last_name"));
               String firstName = (resultSet.getString("first_name"));
               String country = (resultSet.getString("Country"));
                System.out.println(lastName + " " + firstName + " " + country);
            }
        }catch (SQLException e) {
            System.out.println("Error");
        }

    }

}

